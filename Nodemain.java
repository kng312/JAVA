package LinkedList;

public class Nodemain {

	public static void main(String[] args) 
	{
		//10개의 노드를 만든다.
		//첫 번째 노드는 헤더 참조변수에 저장한다.
		// id를 프린트 해보자
		
		// 1. 노드를 할당한다.
		// 2. 만약 첫 노드라면 헤더 참조변수에 저장한ㄷ.
		// 3. 첫 노드가 아닌경우는 이전 노드의 참조변수인 next에 저장해야한다. 
		Node new_node = null;
		Node header_node = null;
		
		Node current_node = null;
		
		for (int i = 0; i < 10; i++)
		{
			//1.노드를 할당한다.
			new_node = new Node();
			//2.만약 첫 노드라면 헤더참조변수에 저장한다.
			if (i == 0)
				header_node = new_node;
			else		
				// 3. 첫 노드가 아닌경우는 이전 노드의 참조변수인 next에 저장해야한다. 
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
//			//어떻게해서든 처리해야해.
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


