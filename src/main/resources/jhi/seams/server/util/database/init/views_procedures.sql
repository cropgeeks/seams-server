DROP VIEW IF EXISTS `view_dataset_meta`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_dataset_meta` AS SELECT datasets.id AS `dataset_id`, datasets.name AS `dataset_name`, sites.name AS `site_name`, sites.latitude, sites.longitude, dataset_meta.tillage, dataset_meta.fertilizer, dataset_meta.herbicide, dataset_meta.farm_management, dataset_meta.weed_cover, dataset_meta.disease, dataset_meta.pests,dataset_meta.soil_health, dataset_meta.biodiversity, dataset_meta.cover_crop, dataset_meta.sowing_date, dataset_meta.harvest_date, JSON_ARRAYAGG(t.names) as `component_names`, JSON_ARRAYAGG(t.ids) as `component_ids` FROM datasets LEFT JOIN (SELECT DISTINCT components.id AS ids, LOWER(TRIM(components.crop_name)) AS names, measurements.dataset_id FROM measurements LEFT JOIN measurement_components ON measurements.id = measurement_components.measurement_id LEFT JOIN components ON components.id = measurement_components.component_id) AS t ON t.dataset_id = datasets.id LEFT JOIN sites ON sites.id = datasets.site_id LEFT JOIN dataset_meta ON dataset_meta.dataset_id = datasets.id GROUP BY datasets.id;

DROP VIEW IF EXISTS `view_measurement_components`;
CREATE ALGORITHM = UNDEFINED SQL SECURITY DEFINER VIEW `view_measurement_components` AS SELECT JSON_ARRAYAGG(`components`.`id`) AS `component_ids`, `measurements`.`id` AS `measurement_id`, `measurements`.`dataset_id` AS `dataset_id`, `traits`.`id` AS `trait_id`, `traits`.`name` AS `trait_name`, `units`.`id` AS `trait_unit_id`, `units`.`name` AS `trait_unit_name`, `measurements`.`measurement` AS `measurement`, `measurements`.`measurement_type` AS `measurement_type`, `measurements`.`created_on` AS `created_on` from `measurements` left join `measurement_components` ON `measurements`.`id` = `measurement_components`.`measurement_id` left join `components` ON `components`.`id` = `measurement_components`.`component_id` left join `traits` ON `traits`.`id` = `measurements`.`trait_id` left join `units` ON `units`.`id` = `measurements`.`trait_unit_id` GROUP BY `measurements`.`id`;