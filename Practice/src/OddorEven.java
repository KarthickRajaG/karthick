import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		Scanner scr=new Scanner (System.in);
		int num=scr.nextInt();
		if(num%2==0)
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
