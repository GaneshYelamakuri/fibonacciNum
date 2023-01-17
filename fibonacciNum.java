package com.jsp.Numberpack;

import java.util.Scanner;

class fibonacci
{
	public void getnum(int num) 
    {
		int a=0,b=1;
		int c=0;
		
		int count=num;
	    System.out.println(a);
	    System.out.println(b);
     	for(int i=2;i<count;i++)
		{
     		c=a+b;
     		System.out.println(c);
     		a=b;
     		b=c;
     	}
		
	}
}
public class fibonacciNum {
	public  static void main(String [] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println(" Fibonacci series :");
		System.out.println("Enter the count:");
		int num=scn.nextInt();
		
		
    	fibonacci fib = new fibonacci();
	    fib.getnum(num);
	   
		
		
	}

}
