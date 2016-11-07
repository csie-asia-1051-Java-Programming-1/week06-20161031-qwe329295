package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m= scn.nextInt();
		double n =scn.nextDouble();
		
		fun(n,m);

	}
public static void fun(double n , int m){
	if(m==1){
		n=((n-170)*(0.6d))+62;
	}
	if(m==2){
		n=((n-158)*(0.5d))+52;
	}
	System.out.print(n);
}
}
