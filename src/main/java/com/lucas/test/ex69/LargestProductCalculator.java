package com.lucas.test.ex69;

import java.util.Arrays;

public class LargestProductCalculator {

	
	public double calculateSingleloop(int[] arr) {
		
		int max1 = 0,max2=0,max3=0;
		int low1=0,low2=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max1) {
				max1 = arr[i];
			}
			else {
				if(arr[i] > max2) {
					max2 = arr[i];
				}
				else {
					if(arr[i] > max3) {
						max3 = arr[i];
					}
					else {
						if(arr[i] < low1) {
							low1 = arr[i];
						}
						else {
							if(arr[i] < low2) {
								low2 = arr[i];
							}
						}
					}
				}
			}
		}
		
		return Math.max(low1 * low2 * max1, max1 * max2 *max3);
	}
	
	public double calculateWithSorting(int[] arr) {
		
		Arrays.sort(arr);
		return Math.max(arr[0] * arr[1] * arr[arr.length-1], arr[arr.length-1] * arr[arr.length-2] * arr[arr.length-3]);
	}
	
}
