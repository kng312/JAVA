package array;

public class Array {

	public static void main(String[] args) {
		//�迭����
		
		//���ڸ��� ������ ������ 5���� �迭�� ����� �ʹ�.
		
		//{1,2,3} {4,5,6} {7,8,9} {10,11,12}
		
		//1.�迭�� ���� �� �ʱ�ȭ
//		int [] a = new int [] {11,22,33,44,55};
//		
//		int [][] b = new int [][] { 
//			{1,2,3},{4,5,6}, {7,8,9},{10,11,12}
//		};
//		
//		int [][] b2 = new int [4][3];
//		b2[0][0] = 1;
//		
//		
//		//2.�迭�� �б� ����
//		for (int i = 0; i < a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		//�� ���� ���� ���Ͻÿ�
		int [][][] table = new int [][][] 
		{
			{
				{1,5,9},
				{2,6,10},
				{3,7,11},
				{4,8,12}
			},
			{
				{13,17,21},
				{14,18,22},
				{15,19,23},
				{16,20,24}
			},
			{
				{25,29,33},
				{26,30,34},
				{27,31,35},
				{28,32,36}
			}
		};
//		int[][] sum = new int [][]
//				{
//					{
//						table[0][0][0] + table[0][0][1]+table[0][0][2]+
//						table[1][0][0] + table[1][0][1]+table[1][0][2]+
//						table[2][0][0] + table[2][0][1]+table[2][0][2]
//					},
//					{
//						table[0][1][0] + table[0][1][1]+table[0][1][2]+
//						table[1][1][0] + table[1][1][1]+table[1][1][2]+
//						table[2][1][0] + table[2][1][1]+table[2][1][2]
//					},
//					{
//						table[0][2][0] + table[0][2][1]+table[0][2][2]+
//						table[1][2][0] + table[1][2][1]+table[1][2][2]+
//						table[2][2][0] + table[2][2][1]+table[2][2][2]
//					},
//					{
//						table[0][3][0] + table[0][3][1]+table[0][3][2]+
//						table[1][3][0] + table[1][3][1]+table[1][3][2]+
//						table[2][3][0] + table[2][3][1]+table[2][3][2]
//						
//					}
//				};
//		System.out.println(sum[0][0]);
//		System.out.println(sum[1][0]);
//		System.out.println(sum[2][0]);
//		System.out.println(sum[3][0]);
		
		//�� ���� �����ϴ� �ڵ�
		int [] row_total = new int [table[0].length];
		int row_temp = 0;
		
		for(int i = 0; i < table.length; i++)
		{
			for(int j = 0; j < table[i].length; j++)
			{
				for(int k = 0; k < table[i][j].length; k++)
				{
					row_temp = row_temp + table[i][j][k];
					
				}
				row_total[j] = row_total[j] + row_temp;
				row_temp = 0;
			}
		}
		
		
		for(int i = 0; i < row_total.length; i++)
		{
			System.out.println(row_total[i]);
		}
		
//		for(int i = 0; i < 2; i++)
//		{
//			for(int j = 0; j < 2; j++)
//			{
//				
//				for(int k = 0; k < 2; k++)
//				{
//			
//					System.out.println(sum);
//					
//				}
//			}
//			
//		}
		

	}

}
