
//1.추상화단계
//-배열(기본 10 사용자정의 사이즈)
//-위치정보
//-배열의 크기
//2.생성자
//-기본생성자(배열 크기 10)
//-오버로딩된 생성자(크기를 입력받는다.)
//3.메소드
//-boolean push(int data)		 //스택에 데이터를 넣는 메소드
//-boolean pop()          		 // 스택에서 데이터를 삭제
//-boolean getData(int [] arData) 	 //데이터를 가져온다
//-void printData()
public class Stack {
	//int 10개의 배열로 이루어진 스택 클래스를 구현하시오
	// 1. int 10개의 배열을 만든다.
	// 2. 스택클래스를 구현?
	
	final int DEF_SIZE = 10;
	private int [] mData;		//스택프레임
	private int mPos;			//위치정보(Stack Pointer)
	private int mSize;			//배열의 크기
	
	//기본생성자(배열 크기 10)
	Stack ()
	{
		mData = new int [DEF_SIZE];
		mPos = -1;
		mSize = DEF_SIZE;
	}
	
	//오버로딩된 생성자(크기를 입력받는다.)
	
	Stack (int size)
	{
		mData = new int [size];
		mPos = -1;
		mSize = size;
	}
	
	//메소드
	boolean push(int data) 							 //스택에 데이터를 넣는 메소드
	{
		if (mPos < mSize - 1)
		{
			mPos++;
			mData[mPos] = data;
					
		}
		else 
			{return false;}
		
		return true;
	}
	boolean pop()									// 스택에서 데이터를 삭제
	{
		if (mPos != -1)
		{
			mData[mPos] = 0;						//데이터를 0으로 초기화 해준다.
			mPos--;
			return true;
		}
		return false;
	}
	boolean getData(int [] arData)					//데이터를 가져온다
	{
		if (mPos != -1)
		{
			arData[0] = mData[mPos];
			return true;
		}
		return true;
	}
	void printData()
	{return;}
	

}
