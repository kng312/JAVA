package gen2;

import java.util.*;
public class EXAM {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String str;
		
		list.add("1�̴�");
		list.add("2�̴�");
		list.add("3�̴�");
		
//		for(int i = 0; i < list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		// enhanced-for ��
//		for(String str : list)
//		{
//			System.out.println(str);
//		}
		
		/*
		 * Iterator �ݺ��� */
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext())
		{
			str = iter.next();
			System.out.println(str);
		}
		
		
		

	}

}
