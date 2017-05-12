
public class ConversionFromStringTONumber {
	public static void main(String[] args) {
		String str = "12345"; 
        int num = 0;
        int len = str.length(); 
        int ind = 0;
    
        while(len>0){
   
           char c = str.charAt(ind);   
           int digit = (int) c - '0';   
           num = num*10 + digit; 
           len--;
           ind++;
        }
        System.out.println(num);
	}

}
