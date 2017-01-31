import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void print(int[] arr, int[] value, int[] parent)
	{
		int pos = -1, max = -1;
		for(int i = 0; i< value.length; i++)
		{
			if(max < value[i])
			{
				max = value[i];
				pos = i;
			}
		}
		System.out.println("The length of LIS is: "+ max);
		Stack s = new Stack();
		while(pos != -1)
		{
			s.push(arr[pos]);
			pos = parent[pos];
		}
		while(!s.empty())
		{
			System.out.print(s.pop().toString());
			System.out.print(" ");
		}
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int[] arr = {50, 3, 10, 7, 40, 80};
		int[] value = new int[arr.length];
		int[] parent = new int[arr.length];
		for(int i = 0;i<arr.length; i++)
		{
			value[i] = 1;
			parent[i] = -1;
		}
		for(int i =1; i<arr.length; i++)
		{
			for(int j = i-1; j>= 0; j--)
			{
				if(arr[i] > arr[j] && value[i] < value[j] + 1)
				{
					value[i] = value[j] + 1;
					parent[i] = j;
				}
			}
		}
		print(arr, value, parent);
	}
}