
public class ArrayExample {

	public static void main(String[] args) {
		// float 5���� �迭�� ����ÿ� 1.0 2.0 3.0....5.0
		
		float [] a = new float [] {1.0f, 2.0f , 3.0f , 4.0f , 5.0f};
		
		//double 10���� �迭 ����ÿ� 11.0 22.0....100.0
		
		double [] b = new double [] {11.0, 22.0,33.0,44.0,55.0,66.0,77.0,88.0,99.0,100.0};
		
		//for ���� �̿��Ͽ� �ΰ��� �迭�ȿ� �ִ� ���� ������
		
		for (int i = 0; i < 5; i++)
		{
			System.out.println(a[i]);
		}
		
		for (int i = 0; i < 10; i++)
		{
			System.out.println(b[i]);
		}
		
		// int 10���� �迭�� ����ÿ� , �� ��ҵ� 10,20,....100���� �� �� ���� ���Ͻÿ�
		//1. 10���� �迭�� ����� 10~100 ���� �����Ѵ�.
		int [] Ar = new int [] {10,20,30,40,50,60,70,80,90,100};
		
		//2. �� ���ڸ� 10�� ���� ���� ���ڸ� �� �Ѵ�.
		int sum = 0;
		for (int i = 0; i < 10; i++)
		{
			sum = sum + Ar[i];
		}
		
		System.out.println(sum);
	}
	
		//����� Ǯ��
	
//		int [] abc =new int [10];
//		//�迭�� 10���� 100���� ���� �����Ѵ�.
	
//		int vak = 1;
//		for (int i= 0; i < 10; i++)
//		{
//			abc[i] = 10 * vak;
//			vak++;
//		}	
//		//�迭�� ���� ���Ѵ�.
	
//		int total = 0;
//		for (int j= 0; j < 10; j++)
//		{
//			total = total + abc[j];
//		}
//		//���Ѱ� ����Ѵ�.
	
//		System.out.println(total);
	
}
