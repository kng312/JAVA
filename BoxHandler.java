package wildcards;

public class BoxHandler {
	
	//public static void peekBox(Box<?> box)	//���ϵ� ī��
	public static void peekBox(Box<? extends Integer> box)	//��������
	{
		//���� public void set(T = (Integer���� ũ�ų� ���� �ڷ���) obj)
		//box.set(4);
		
		//Integer ii = box.get();
		System.out.println(box.get());
	}
	
	public static void inBox(Box<? super Integer> box, Integer i)	//��������
	{
		//���� public void set(T = (Integer���� ũ�ų� ���� �ڷ���) obj)
		box.set(4);
		
		//Integer ii = box.get();
		System.out.println(box.get());
	}

}
