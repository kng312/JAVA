package gen;

//Box<Apple , Box<Banana , Orange>
public class Box2 <T > {
	//���׸��� ���� ����
	//�빮�� �ϳ��� ����
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
