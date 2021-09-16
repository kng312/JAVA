package isahasa;

//ACPU is a kind of cpu
//에이 시피유는 시피유의 한 종류이다.
public class ACPU extends cpu{
	
	
	
	public ACPU()
	{
		System.out.println("CALL ACPU");
	}
	
	//오버라이딩 재정의	상위클래스를 사용하지않고 같은 인터페이스를 가져와 나의 인터페스로 사용 + 상위클래스의 기능을 보호
	public void setOverClock(float multiple)
	{
		if(multiple > 4.0f)
			return;
		clock = clock * multiple;
	}

}
