package maths;
import java.util.Scanner;
import java.lang.Math;

public class PrimeNumber {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		int root;
		int flag=0;
		
		System.out.println("Enter the value of n....!!!");
		n = sc.nextInt();
		
		
		root = (int) Math.sqrt(n);
		for(int i = 2;i<root;i++)
		{
			if(n%i==0)
			{
				flag = 1;
			break;
			}
			
		}
		if(flag==0)
			System.out.println("number is prime");
		else
			System.out.println("number is not prime");
		
	}

}
