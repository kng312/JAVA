package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		//자동차 생산시 차 번호를 부여
		
		CarFactory factory = CarFactory.getInstance();
		
		Car sonata = factory.createCar();
		Car benz = factory.createCar();
		
		System.out.println(sonata.getCarNum());
		System.out.println(benz.getCarNum());

	}

}
