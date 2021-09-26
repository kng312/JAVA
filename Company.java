package singleton;

public class Company {
	//싱글톤 패턴
	//인스턴스를 단 하나만 생성하는 디자인 패턴
	//static 을 응용하여 프로그램 전반에서 사용하는 인스턴스를 하나만 구현하는 방식
	
	//Company 인스턴스를 생성할 수 없게 private으로 생성
	private Company(){}
	
	//유일하게 생성한 인스턴스
	private static Company instance = new Company();
	
	//외부에서 참조하도록 get메서드 구현
	public static Company getInstance() 
	{
		if(instance == null)
		{
			instance = new Company();
		}
		return instance;
	}
}
