package gen;

public class BoxMain {

	public static void main(String[] args) {
//		//1.사과박스 오렌지박스를 만든다
//		AppleBox a_box = new AppleBox();
//		OrangeBox o_box = new OrangeBox();
//		
//		//2.사과는 사과 박스에 오렌지는 오렌지 박스에 넣기
//		a_box.setApple(new Apple());
//		o_box.setOrange(new Orange());
//		
//		//3.사과 오렌지를 꺼낸다
//		Apple ap = a_box.getApple();
//		Orange or = o_box.getOrange();
//		
//		//4.사과 오렌지를 출력
//		System.out.println(ap.color);
//		System.out.println(or.color);
//=================================================================================================
//		Object obj
//		//1.사과박스 오렌지박스를 만든다
//		Box a_box = new Box();
//		Box o_box = new Box();
//		
//		//2.사과는 사과 박스에 오렌지는 오렌지 박스에 넣기
//		a_box.set(new Apple());
//		o_box.set(new Orange());
//		
//		//3.사과 오렌지를 꺼낸다
//		Apple ap = (Apple)a_box.get();
//		Orange or = (Orange)o_box.get();
//		
//		//4.사과 오렌지를 출력
//		System.out.println(ap.color);
//		System.out.println(or.color);
//================================================================================================		
//		//일반화 프로그래밍
//		//1.사과박스 오렌지박스를 만든다
//		Box<Apple> a_box = new Box<Apple>();	// => 애플박스 "클래스"를 만들어야겠구나
//		Box<Orange> o_box = new Box<Orange>();	// => 오렌지박스 "클래스"를 만들어야겠구나
//		//내부적으로 클래스가 두개가 생성
//				
//		//2.사과는 사과 박스에 오렌지는 오렌지 박스에 넣기
//		a_box.set(new Apple());
//		o_box.set(new Orange());
//				
//		//3.사과 오렌지를 꺼낸다
//		Apple ap = a_box.get();
//		Orange or = o_box.get();
//				
//		//4.사과 오렌지를 출력
//		System.out.println(ap.color);
//		System.out.println(or.color);
		
//		Box<Apple, Orange> box = new Box<>();	//슈가코드 가능 new Box<>();
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
		
		//1.과일을 할당해서 박스에 넣는다
		
		b1.set(new Apple(), new Box<Banana, Orange>());
		b2.set(new Banana(), new Orange());
		
		//2.박스에 있는 과일을 하나씩 뺀다
		Apple ap = b1.getLeft();
		Banana ba = b2.getLeft();
		Orange or = b2.getRight();
		
		//3. 색을 확인한다.
		System.out.println(ap.color);
		System.out.println(ba.color);
		System.out.println(or.color);
		
		//작은 박스객체에 바나나와 오렌지를 할당해서 넣는다.
		b1.getRight().set(new Banana(), new Orange());
		
		b1.getLeft();				//큰 박스의 왼쪽 사과
		b1.getRight().getLeft();	//큰 박스 오른쪽의 작은박스 왼쪽 바나나
		b1.getRight().getRight();	//큰 박스 오른쪽의 작은박스 오른쪽 오렌지
		

		
		


	}

}
