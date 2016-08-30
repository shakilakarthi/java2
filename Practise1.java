import java.util.Scanner;


public class Practise1 {

	
	public static void main(String[] args) {
	        
	        System.out.println("Enter the string :");
	        Scanner in=new Scanner(System.in);
	        String s=in.next();
	        String s1[]=s.split(" ");
	        StringBuffer sb=new StringBuffer();
	        int n=s1.length;
	        for(int i=n-1;i>0;i--)
	        {
	        	System.out.println(s1[i]);
	        }
	        

	}

}
