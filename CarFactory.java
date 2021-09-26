package singleton;

public class CarFactory {
	//�ν��Ͻ��� ������ �� ���� private���� ����
	private CarFactory() {}
	
	//�����ϰ� ������ �ν��Ͻ�
	private static CarFactory instance = new CarFactory();
	
	//�ܺο��� �� �� �ְ� ����
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
