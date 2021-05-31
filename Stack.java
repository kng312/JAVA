
//1.�߻�ȭ�ܰ�
//-�迭(�⺻ 10 ��������� ������)
//-��ġ����
//-�迭�� ũ��
//2.������
//-�⺻������(�迭 ũ�� 10)
//-�����ε��� ������(ũ�⸦ �Է¹޴´�.)
//3.�޼ҵ�
//-boolean push(int data)		 //���ÿ� �����͸� �ִ� �޼ҵ�
//-boolean pop()          		 // ���ÿ��� �����͸� ����
//-boolean getData(int [] arData) 	 //�����͸� �����´�
//-void printData()
public class Stack {
	//int 10���� �迭�� �̷���� ���� Ŭ������ �����Ͻÿ�
	// 1. int 10���� �迭�� �����.
	// 2. ����Ŭ������ ����?
	
	final int DEF_SIZE = 10;
	private int [] mData;		//����������
	private int mPos;			//��ġ����(Stack Pointer)
	private int mSize;			//�迭�� ũ��
	
	//�⺻������(�迭 ũ�� 10)
	Stack ()
	{
		mData = new int [DEF_SIZE];
		mPos = -1;
		mSize = DEF_SIZE;
	}
	
	//�����ε��� ������(ũ�⸦ �Է¹޴´�.)
	
	Stack (int size)
	{
		mData = new int [size];
		mPos = -1;
		mSize = size;
	}
	
	//�޼ҵ�
	boolean push(int data) 							 //���ÿ� �����͸� �ִ� �޼ҵ�
	{
		if (mPos < mSize - 1)
		{
			mPos++;
			mData[mPos] = data;
					
		}
		else 
			{return false;}
		
		return true;
	}
	boolean pop()									// ���ÿ��� �����͸� ����
	{
		if (mPos != -1)
		{
			mData[mPos] = 0;						//�����͸� 0���� �ʱ�ȭ ���ش�.
			mPos--;
			return true;
		}
		return false;
	}
	boolean getData(int [] arData)					//�����͸� �����´�
	{
		if (mPos != -1)
		{
			arData[0] = mData[mPos];
			return true;
		}
		return true;
	}
	void printData()
	{return;}
	

}
