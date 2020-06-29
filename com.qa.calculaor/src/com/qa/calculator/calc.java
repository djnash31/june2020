package com.qa.calculator;

import java.util.*;

public class calc {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number- ");
		int a = s.nextInt();
		System.out.print("Enter second number- ");
		int b = s.nextInt();
		int d = a + b;
		System.out.println("Total= " + d);

		Scanner e = new Scanner(System.in);
		System.out.print("Enter first number- ");
		int f = e.nextInt();
		System.out.print("Enter second number- ");
		int g = e.nextInt();
		int h = f - g;
		System.out.println("Total= " + h);

		Scanner i = new Scanner(System.in);
		System.out.print("Enter first number- ");
		int j = i.nextInt();
		System.out.print("Enter second number- ");
		int k = i.nextInt();
		int l = j / k;
		System.out.println("Total= " + l);

		Scanner m = new Scanner(System.in);
		System.out.print("Enter first number- ");
		int n = m.nextInt();
		System.out.print("Enter second number- ");
		int o = m.nextInt();
		int p = o * n;
		System.out.println("Total= " + p);
	}

}

