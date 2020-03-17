package com.lucas.test.ex65;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Vector;

import org.junit.Test;

import com.lucas.test.ex65.MatrixAnalizer;

public class MatrixPrinterTest {
	
	MatrixAnalizer matrixPrinter = new MatrixAnalizer();
	
	
	Integer mat1[][] ={	{1, 2, 3, 4, 5},
						{6, 7, 8, 9, 10},
						{11, 12, 13, 14, 15},
						{16, 17, 18, 19, 20}
					};
	
	Integer mat2[][] ={	{1, 2, 3, 4, 5, 21},
						{6, 7, 8, 9, 10, 22},
						{11, 12, 13, 14, 15, 23},
						{16, 17, 18, 19, 20, 24}
		};

	@Test
	public void test() {
		Vector<Integer> expected = new Vector<Integer>(Arrays.asList(1,2,3,4,5,10,15,20,19,18,17,16,11,6,7,8,9,14,13,12));			
		Vector<Integer> res = matrixPrinter.getClockwise(mat1);
		assertEquals(expected, res);
		
		expected = new Vector<Integer>(Arrays.asList(1,2,3,4,5,21,22,23,24,20,19,18,17,16,11,6,7,8,9,10,15,14,13,12));			
		res = matrixPrinter.getClockwise(mat2);
		assertEquals(expected, res);
		
	}
	
}
