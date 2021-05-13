
public class Multiplicationtable {

	public static void main(String[] args) {
		//구구단 3단 만들기
		//9번 돌아가는 루프를 만듬
		
		int a = 3;
		int b = 1;
		
		
		for (int i = 0; i < 9; i++)
		{
			System.out.println(a + "X" + b + "=" + a * b);
			b++;
		}
		
		//2단부터 9단 만들기
		
		//8번 돌아가는 루프와 9번 돌아가는 루프 만들기
		//SRP주의
		
		int c = 2;
		int d = 1;
		
		
		for (int j = 0; j < 8; j++)
		{
			for (int k = 0; k < 9; k++)
			{
				System.out.println(c + "X" + d + "=" + c * d);
				d++;
			}
			d = 1;
			c++;
		}
		

	}

}
