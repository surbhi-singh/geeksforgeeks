import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    while(t-- > 0){
	        int size = scan.nextInt();
	        int[] arr = new int[size];
	        for(int i=0; i<size; i++){
	            arr[i] = scan.nextInt();
	        }
	        for(int i=0, j=size-1; i<j; i++, j--){
	            if(arr[i] == 1){
	                if(arr[j] == 0){
	                    arr[j] = 1;
	                    arr[i] = 0;
	                }
	                else{
	                    i--;
	                }
	            }
	            else if(arr[j] == 0){
	                if(arr[i] == 1){
	                    arr[i] = 0;
	                    arr[j] = 1;
	                }
	                else{
	                    j++;
	                }
	            }
	        }
	        for(int i=0; i<size; i++)
	            System.out.print(arr[i]+" ");
	        System.out.println();
	    }
	 }
}
