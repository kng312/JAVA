package Inheritance;

public class Animal {
	
	String mName;
	int mage;
	String mdiscode;
	
	Animal()
	{
		System.out.println("Animal Constructor");
	}
	
	Animal(String Name, int Age, String Discode)
	{
		mName = Name;
		mage = Age;
		mdiscode = Discode;
		
		System.out.println("Animal Constructor2");
	}

}
