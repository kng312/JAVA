public class Student 
{
	//�߻�ȭ �߿��� �� , �� �ȹٲ�� ��
	//�̸�
	String mName;
	//�г�
	int mGrade;
	//��ȣ
	int mNumber;
	
	// ������ --- ��ü�� �ʱ�ȭ�� ���� Ŭ������ �ν��Ͻ�ȭ �ɶ� ȣ��Ǵ� �Լ�
	// �ݵ�� �⺻ �����ڰ� �־�� �Ѵ�.
	Student()
	{
		mName = "noname";
		mGrade = 1;
		mNumber = 0;
	}
	// �Լ��� �̸��� ������ �Ķ��Ÿ�� �ٸ� �Լ��� ����� ��� function overloading
	// ������Ÿ���� �޶���Ѵ�.
	Student (String name, int grade , int number)
	{
		mName = name;
		mGrade = grade;
		mNumber = number;
	}
	
	void setName(String name)
	{
		//Student this s1�� �ּҸ� �޴´�.
		this.mName = name; //s1�ּҸ� ���� , ���� ������ ��ü
	}
	
	String getName()
	{
		return mName;
	}
}
