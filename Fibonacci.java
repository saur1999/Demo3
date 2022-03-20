package org.cdacnoida.course.Loop;

public class Fibonacci { 
	
	static int i=0;
	static int j=1;
	static int k;
	
	static void show() {
		for(k=1;k<10;k++) { 
			System.out.println("Series =  "+i);
			int sum = i+j;
			i=j;
			j=sum;
			//System.out.println("Series =  "+i);
		}
	}

	public static void main(String[] args) {
		show();

	}

}
