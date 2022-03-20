package org.cdacnoida.course.Loop;

import java.util.Scanner;

public class Table { 
	
	static int i;
	static int j;
	static int sum;
	 
	
	static void show() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		i =s.nextInt();
		s.close();
	}
	
	static void print() {
		
		for(j=1;j<=10;j++) {
			
			sum = i*j;
			System.out.println(sum);
			
		}
	}

	public static void main(String[] args) {
		show();
		print();

	}

}
