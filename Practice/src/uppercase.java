import java.util.Scanner;

public class uppercase {
public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	String str=scr.nextLine();
  char c[]=str.toCharArray();
  for(int i=0;i<c.length-1;i++)
   {
	  if(i==0)
	  {
	   if(c[i]>=97 && c[i]<=122)
	   {
		   c[i]=(char) (c[i]-32);
	   }
	  }
	   else if(c[i]==' ')
	   {
		 i++; 
		 if(c[i]>=97 && c[i]<=122)
		   {
			   c[i]=(char) (c[i]-32);
		   }
	   }
	   else
       {
           if(!(c[i]>=97 && c[i]<=122))
           {
                   c[i]=(char) (c[i]+32);
           }
       }
    }

		for(int i=0;i<=c.length-1;i++)
		{
		        System.out.print(c[i]);
		}
   }
	
}

