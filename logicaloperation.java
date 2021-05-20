package classexample;

import java.util.*;

public class logicaloperation {
	public static void main(String [] args) 
	{
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		
		System.out.println("val = " + val);
	
//		//and && 
//		if ((val > 0) && (val < 10))
//		{
//			System.out.println("참");
//		}
//		else
//		{
//			System.out.println("거짓");
//		}
//		
//		//or ||
//		if ((val > 0) || (val < 10))
//		{
//			System.out.println("참");
//		}
//		else
//		{
//			System.out.println("거짓");
//		}
//		
//		//not ! 
//		if ((val != 0) )
//		{
//			System.out.println("참");
//		}
//		else
//		{
//			System.out.println("거짓");
//		}
		
		// 3가지의 조건을 사용할 경우 괄호로 가독성을 올린다, 코딩 스타일도 변경 한다.
		
		
		//if (  ((val > 5) && (val <= 10)  ) || (val == 0) )  //동일한 코드
			
		if (  
				((val > 5) && (val <= 10)) || 				//동일한 코드
				(val == 0) 
			)	
			
		{
			System.out.println("참");
		}
		else
		{
			System.out.println("거짓");
		}
	
	
	}
}
