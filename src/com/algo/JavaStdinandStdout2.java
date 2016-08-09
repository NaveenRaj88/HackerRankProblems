package com.algo;

import java.util.Scanner;

public class JavaStdinandStdout2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        //Complete this code
        Double y = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
	}
}
