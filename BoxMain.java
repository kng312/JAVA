package gen;

public class BoxMain {

	public static void main(String[] args) {
//		//1.����ڽ� �������ڽ��� �����
//		AppleBox a_box = new AppleBox();
//		OrangeBox o_box = new OrangeBox();
//		
//		//2.����� ��� �ڽ��� �������� ������ �ڽ��� �ֱ�
//		a_box.setApple(new Apple());
//		o_box.setOrange(new Orange());
//		
//		//3.��� �������� ������
//		Apple ap = a_box.getApple();
//		Orange or = o_box.getOrange();
//		
//		//4.��� �������� ���
//		System.out.println(ap.color);
//		System.out.println(or.color);
//=================================================================================================
//		Object obj
//		//1.����ڽ� �������ڽ��� �����
//		Box a_box = new Box();
//		Box o_box = new Box();
//		
//		//2.����� ��� �ڽ��� �������� ������ �ڽ��� �ֱ�
//		a_box.set(new Apple());
//		o_box.set(new Orange());
//		
//		//3.��� �������� ������
//		Apple ap = (Apple)a_box.get();
//		Orange or = (Orange)o_box.get();
//		
//		//4.��� �������� ���
//		System.out.println(ap.color);
//		System.out.println(or.color);
//================================================================================================		
//		//�Ϲ�ȭ ���α׷���
//		//1.����ڽ� �������ڽ��� �����
//		Box<Apple> a_box = new Box<Apple>();	// => ���ùڽ� "Ŭ����"�� �����߰ڱ���
//		Box<Orange> o_box = new Box<Orange>();	// => �������ڽ� "Ŭ����"�� �����߰ڱ���
//		//���������� Ŭ������ �ΰ��� ����
//				
//		//2.����� ��� �ڽ��� �������� ������ �ڽ��� �ֱ�
//		a_box.set(new Apple());
//		o_box.set(new Orange());
//				
//		//3.��� �������� ������
//		Apple ap = a_box.get();
//		Orange or = o_box.get();
//				
//		//4.��� �������� ���
//		System.out.println(ap.color);
//		System.out.println(or.color);
		
//		Box<Apple, Orange> box = new Box<>();	//�����ڵ� ���� new Box<>();
//		
//		box.set(new Apple(), new Orange());
//		
//		Apple ap = box.getLeft();
//		Orange or = box.getRight();
//		
//		System.out.println(ap.color);
//		System.out.println(or.color);
		
	
		Box<Apple, Box<Banana,Orange>> b1 = new Box<>();
		Box <Banana, Orange> b2 = new Box<>();
		
		//1.������ �Ҵ��ؼ� �ڽ��� �ִ´�
		
		b1.set(new Apple(), new Box<Banana, Orange>());
		b2.set(new Banana(), new Orange());
		
		//2.�ڽ��� �ִ� ������ �ϳ��� ����
		Apple ap = b1.getLeft();
		Banana ba = b2.getLeft();
		Orange or = b2.getRight();
		
		//3. ���� Ȯ���Ѵ�.
		System.out.println(ap.color);
		System.out.println(ba.color);
		System.out.println(or.color);
		
		//���� �ڽ���ü�� �ٳ����� �������� �Ҵ��ؼ� �ִ´�.
		b1.getRight().set(new Banana(), new Orange());
		
		b1.getLeft();				//ū �ڽ��� ���� ���
		b1.getRight().getLeft();	//ū �ڽ� �������� �����ڽ� ���� �ٳ���
		b1.getRight().getRight();	//ū �ڽ� �������� �����ڽ� ������ ������
		

		
		


	}

}
