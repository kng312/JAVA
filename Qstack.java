package stack;
//1.�߻�ȭ�ܰ�
//-�迭(�⺻ 10 ��������� ������)
//-����Ʈ
//-����
//-�迭�� ũ��
//2.������
//-�⺻������(�迭 ũ�� 10)
//-�����ε��� ������(ũ�⸦ �Է¹޴´�.)
//3.�޼ҵ�
//-boolean push(int data)		 //ť�� �����͸� �ִ� �޼ҵ�
//-boolean pop()          		 // ť���� �����͸� ����
//-int loop						//��ŧ�� ť
public class Qstack {
	
	int Q_SIZE = 10;
	int [] mData;		//ť �迭
	int mFront;			//����Ʈ
	int mRear;			//����
	int mSize;			//�迭�� ũ��
	
	Qstack()
	{
		mData = new int [Q_SIZE];
		mFront = 0;
		mRear = 0;
		mSize = Q_SIZE;
	}
	
	Qstack (int size)
	{
		mData = new int [size];
		mFront = 0;
		mRear = 0;
		mSize = size;
	}
	

	
	

}
