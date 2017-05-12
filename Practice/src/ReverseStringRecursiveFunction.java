import java.util.Scanner;

public class ReverseStringRecursiveFunction {
	String  revstr="";
	 String reverse(String str)
	{
		String revstr=ReverseLogic(str,str.length()-1);
		return revstr;
		
	}

	String ReverseLogic(String str, int ind) {
		if(ind>=0)
		{
			 revstr +=  str.charAt(ind);
             ind--;
		 ReverseLogic(str,ind);
		}
		
		return revstr;
	}
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		ReverseStringRecursiveFunction rs=new ReverseStringRecursiveFunction();
		String reverse1=rs.reverse(scr.next());
		System.out.println(reverse1);
		
	}

}
