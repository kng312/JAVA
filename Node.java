package LinkedList;

public class Node
{
	static int NodeCount;		// ����� ����
	
	private int mID;			// ID
	private String mData;		// ������ ������
	
	private Node mNext;			// ��������� �������� �����ϴ� ����
	
		
	Node()
	{
		mID = 1000 + NodeCount;
		mData = "nodata";
		mNext = null;
		
		NodeCount++;		
	}

	// ���̵� �����ϴ� �޼ҵ�
	public int getID()
	{
		return mID;
		
	}

	// �����͸� �����ϴ� �޼ҵ�
	public String getData()
	{
		return mData;
	}
	
	// ���� ����� �������� �����ϴ� �޼ҵ�
	public Node getNextNode()
	{
		return mNext;
	}
	
	// ������带 �������ִ� �޼ҵ�
	public void setNextNode(Node node)
	{
		mNext = node;
	
	}
	
}
