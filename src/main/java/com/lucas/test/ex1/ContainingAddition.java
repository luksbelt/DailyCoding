package com.lucas.test.ex1;

import java.util.HashSet;
import java.util.Set;

public class ContainingAddition {
	
	public boolean calculate(int[] arr, int k) {
		
		Set<Integer> aux = new HashSet<Integer>();
 		for(int i=0; i<arr.length; i++) {
			if(arr[i] < k) {
				if (aux.contains(arr[i])) {
					return true;
				}
				aux.add(k - arr[i]);
			}
		}
		
		
		return false;
		
	}

}
