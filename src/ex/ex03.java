﻿package ex;
/*
 * Topic: 輸入一串數字，寫出一數字拆解函數decomp(n)，將其個別數字用空白分開。例如:輸入128917178, 則輸出1 2 8 9 1 7 1 7 8
 * Date: 2016/10/31
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		decomp(n);

	}
public static void decomp(int a){
	String str =Integer.toString(a);
	for(int i=0;i<str.length();i++){
		System.out.print(str.charAt(i)+" ");
	}
}
}
