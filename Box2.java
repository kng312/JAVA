package gen;

//Box<Apple , Box<Banana , Orange>
public class Box2 <T > {
	//제네릭을 쓸때 관행
	//대문자 하나만 쓴다
	public T obj;

	
	public void set(T obj)
	{
		this.obj = obj;
	}
	
	public T get()
	{
		return obj;
	}
	
//	public int getNumber()
//	{
//		return obj.intValue();
//	}
	
//	public void eat()
//	{
//		obj.eat();
//	}
	

}
