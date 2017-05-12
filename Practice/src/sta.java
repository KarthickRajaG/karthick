
public class sta {
	 static int count = 10;
	 static{
		 count++;
		 System.out.println("first static value " + count);
	 }
	 static 
	 {
		 count++;
		 System.out.println("second static value " + count);
	 }
	 public sta()
	 {
		 count++;
		 System.out.println("cons call " + count);
	 }
	 public void stat(){
		 count++;
		 System.out.println("instance method "+count);
	 }
	 public static void  statc()
	 {
		 count++;
		 System.out.println("static method " + count);
	 }
	public static void main(String[] args) {
		sta.count++;
		sta.statc();
		sta sta1=new sta();
		sta1.stat();

		System.out.println("calling method" + count);
	}

}
