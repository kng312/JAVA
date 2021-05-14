
public class Array {

	public static void main(String[] args) {
		//배열 표현 
		//어떤 데이터 타입을 T라고 할 때 T가 n개가 연속되어 구성되어 있는 메모리 구조.
		
		int a [] = new int [3];
		
		a[0] = 3;
		a[1] = 2;
		a[2] = 1;
		
		System.out.println(a[1]);
		
		
		int [] b = new int [] {11,22,33};
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(b[i]);
		}
		
		int c [] = {44,55,66}; //슈거 코드
		
		for (int i = 0; i < c.length; i++) //length로 배열의 갯수 파악 가능
		{
			System.out.println(c[i]);
		}
		
	}

}
