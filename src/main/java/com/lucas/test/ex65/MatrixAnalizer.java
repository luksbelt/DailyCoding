package com.lucas.test.ex65;

import java.util.Vector;

public class MatrixAnalizer {

	
	public Vector<Integer> getClockwise(Integer mat[][]) {
		
		Vector<Integer> res = new Vector<Integer>();
		int m= mat.length,n = mat[0].length; 
		int i=0,j =0, k,l,h=m;

		for(i=0; i<m/2; i++) {
			
			for(j=i; j<n-i; j++) {
				res.add(mat[i][j]);
			}
			
			for(k=i+1; k<m-i; k++) {
				res.add(mat[k][j-1]);
				
			}
			for(l=n-i-1; l>i; l--) {
				res.add(mat[k-1][l-1]);
			}
			
			for(h=m-i-1; h>i+1; h--) {
				res.add(mat[h-1][l]);
			}
		}
		
		return res;
		
	}

}
