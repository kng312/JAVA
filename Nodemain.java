package LinkedList;

public class Nodemain {

	public static void main(String[] args) 
	{
		//10���� ��带 �����.
		//ù ��° ���� ��� ���������� �����Ѵ�.
		// id�� ����Ʈ �غ���
		
		// 1. ��带 �Ҵ��Ѵ�.
		// 2. ���� ù ����� ��� ���������� �����Ѥ�.
		// 3. ù ��尡 �ƴѰ��� ���� ����� ���������� next�� �����ؾ��Ѵ�. 
		Node new_node = null;
		Node header_node = null;
		
		Node current_node = null;
		
		for (int i = 0; i < 10; i++)
		{
			//1.��带 �Ҵ��Ѵ�.
			new_node = new Node();
			//2.���� ù ����� ������������� �����Ѵ�.
			if (i == 0)
				header_node = new_node;
			else		
				// 3. ù ��尡 �ƴѰ��� ���� ����� ���������� next�� �����ؾ��Ѵ�. 
				current_node.setNextNode(new_node);
			
			current_node = new_node;
		}
		
		for (int i = 0; i < 10; i++)
		{
			if (i == 0)
			{
				current_node = header_node;
			}
			else
			{
				current_node = current_node.getNextNode();
			}
			
			System.out.println(current_node.getID());
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Node new_node = null;
//		Node header_node = null;
//		
//		for (int i = 0; i < 10; i++)
//		{
//			new_node = new Node();
//			
//			//����ؼ��� ó���ؾ���.
//			
//			if(i == 0)
//			{
//				header_node = new_node;
//				
//				
//			}
//			else
//			{
//				
//				
//				
//				
//				
//			}	
			
}

		
		
		
		
		
		

	}


