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
		//super("����",2,"��������"); //����Ŭ������ �����ε��� �����ڸ� ��������� ȣ��
		super(); // ����Ŭ������ ����Ʈ �����ڸ� ����� ȣ��
		System.out.println("cat constructor2");
		mtabby = tabby;
	}

}
