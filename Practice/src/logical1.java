import java.util.Scanner;

public class logical1 {
public static void main(String[] args) {
	int large=0;
	int small=0;
	Scanner scr=new Scanner(System.in);
	int n=scr.nextInt();
	
	for(int i=0;i<n;i++)
	{
		int num=scr.nextInt();
		if(num>large)
		{
			large=num;
		}
		 if(i==0&&num>0)
			{
		        small=num;
			}
		if(num<small)
		{
			small=num;
		}
		}
	System.out.println(large);
	System.out.println(small);
	}
}

