
public class LottoClass {
	
public static void main(String[] args) {
		
		int [] arLotto = new int [6];
		
		Lotto lo = new Lotto();
		
		boolean result = lo.genLottoNumber();
		
		if (result == false)
		{
			System.out.println("로또 번호 생성시 문제발생");
		}
		else
		{
			System.out.println("로또 번호 생성성공");
		
		
			lo.getNumber(arLotto);
		
			for (int i = 0; i < 6; i++)
			{
				System.out.println(arLotto[i]);
			}
		
		}

	}
}

