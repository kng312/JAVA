package singleton;

public class Company {
	//�̱��� ����
	//�ν��Ͻ��� �� �ϳ��� �����ϴ� ������ ����
	//static �� �����Ͽ� ���α׷� ���ݿ��� ����ϴ� �ν��Ͻ��� �ϳ��� �����ϴ� ���
	
	//Company �ν��Ͻ��� ������ �� ���� private���� ����
	private Company(){}
	
	//�����ϰ� ������ �ν��Ͻ�
	private static Company instance = new Company();
	
	//�ܺο��� �����ϵ��� get�޼��� ����
	public static Company getInstance() 
	{
		if(instance == null)
		{
			instance = new Company();
		}
		return instance;
	}
}
