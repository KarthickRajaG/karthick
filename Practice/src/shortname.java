import java.util.Scanner;

public class shortname {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String fullName = scr.nextLine().toLowerCase().trim();

        char[] arr = fullName.toCharArray();

        String shortName="";

        int min = 0;
        shortName += (char) (arr[min] - 32);

        for (int i = 0; i < arr.length; i++) {
                 
                  if (arr[i] == ' ') {
 
                      shortName +=". ";
                      min = i + 1;
 
                      while(arr[min]==' '){
  
                              min++;
                              i++;
                     }
                     shortName += (char) (arr[min] - 32);
                  }

                  if (i == arr.length - 1) {
                     for (int k = min+1; k < arr.length; k++) {
                             shortName +=arr[k];
                          
                     }
                  }
        }
        System.out.println("Full Name : "+fullName);
        System.out.println("Short Name : "+shortName);
	}

}
