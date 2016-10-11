package hello;

import java.util.Scanner;

class sorter{
	public int sort(int arr[], int low, int high)
	{
		int pivot = high;
		int i = low;
		for(int j = low; j< high;j++)
		{
			if(arr[j] <= arr[pivot])
			{
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
			
		}
		int temp = arr[i];
		arr[i] = arr[pivot];
		arr[pivot] = temp;
		return i;
	}
	public void partition(int arr[], int low, int high)
	{
		if(low < high)
		{
			int p = sort(arr, low, high);
		
		partition(arr, low, p-1);
		partition(arr, p+1, high);
		}
		
	}
}

public class quickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n;i++)
		{
			arr[i] = scan.nextInt();
			
		}
		sorter s = new sorter();
		s.partition(arr, 0, n-1);
		for(int i = 0;i<n;i++)
			System.out.println(arr[i]);
		scan.close();

	}

}
