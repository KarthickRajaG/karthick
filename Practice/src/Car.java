
public class Car {
	private int speed=20;
	private String model;
	
	public Car()
	{
		System.out.println(" car cons call");
	}
	public Car(String model){
		this();
		this.model=model;
		System.out.println(" car one arg model " + model);
	}
	public Car(int speed,String model)
	{
		this(model);
		this.speed=speed;
		this.model=model;
		System.out.println(" car two arg speed " + speed);
		System.out.println("car two arg model " + model);

	}
	protected void override()
	{
		System.out.println("override method");
	}
	public static void main(String[] args) {
		//Car car=new Car();
		//Car car1=new Car("BMW");
		Car car2=new Car(100,"BMW");
	}

}
