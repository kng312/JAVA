
public class PrimeNum {

	public static void main(String[] args) {
		//�Ҽ��� �Ǻ��ϴ� ���α׷� ¥��
		
		//���� ���� 1�� �ڱ��ڽ��� �����ϰ� ������ ������. 
		//���� �������� 0�̸� �Ҽ��� �ƴϴ�.
		
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
			System.out.println("�Ҽ�");
		}
		else
		{
			System.out.println("�ռ���");
		}

	}

}
