DROP VIEW IF EXISTS `view_dataset_meta`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_dataset_meta` AS select `seams`.`datasets`.`id` AS `dataset_id`,`seams`.`datasets`.`name` AS `dataset_name`,`seams`.`sites`.`name` AS `site_name`,`seams`.`sites`.`latitude` AS `latitude`,`seams`.`sites`.`longitude` AS `longitude`,`seams`.`dataset_meta`.`tillage` AS `tillage`,`seams`.`dataset_meta`.`fertilizer` AS `fertilizer`,`seams`.`dataset_meta`.`herbicide` AS `herbicide`,`seams`.`dataset_meta`.`farm_management` AS `farm_management`,`seams`.`dataset_meta`.`weed_cover` AS `weed_cover`,`seams`.`dataset_meta`.`disease` AS `disease`,`seams`.`dataset_meta`.`pests` AS `pests`,`seams`.`dataset_meta`.`soil_health` AS `soil_health`,`seams`.`dataset_meta`.`biodiversity` AS `biodiversity`,`seams`.`dataset_meta`.`crop_purpose` AS `crop_purpose`,`seams`.`dataset_meta`.`sowing_date` AS `sowing_date`,`seams`.`dataset_meta`.`harvest_date` AS `harvest_date`,json_arrayagg(`t`.`names`) AS `component_names`,json_arrayagg(`t`.`ids`) AS `component_ids` from (((`seams`.`datasets` left join (select distinct `seams`.`components`.`id` AS `ids`,lower(trim(`seams`.`components`.`crop_name`)) AS `names`,`seams`.`measurements`.`dataset_id` AS `dataset_id` from ((`seams`.`measurements` left join `seams`.`measurement_components` on((`seams`.`measurements`.`id` = `seams`.`measurement_components`.`measurement_id`))) left join `seams`.`components` on((`seams`.`components`.`id` = `seams`.`measurement_components`.`component_id`)))) `t` on((`t`.`dataset_id` = `seams`.`datasets`.`id`))) left join `seams`.`sites` on((`seams`.`sites`.`id` = `seams`.`datasets`.`site_id`))) left join `seams`.`dataset_meta` on((`seams`.`dataset_meta`.`dataset_id` = `seams`.`datasets`.`id`))) group by `seams`.`datasets`.`id`;

DROP VIEW IF EXISTS `view_measurement_components`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_measurement_components` AS SELECT JSON_ARRAYAGG(`components`.`id`) AS `component_ids`, `measurements`.`id` AS `measurement_id`, `measurements`.`dataset_id` AS `dataset_id`, `traits`.`id` AS `trait_id`, `traits`.`name` AS `trait_name`, `units`.`id` AS `trait_unit_id`, `units`.`name` AS `trait_unit_name`, `measurements`.`measurement` AS `measurement`, `measurements`.`measurement_type` AS `measurement_type`, `measurements`.`created_on` AS `created_on` from `measurements` left join `measurement_components` ON `measurements`.`id` = `measurement_components`.`measurement_id` left join `components` ON `components`.`id` = `measurement_components`.`component_id` left join `traits` ON `traits`.`id` = `measurements`.`trait_id` left join `units` ON `units`.`id` = `measurements`.`trait_unit_id` GROUP BY `measurements`.`id`;

DROP VIEW IF EXISTS `view_dataset_data`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_dataset_data` AS SELECT `datasets`.`id` AS `dataset_id`, `datasets`.`name` AS `dataset_name`, `sites`.`name` AS `site_name`, `sites`.`latitude` AS `latitude`, `sites`.`longitude` AS `longitude`, `dataset_meta`.`tillage` AS `tillage`, `dataset_meta`.`fertilizer` AS `fertilizer`, `dataset_meta`.`herbicide` AS `herbicide`, `dataset_meta`.`farm_management` AS `farm_management`, `dataset_meta`.`weed_cover` AS `weed_cover`, `dataset_meta`.`disease` AS `disease`, `dataset_meta`.`pests` AS `pests`, `dataset_meta`.`soil_health` AS `soil_health`, `dataset_meta`.`biodiversity` AS `biodiversity`, `dataset_meta`.`crop_purpose` AS `crop_purpose`, `dataset_meta`.`sowing_date` AS `sowing_date`, `dataset_meta`.`harvest_date` AS `harvest_date`, ( SELECT json_arrayagg( concat( `components`.`crop_name`, ' ', `components`.`variety_name` ) ) FROM `components` LEFT JOIN `measurement_components` ON `measurement_components`.`component_id` = `components`.`id` WHERE `measurement_components`.`measurement_id` = `measurements`.`id` GROUP BY `measurement_components`.`measurement_id` ) AS `components`, max( IF( (`measurements`.`trait_id` = (SELECT `id` from `traits` WHERE `traits`.`name` = 'Sowing rate')), `measurements`.`measurement`, NULL ) ) AS `sowing_rate`, max( IF( (`measurements`.`trait_id` = (SELECT `id` from `traits` WHERE `traits`.`name` = 'Yield')), `measurements`.`measurement`, NULL ) ) AS `yield`, `measurements`.`measurement_type` AS `measurement_type` FROM `measurements` LEFT JOIN `datasets` ON `datasets`.`id` = `measurements`.`dataset_id` LEFT JOIN `sites` ON `sites`.`id` = `datasets`.`site_id` LEFT JOIN `dataset_meta` ON `dataset_meta`.`dataset_id` = `datasets`.`id` GROUP BY `datasets`.`id`, `components`, `measurements`.`measurement_type`;