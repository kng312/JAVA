package Inheritance;

public class Cat extends Animal {
	
	int Flexibility;
	
	String mtabby;
	
	Cat()
	{
		
		System.out.println("cat constructor");
	}
	
	Cat(String tabby)
	{
		//super("더그",2,"예방접종"); //상위클래스이 오버로딩된 생성자를 명시적으로 호출
		super(); // 상위클래스의 디폴트 생성자를 명시적 호출
		System.out.println("cat constructor2");
		mtabby = tabby;
	}

}
