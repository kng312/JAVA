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
//			System.out.println("��");
//		}
//		else
//		{
//			System.out.println("����");
//		}
//		
//		//or ||
//		if ((val > 0) || (val < 10))
//		{
//			System.out.println("��");
//		}
//		else
//		{
//			System.out.println("����");
//		}
//		
//		//not ! 
//		if ((val != 0) )
//		{
//			System.out.println("��");
//		}
//		else
//		{
//			System.out.println("����");
//		}
		
		// 3������ ������ ����� ��� ��ȣ�� �������� �ø���, �ڵ� ��Ÿ�ϵ� ���� �Ѵ�.
		
		
		//if (  ((val > 5) && (val <= 10)  ) || (val == 0) )  //������ �ڵ�
			
		if (  
				((val > 5) && (val <= 10)) || 				//������ �ڵ�
				(val == 0) 
			)	
			
		{
			System.out.println("��");
		}
		else
		{
			System.out.println("����");
		}
	
	
	}
}
