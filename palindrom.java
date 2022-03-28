package day7;

public class palindrom {

	public static void main(String[] args) {
	 
		String m= "abcdycba";
		int i,j=0;
		int flag=0;
		for( i=0  , j=m.length()-1  ;   i<m.length()/2 ; i++ ,j--)
		
		{
			if(m.charAt(i)!= m.charAt(j))
			{
				flag=1;
				System.out.println("not palindrom");
				break;
			}
		}
		
		if(flag==0)System.out.println("its palindrom");
		 
			
	}

}
