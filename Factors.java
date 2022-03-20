package org.cdacnoida.course.Loop;

import java.util.Scanner;

public class Factors {
  
	static int i;
	static int j;
	static int sum ;
	static int mul=1;
	
	static void show() {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter The Number ");
		i= s.nextInt();
		s.close();
	}
	
	static void print() { 
		for(j=1;j<=i;j++) {
			
			
			mul = mul*j;
			
			System.out.println(mul);
		}
		
	}
	public static void main(String[] args) {
		show();
		print();

	}

}
