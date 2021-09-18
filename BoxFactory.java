package gen;

public class BoxFactory {
	
	//박스를 만드는 메소드
	public static <T> Box2<T> createBox(T obj)
	{
		//팩토리 패턴
		Box2<T> bx = new Box2<>();
		
		bx.set(obj);
		
		return bx;
	}


}
