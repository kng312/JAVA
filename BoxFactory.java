package gen;

public class BoxFactory {
	
	//�ڽ��� ����� �޼ҵ�
	public static <T> Box2<T> createBox(T obj)
	{
		//���丮 ����
		Box2<T> bx = new Box2<>();
		
		bx.set(obj);
		
		return bx;
	}


}
