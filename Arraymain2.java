package array;

import java.util.*;

public class Arraymain2 {
	public static void main (String[] args)
	{
		Person[] ar = new Person[3];
		
		//�迭�� ����
		ar[0] = new Person("jsh", 49);
		ar[1] = new Person("asw", 41);
		ar[2] = new Person("fxc", 55);
		
		Arrays.sort(ar);

		//5.�迭�� Ž�� !!�ݵ�� ������ �� �� ��밡��
		int[] arr = new int[] {34, 44,2 ,5, 6};
		
		Arrays.sort(arr);
		int ret = Arrays.binarySearch(arr, 5);
		System.out.println(ret);
		ret = Arrays.binarySearch(arr, 123);
		System.out.println(ret);
		
		ret = Arrays.binarySearch(ar, new Person("noname", 55));
		System.out.println(ret);
	}

}
