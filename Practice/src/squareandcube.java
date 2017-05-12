import java.util.Scanner;

public class squareandcube {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	int x=scr.nextInt();
	int square=0;
	int cube=0;
	for(int i=1;i<=x;i++)
	{	
		if(i>0)
		{
		   square= i * i;	
		   System.out.println("square\n" + square); 
		}
		if(i>0)
		{
			 cube = i * i * i;
			 System.out.println("cube\n" + cube);
		}
		
		
		}

}
}
