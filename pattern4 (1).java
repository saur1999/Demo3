package day8;
/*       ABCDEDCBA
 *       ABCD DCBA
 *       ABC   CBA
 *       AB     BA
 *       A       A
 * 
 */
public class pattern4 {

	public static void main(String[] args) {
		 
		int i,j,k,space=0;
		char r='A';
		for(i=1;i<=5;i++)
		{
			r='A';
			for(j=5;j>i;j--)       
			{                       
				System.out.print(r);
				r++;
			}
			for(int l=1;l<=space;l++)System.out.print(" ");
			
			for(j=5;j>i;j--)
			{  r--;
				System.out.print(r);
			}
			space=space+2;
			System.out.println();
		}
	}

}
