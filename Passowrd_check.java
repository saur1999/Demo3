import java.util.Scanner;

public class Passowrd_check {
   int p =1234; 
   int password;
   int i=1;
   char c;
    
   void Show() {
	   Scanner s = new Scanner(System.in);
	   System.out.println("Enter name");
	   c=s.next().charAt(c);
	   
	  System.out.println("Enter The Password");
	   password = s.nextInt();
	  
   }
   void print() {
	   if(password !=1234) {
		   do
		   {
			   System.out.println("Enter correct passowrd");
			   Scanner s = new Scanner(System.in);
			   password = s.nextInt(); 
			   i++;
		   }while(i<=3);
		   System.out.println("Your card is blocked");
	   }
		   else  {
			   System.out.println(" Accpeted");
			 //  i++;
		   } 
		  
	   }
   
	public static void main(String[] args) {
		Passowrd_check e = new Passowrd_check();
		e.Show();
		e.print();

	}

}
