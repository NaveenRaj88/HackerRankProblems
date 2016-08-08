package com.algo;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatrixDiagonaldifference {

	public static void main(String[] args) {
		int a[][] = new int[][]{{11,2,4},{4,5,6},{10,8,-12}};
		int n=3;
		
		int pdiagonal = 0;
		int sdiagonal = n - 1;
		int pdiagonalSum = 0;
		int sdiagonalSum = 0;
		for (int i = 0; i < n; i++) {
			pdiagonalSum += a[i][i];
			sdiagonalSum += a[i][sdiagonal - i];
		}
		System.out.print(Math.abs(pdiagonal - sdiagonal));
	}
}