package com.tap.project;

import java.util.Scanner;

public class FibnocciSeries {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print(fib(i)+" ");
		}
	}
	
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
}
