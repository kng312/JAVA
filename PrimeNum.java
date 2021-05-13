
public class PrimeNum {

	public static void main(String[] args) {
		//소수를 판별하는 프로그램 짜기
		
		//정한 값을 1과 자기자신을 제외하고 루프를 돌린다. 
		//만약 나머지가 0이면 소수가 아니다.
		
		int val = 23;
		int div = 2;
		boolean Num = true;
		
		for (int i = 0; i < val - 2; i++)
		{
			if (val%div == 0)
			{
				Num = false;
				break;
			}
			div++;
		}
		System.out.println(div);
		
		if (Num == true)
		{
			System.out.println("소수");
		}
		else
		{
			System.out.println("합성수");
		}

	}

}
