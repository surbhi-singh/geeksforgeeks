package hello;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int[] arr = new int[n];
		int i=0;
		for(i=0;i<n;i++)
		{
			arr[i] = scan.nextInt();
			
		}
		int x = scan.nextInt();
		System.out.println(binsearch(arr, 0, n-1, x));


	}
	public static int binsearch(int[] arr, int s, int n, int x)
	{
		if(arr[(n+s)/2] == x)
			return (s+n)/2;
		else if(arr[n/2] > x)
			return binsearch(arr, s, (s+n)/2, x);
		else
			return binsearch(arr, (s+n)/2+1, n, x);
	}

}
