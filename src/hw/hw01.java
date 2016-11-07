package hw;
import java.util.*;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double n =scn.nextDouble();
		int m =scn.nextInt();
		fun(n,m);
		

	}
public static void fun(double n,int m){
	if(m==1){
		n=(n-32)*(5d/9d);
	}
	if(m==2){
		n=n*9d/5d+32;
	}System.out.print(n);
}
}
