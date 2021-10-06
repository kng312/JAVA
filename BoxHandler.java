package wildcards;

public class BoxHandler {
	
	//public static void peekBox(Box<?> box)	//와일드 카드
	public static void peekBox(Box<? extends Integer> box)	//상한제한
	{
		//원형 public void set(T = (Integer보다 크거나 같은 자료형) obj)
		//box.set(4);
		
		//Integer ii = box.get();
		System.out.println(box.get());
	}
	
	public static void inBox(Box<? super Integer> box, Integer i)	//하한제한
	{
		//원형 public void set(T = (Integer보다 크거나 같은 자료형) obj)
		box.set(4);
		
		//Integer ii = box.get();
		System.out.println(box.get());
	}

}
