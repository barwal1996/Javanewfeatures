package com.tlc.www;

import java.util.Locale;
public class TestJava7 {
	public static void main(String[] args){
		int binary= 0b1000;
		int a= 1_00_000;
		System.out.println(binary);
		System.out.println(a);
		System.out.println(Locale.getDefault());
		Locale l1 = new Locale("English","INDIA");
		System.out.println(l1);
		System.out.println(l1.getDisplayCountry());
		System.out.println(l1.getDisplayLanguage());
	
	}	
}
