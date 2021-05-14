
public class ArrayExample {

	public static void main(String[] args) {
		// float 5개의 배열을 만드시오 1.0 2.0 3.0....5.0
		
		float [] a = new float [] {1.0f, 2.0f , 3.0f , 4.0f , 5.0f};
		
		//double 10개의 배열 만드시오 11.0 22.0....100.0
		
		double [] b = new double [] {11.0, 22.0,33.0,44.0,55.0,66.0,77.0,88.0,99.0,100.0};
		
		//for 문을 이용하여 두개의 배열안에 있는 값을 찍어보세요
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(b[i]);
		}
		
		// int 10개의 배열을 만드시오 , 각 요소들 10,20,....100설정 한 후 합을 구하시오
		//1. 10개의 배열을 만들고 10~100 값을 저장한다.
		int [] Ar = new int [] {10,20,30,40,50,60,70,80,90,100};
		
		//2. 각 숫자를 10번 루프 돌려 숫자를 더 한다.
		int sum = 0;
		for (int i = 0; i < 10; i++)
		{
			sum = sum + Ar[i];
		}
		
		System.out.println(sum);
	}
	
		//강사님 풀이
	
//		int [] abc =new int [10];
//		//배열에 10부터 100까지 값을 저장한다.
	
//		int vak = 1;
//		for (int i= 0; i < 10; i++)
//		{
//			abc[i] = 10 * vak;
//			vak++;
//		}	
//		//배열의 합을 구한다.
	
//		int total = 0;
//		for (int j= 0; j < 10; j++)
//		{
//			total = total + abc[j];
//		}
//		//더한걸 출력한다.
	
//		System.out.println(total);
	
}
