import java.util.Scanner;

public class distinctarrays {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int n2=scr.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n2];
		for(int i=0;i<=n-1;i++)
		{
			int a=scr.nextInt();
			arr[i]=a;
		}
			for(int j=0;j<=n2-1;j++)
			{
				int b=scr.nextInt();
				arr1[j]=b;
			
			}
			for(int k=0;k<=n-1;k++)
			{
				int count=0;
				for(int l=0;l<=n2-1;l++)
				{
					if(arr[k]==arr1[l])
					{
					count=0;
					break;
					}
					else
					{
						count=1;
					}
					}
				if(count==1)
				{
					System.out.print(arr[k]+" ");
				}
				
			}
			for(int k=0;k<=n2-1;k++)
			{
				int count=0;
				for(int l=0;l<=n-1;l++)
				{
					if(arr[l]==arr1[k])
					{
					count=0;
					break;
					}
					else
					{
						count=1;
					}
					}
				if(count==1)
				{
					System.out.print(arr1[k]+" ");
				}
				
			}
			
		
		}
	}


