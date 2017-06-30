package main.java;

import java.util.Scanner;

public class pos {
private static Scanner sc;

public static void main(String args[])
{
	sc = new Scanner(System.in);
	int a;
	System.out.println("Enter the number");
	a=sc.nextInt();
	if(a>=1)
	{
		System.out.println("positive");
	}
	else if(a<0)
	{
		System.out.println("negative");
	}
	else if(a==0)
	{
		System.out.println("Zero");
	}
}
}
