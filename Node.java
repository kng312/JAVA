package LinkedList;

public class Node
{
	static int NodeCount;		// 노드의 개수
	
	private int mID;			// ID
	private String mData;		// 구색용 데이터
	
	private Node mNext;			// 다음노드의 참조값를 저장하는 변수
	
		
	Node()
	{
		mID = 1000 + NodeCount;
		mData = "nodata";
		mNext = null;
		
		NodeCount++;		
	}

	// 아이디를 리턴하는 메소드
	public int getID()
	{
		return mID;
		
	}

	// 데이터를 리턴하는 메소드
	public String getData()
	{
		return mData;
	}
	
	// 다음 노드의 참조값을 리턴하는 메소드
	public Node getNextNode()
	{
		return mNext;
	}
	
	// 다음노드를 세팅해주는 메소드
	public void setNextNode(Node node)
	{
		mNext = node;
	
	}
	
}
