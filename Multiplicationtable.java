
public class Multiplicationtable {

	public static void main(String[] args) {
		//������ 3�� �����
		//9�� ���ư��� ������ ����
		
		int a = 3;
		int b = 1;
		
		
		for (int i = 0; i < 9; i++)
		{
			System.out.println(a + "X" + b + "=" + a * b);
			b++;
		}
		
		//2�ܺ��� 9�� �����
		
		//8�� ���ư��� ������ 9�� ���ư��� ���� �����
		//SRP����
		
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
