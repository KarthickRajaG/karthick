
public class Taxi extends Car {
	public Taxi(){
		System.out.println("Taxi cons call");
	}
	public Taxi(String i)
	{
		super(i);
		//this();
		System.out.println(" taxi one arg cons");
	}
	@Override
	public void override() {
	//super.override();
		System.out.println(" Taxi barke");
	}
	public static void main(String[] args) {

		Taxi taxi1=new Taxi("kar");
		taxi1.override();
	}

}
