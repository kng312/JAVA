 	
public class Random__function {

	public static void main(String[] args) {
		//0~12������ ������ ���� �����Ѵ�.
		// ������ ���ڸ� 20ũ���� �迭�� ���ʷ� �����Ѵ�.
		//�迭�� 0~12������ ���ڰ� �����ϴ��� �˻�.
		
		int [] arTarget = new int [20]; // ���� �ѹ� ����
		//int rn = (int)(Math.random() * 13); // ���� �ѹ� ����
		int val;                            // Ÿ�� �迭�� ��
		
		makeRandomTable(arTarget, 0 , 12); // �Լ� �߰�
		
//		for (int i = 0; i < arTarget.length; i++)
//		{
//			rn = (int)(Math.random() * 13);
//			arTarget[i] = rn;
//		}
		
		//��� ���̺�
		boolean [] arTable = new boolean [13];
		
		for (int i = 0; i < arTable.length; i++)
		{
			arTable[i] = false;
		}
		
		// ���� �ѹ��� �˻�
		for (int i = 0; i < arTarget.length; i++)
		{
			val = arTarget[i];
			arTable[val] = true;
		}
		
		// ���
		for (int i = 0; i < arTable.length; i++)
		{
			if (arTable[i] == false)
			{
				System.out.println(i + "���� �����ϴ�.");
			}
		}
		
		System.out.println("���α׷��� �������ϴ�.");

	}
	
	//�Լ� �߰�
public static void makeRandomTable (int [] ar, int range_min , int range_max)
	{
		for (int i = 0; i <ar.length; i++)
		{
			int rn = (int)(Math.random() * 13);
			ar[i] = rn;
		}
	}

}
