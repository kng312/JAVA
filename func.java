

public class func {

	public static void main(String[] args) 
	{
		// for������ ���丮���� ���ϴ� �Լ��� �ۼ��Ͻÿ�
		//1.���丮���� 1���� n������ ������ ���ϴ� �ܼ��� �����Դϴ�. 5!��1*2*3*4*5 �� 120�Դϴ�.
		//2. ������ 5�� ���ϸ鼭 �ϳ��� ����.
//		int a = 5;
//		
//		int b = 1;
//		
//		while (a != 0)
//		{
//			b = b*a;
//			a--;
//			//System.out.println(b);
//		}
//		
//		int num = 6;
//		int sum = 1;
//		
//		for (int i = 1; i <= num; i++ )
//		{
//			sum*=i;
//		}
//		System.out.println(sum);
		
		System.out.println(f(2));
		
		int a = 6;
		
//		int sum = func1(a);
//		System.out.println(sum);
	}
//	
//	//���ȣ���� �̿��Ͽ� ���丮���� ���ϴ� �Լ��� �ۼ��Ͻÿ�
//	//1. ���丮���� 1���� n������ ������ ���ϴ� �ܼ��� �����Դϴ�.
//	//2. ���ȣ���Լ� �����
//	
//	public static int func1(int a)
//	{
//		if (a <= 1) {return 1;}
//		return a * func1(a-1);
//	}
	
	public static int f(int n)
	{
		int total;
		if (n == 1)
		{
			return 1;
		}
		total = n * f(n - 1);
		return total;
	}
	
	
	
	
	
	
	
}
