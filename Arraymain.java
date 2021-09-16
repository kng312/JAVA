package array;

import java.util.Arrays;

public class Arraymain {

	public static void main(String[] args) 
	{
		// 1.배열을 복사
		//public static int[] copyOf(int[] original, int newLength)
		int [] ar = new int [] {11,22,33,44,55};
		
//		int[] ar_copy = Arrays.copyOf(ar, ar.length);
//		
//		for(int value : ar_copy)
//		{
//			System.out.println(value);
//		}
		
		// 2.배열의 범위를 복사(새로운 배열을 만듬)
		//public static int[] copyOfRange(int[] original, int from, int to)
//		
//		int[] ar_copy2 = Arrays.copyOfRange(ar, 1, 4);
//		
//		for(int i : ar_copy2)
//			System.out.println(i);
//		
//		//3. 배열이 같은지 확인 비교 
//		System.out.println(Arrays.equals(ar, ar_copy));
		
		//4. 배열의 정렬
		int [] ar_copy3 = new int [] {11,12,33,564,535};
		Arrays.sort(ar);
		for(int value : ar_copy3)
			System.out.println(value);

	}

}
