package stack;
//1.추상화단계
//-배열(기본 10 사용자정의 사이즈)
//-프론트
//-리얼
//-배열의 크기
//2.생성자
//-기본생성자(배열 크기 10)
//-오버로딩된 생성자(크기를 입력받는다.)
//3.메소드
//-boolean push(int data)		 //큐에 데이터를 넣는 메소드
//-boolean pop()          		 // 큐에서 데이터를 삭제
//-int loop						//서큘러 큐
public class Qstack {
	
	int Q_SIZE = 10;
	int [] mData;		//큐 배열
	int mFront;			//프론트
	int mRear;			//리얼
	int mSize;			//배열의 크기
	
	Qstack()
	{
		mData = new int [Q_SIZE];
		mFront = 0;
		mRear = 0;
		mSize = Q_SIZE;
	}
	
	Qstack (int size)
	{
		mData = new int [size];
		mFront = 0;
		mRear = 0;
		mSize = size;
	}
	

	
	

}
