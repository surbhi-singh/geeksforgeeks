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
	        int num = scan.nextInt();
	        double sum = 0;
	        ArrayList<Integer> arr = new ArrayList<>();
	        int temp = num;
	        while(num>0){
	            arr.add(num%10);
	            num = num/10;
	        }
	        int len = arr.size();
	        for(int i=0; i<len; i++){
	            sum = sum + Math.pow(arr.get(i), len);
	        }
	        if((int)sum != temp)
	            System.out.println("No");
	        else
	            System.out.println("Yes");
	    }
	 }
}
