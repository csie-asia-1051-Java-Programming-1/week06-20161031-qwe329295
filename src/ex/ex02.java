package ex;
/*
 * Topic: 使用者輸入兩個整數，透過函數呼叫輸出排列組合函數 C(m,n)。公式: C(m,n) = m!/n!(m-n)!
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m =scn.nextInt();
		int n =scn.nextInt();
		System.out.println(a(m)/(a(n)*a(m-n)));
		
			
		}
	public static int a (int m){
		int b=1;
		for(int c=1;c<=m;c++){
			b=b*c;
		}
		return b;
	}
}
