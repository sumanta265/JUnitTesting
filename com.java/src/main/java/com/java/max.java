package com.java;

public class max {

	
	public static int findMax(int arr[])
	{
		int max=arr[0];//{1,5,8,,9,10}
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
				max=arr[i];
			
		}
		
		return max;	
	}
	
	
	
	public static int add(int x,int y)
	{
		
		return x+y;
		
		
	}
	public static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    
	
	
}
