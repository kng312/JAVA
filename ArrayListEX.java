package gen2;

import java.util.*;

public class ArrayListEX {
	public static void main(String[] args)
	{
		//1. ArrayList<E> : ��� ����Ʈ
		//2. LinkedList<E> : ��ũ�� ����Ʈ
		
//		List<int[]> list = new ArrayList<>();
//		int [] ar = null;
//		
//		list.add("jsgh");
//		list.add("jmj");
//		list.add("jjh");
//		
//		for(int i = 0; i < list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
//		
//		list.remove(1);
//		System.out.println();
//		for(int i = 0; i < list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
//		
//		int [] ar1 = new int [] {1,2,3,4};
//		int [] ar2 = new int [] {11,22,33,44,55};
//		int [] ar3 = new int [] {111,222,333};
//		
//		//1. �־��
//		list.add(ar1);
//		list.add(ar2);
//		list.add(ar3);
//
//		//2. ����غ���
//		for(int i = 0; i < list.size(); i++)
//		{
//			ar = list.get(i);
//			
//			for(int j = 0; j < ar.length; j++)
//			{
//				System.out.println(ar[j]);
//			}
//			System.out.println("------------------------");
//		}
		
		//����Ʈ�� ����Ʈ�� �ֱ⵵ ����
		List <List> llist = new ArrayList<>();
		//List ar;
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		
		llist.add(list1);
		llist.add(list2);
		
		list1.add(11);
		list1.add(12);
		list1.add(13);
		
		list2.add(21);
		list2.add(22);
		
		//���
//		for(int i = 0; i < llist.size(); i++)
//		{
//			ar = llist.get(i);
//			System.out.println(ar);
//		}
		
		List <Integer> target = null;
		
		for(int i = 0; i < llist.size(); i++)
		{
			target = llist.get(i);
			
			for(int j = 0; j < target.size(); j++)
			{
				System.out.println(target.get(j));
			}
			
			System.out.println("--------");
				
		}
		
		

		
		
				
	}

}
