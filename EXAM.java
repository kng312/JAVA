package gen2;

import java.util.*;
public class EXAM {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		String str;
		
		list.add("1이다");
		list.add("2이다");
		list.add("3이다");
		
//		for(int i = 0; i < list.size(); i++)
//		{
//			System.out.println(list.get(i));
//		}
		
		// enhanced-for 문
//		for(String str : list)
//		{
//			System.out.println(str);
//		}
		
		/*
		 * Iterator 반복자 */
		
		Iterator<String> iter = list.iterator();
		
		while(iter.hasNext())
		{
			str = iter.next();
			System.out.println(str);
		}
		
		
		

	}

}
