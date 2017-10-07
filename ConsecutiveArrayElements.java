import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
		    int size = scan.nextInt();
		    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum=0;
		    for(int i=0; i<size; i++){
		        int temp = scan.nextInt();
		        sum+=temp;
		        if(temp > max)
		            max = temp;
		        if(temp < min)
		            min = temp;
		    }
		    if(((max*(max+1))/2 - ((min-1)*min)/2) == sum)
		        System.out.println("Yes");
		    else
		        System.out.println("No");
		}
	}
}
