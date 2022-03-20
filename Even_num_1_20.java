package org.cdacnoida.course.Loop;

public class Even_num_1_20 {
      
	static int i;
	
	static void show() {
		for(i=1;i<=20;i++) {
			
			if(i%2==0) {
				System.out.println("Even Number  = "+i);
			}
		}
	}
	public static void main(String[] args) {
		show();

	}

}
