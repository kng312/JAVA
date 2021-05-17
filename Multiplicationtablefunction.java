
public class Multiplicationtablefunction {

	public static void main(String[] args) {
		
		//2단에서 9단까지 만들기
		//8번 루프 돌리기
		int sum = 2;
		
		for (int i = 0; i < 8; i++)
		{	

			System.out.println(sum + "단 출력합니다.");
			
			printDan(sum);
			sum++;

			
		}
	}
	// 함수로 9번 루프 돌리기
	//함수로 만들면 읽기 쉽고 재활용하기 용이함
	public static void printDan (int sum)
	{
		int div = 1;
		
		for (int j = 0; j < 9; j++)
		{
			System.out.println(sum + " * " + div + " = " + sum*div);
			div++;
		}
		
		div = 1;
	}
}
