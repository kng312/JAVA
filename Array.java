
public class Array {

	public static void main(String[] args) {
		//�迭 ǥ�� 
		//� ������ Ÿ���� T��� �� �� T�� n���� ���ӵǾ� �����Ǿ� �ִ� �޸� ����.
		
		int a [] = new int [3];
		
		a[0] = 3;
		a[1] = 2;
		a[2] = 1;
		
		System.out.println(a[1]);
		
		
		int [] b = new int [] {11,22,33};
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(b[i]);
		}
		
		int c [] = {44,55,66}; //���� �ڵ�
		
		for (int i = 0; i < c.length; i++) //length�� �迭�� ���� �ľ� ����
		{
			System.out.println(c[i]);
		}
		
	}

}
