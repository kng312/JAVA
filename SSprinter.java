package Interface;

public class SSprinter implements MSprinter
{
	//1.������ �ʱ�ȭ
	public boolean init(int dev)
	{
		
		System.out.println("�Ｚ ������ �ʱ�ȭ");
		return true;
	}
		
	//2.������ ����
	public boolean start(int dev)
	{
		System.out.println("�Ｚ ������ ����");
		return true;
	}
		
	//3.�������
	public void stop(int dev)
	{
		System.out.println("�Ｚ ������ ����");
	}

}
