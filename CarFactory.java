package singleton;

public class CarFactory {
	//인스턴스를 생성할 수 없게 private으로 만듬
	private CarFactory() {}
	
	//유일하게 생성한 인스턴스
	private static CarFactory instance = new CarFactory();
	
	//외부에서 쓸 수 있게 만듬
	public static CarFactory getInstance() 
	{
		if (instance == null)
		{
			instance = new CarFactory();
		}
		return instance;
	}
	
	public Car createCar()
	{
		Car car = new Car();
		return car;
	}
	
	

}
