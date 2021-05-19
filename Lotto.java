
public class Lotto {
	//1번 추상화
	int [] marNumber = new int [6];
	//2번 생성자
	Lotto()
	{
		//추가적인 코드는 여기에 작성.
	}
	//3번 메소드
	
	//로또 번호를 생성하는 메소드
	boolean genLottoNumber()
	{
		int pos = 0;
	    int nNumber;
	    boolean isExist = false;
	    
	    while(pos < marNumber.length)
	      {
	         //1. 번호추출
	         
	    	nNumber = (int)(Math.random()*45) + 1;

	              //2. 이 번호가 존재하는지
	            for(int k = 0; k < marNumber.length; k++)
	            {   
	               //이미 번호가 존재함
	               if(nNumber == marNumber[k])
	               {
	                     isExist = true;
	                     break;
	               }
	            }
	              //존재하지 않으면 저장 후 다음배열
	            if (isExist == false)
	            {
	            	marNumber[pos] = nNumber;
	               pos = pos + 1;
	         
	            }
	            else
	            {
	               isExist = false;
	            }
	      
	      }
		return true; // 이 함수를 돌릴때 테스트 할때 오류가 나거나 수정할 경우 다른 결과가 나올 수 있다.
					// 무조건 true 로 하는 이유

//		// boolean 을 사용 하는 이유는 오류가 날 수 있기 때문
//		lo.genLottoNumber();
//		System.out.println("로또 번호 생성시 문제발생");
	}
	
	//로또 번호를 복사해주는 함수.
	void getNumber(int [] arTarget)
	{
		for (int i = 0; i < marNumber.length; i++ )
		{
			arTarget[i] = this.marNumber[i];
		}
	}
	
	
	
}
