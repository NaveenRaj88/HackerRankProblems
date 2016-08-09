package com.algo;

public class FindMaxAndMinInArray {

	
	public static void main(String[] args) {
		double[] values = {1.0,0.5,-3.0,7.0,-0.02};
		double min = Double.POSITIVE_INFINITY;
		double max = Double.NEGATIVE_INFINITY;
		for (double v : values)
		{
		if (v<min) min = v;
		if (v>max) max = v;
		}
		System.out.println("max ="+max+"  min ="+min);
	}
}
