
public class Multiplicationtablefunction {

	public static void main(String[] args) {
		
		//2�ܿ��� 9�ܱ��� �����
		//8�� ���� ������
		int sum = 2;
		
		for (int i = 0; i < 8; i++)
		{	

			System.out.println(sum + "�� ����մϴ�.");
			
			printDan(sum);
			sum++;

			
		}
	}
	// �Լ��� 9�� ���� ������
	//�Լ��� ����� �б� ���� ��Ȱ���ϱ� ������
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
