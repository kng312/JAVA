
public class LottoClass {
	
public static void main(String[] args) {
		
		int [] arLotto = new int [6];
		
		Lotto lo = new Lotto();
		
		boolean result = lo.genLottoNumber();
		
		if (result == false)
		{
			System.out.println("�ζ� ��ȣ ������ �����߻�");
		}
		else
		{
			System.out.println("�ζ� ��ȣ ��������");
		
		
			lo.getNumber(arLotto);
		
			for (int i = 0; i < 6; i++)
			{
				System.out.println(arLotto[i]);
			}
		
		}

	}
}

