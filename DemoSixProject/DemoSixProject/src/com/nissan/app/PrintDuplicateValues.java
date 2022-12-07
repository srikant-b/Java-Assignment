package com.nissan.app;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 3, 4, 9, 5, 4, 9};
		
		Map<Integer, Integer> intMap = new HashMap<>();
		
		for(int i = 0; i < intArr.length; i++) {
			if(intMap.containsKey(intArr[i])) {
				int value = intMap.get(intArr[i]) + 1;
				intMap.put(intArr[i], value);
			} else {
				intMap.put(intArr[i], 1);
			}
		}
		
		System.out.println("Duplicate values in the array are: ");
		for (Integer map : intMap.keySet()) {
			if(intMap.get(map) > 1) {
				System.out.println(map);
			}
		}

	}

}
