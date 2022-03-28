package day8;

import java.util.Scanner;

//Write a Java program to concatenate a given string to the end of another string
public class Q2 
{
	static String addString(String a,String b)
	{
		return a+ " "+ b;
	}
	
	public static void main(String[] args) {
 
  Scanner p= new Scanner(System.in);
  System.out.println("enter a strings");
  String s=p.nextLine(); 
  System.out.println("enter a strings");
  String r=p.nextLine();
  //String newstring= s+ " "+r;
  //System.out.println(newstring);
  
  String newString= Q2.addString(s,r);
  System.out.println(newString);
  
	}

}
