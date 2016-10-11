package hello;

import java.util.Scanner;

public class selectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++)
			arr[i] = scan.nextInt();
		int min = -32768;
		for(int i = 0;i<n;i++)
		{
			min = arr[i];
			for(int j=i+1;j<n;j++)
			{
				if(arr[j] < min)
				{
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
					
			}
		}
		for(int i =0;i<n;i++)
			System.out.print(arr[i]+" ");

	}

}
