

public class func {

	public static void main(String[] args) 
	{
		// for문으로 팩토리얼을 구하는 함수를 작성하시오
		//1.팩토리얼은 1부터 n까지의 정수를 곱하는 단순한 연산입니다. 5!는1*2*3*4*5 즉 120입니다.
		//2. 루프를 5번 곱하면서 하나씩 뺀다.
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
//	//재귀호출을 이용하여 팩토리얼을 구하는 함수를 작성하시오
//	//1. 팩토리얼은 1부터 n까지의 정수를 곱하는 단순한 연산입니다.
//	//2. 재귀호출함수 만들기
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
