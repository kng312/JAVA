public class Student 
{
	//추상화 중요한 것 , 잘 안바뀌는 것
	//이름
	String mName;
	//학년
	int mGrade;
	//번호
	int mNumber;
	
	// 생성자 --- 객체의 초기화를 위해 클래스가 인스턴스화 될때 호출되는 함수
	// 반드시 기본 생성자가 있어야 한다.
	Student()
	{
		mName = "noname";
		mGrade = 1;
		mNumber = 0;
	}
	// 함수의 이름은 같지만 파라메타가 다른 함수를 만드는 기법 function overloading
	// 데이터타입이 달라야한다.
	Student (String name, int grade , int number)
	{
		mName = name;
		mGrade = grade;
		mNumber = number;
	}
	
	void setName(String name)
	{
		//Student this s1의 주소를 받는다.
		this.mName = name; //s1주소를 받음 , 내가 생성한 객체
	}
	
	String getName()
	{
		return mName;
	}
}
