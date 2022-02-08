package jhi.seams.server.util;

import java.util.*;

public class CollectionUtils
{
	public static boolean isEmptyOrNull(Collection<?> collection) {
		// If the collection is null, or there aren't any objects in it or they're all null, return true
		return collection == null ||  collection.size() < 1 || collection.stream().filter(Objects::nonNull).findAny().isEmpty();
	}

	public static <T> boolean isEmptyOrNull(T[] array) {
		// If the array is null, or there aren't any objects in it or they're all null, return true
		return array == null ||  array.length < 1 || Arrays.stream(array).filter(Objects::nonNull).findAny().isEmpty();
	}
}
