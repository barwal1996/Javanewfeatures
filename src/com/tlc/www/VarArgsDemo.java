package com.tlc.www;

public class VarArgsDemo {
	static void display(int num,String... values){
	System.out.println("Display method invoked :" +num);
	for(String s:values){
		System.out.println(s);
	}
	}
	public static void main(String[] args) {
		display(10);
		display(11,"Hello");
		display(12,"Java","New","Features");

	}

}
