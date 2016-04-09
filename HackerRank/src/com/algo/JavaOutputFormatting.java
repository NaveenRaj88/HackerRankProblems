package com.algo;

import java.util.Scanner;

public class JavaOutputFormatting {

	
	public static void main(String[] args) {
		
		float floatVar = 234.434f;
		int intVar = 4234;
		String stringVar = "efg";
		
//		System.out.format("The value of " + "the float variable is " +
//			     "%f, while the value of the " + "integer variable is %d, " +
//			     "and the string is %s", floatVar, intVar, stringVar); 
		
//		System.out.printf("%.10s%15s%03d", "jhgljhvdosdojfo"," ",10);
		
		
		Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1,x);
        }
        System.out.println("================================");
	}
}
