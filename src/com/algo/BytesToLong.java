package com.algo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

public class BytesToLong {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		byte[] by = new byte[1];
		System.out.println(15 >> 1);
		System.out.println(Math.floor(15/2));
		
		ArrayList<String> list = new ArrayList<>(100); // capacity 100, size 0
//		list.set(10, ""); // no element 0 yet
		
		Integer a = 127;
		Integer b =127;
		System.out.println(a==b);
		
		Class c1 = Integer.class;
		System.out.println(c1.getFields()[0].getName());
		for (Constructor<Integer> cons : c1.getConstructors()) {
			System.out.println(cons.getName());
			System.out.println(Arrays.toString(cons.getParameterTypes()));
			System.out.println(cons.getModifiers());
			Modifier.isPublic(cons.getModifiers());
		}
		System.out.println(c1);
		
		int[] i = new int[3];
		
	}
}
