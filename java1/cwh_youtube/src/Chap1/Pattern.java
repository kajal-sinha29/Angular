package Chap1;

public class Pattern {
	
	public static void main(String[] args) {
	    int n = 5, k = 0;

	    for (int i = 1; i <= n; i++,k=0)
	    {
	      for (int j = 1; j <= n - i; j++)
	      {
	        System.out.print("  ");
	      }

	      for(k=1;k<=2*i-1;k++)
	      {
	        System.out.print("* ");
	        
	      }

	      System.out.println();
	    }
	  }
	}