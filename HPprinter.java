package Interface;

public class HPprinter implements MSprinter
{
	//1. ������ �ʱ�ȭ
	public boolean init(int dev)
	{
		System.out.println(MAX_color);
		System.out.println("Hp init");
		return true;
	}
	
	//2. ������ ����
	public boolean start(int dev)
	{
		System.out.println("Hp start");
		return true;
	}
	
	//3. �������
	public void stop(int dev)
	{
		System.out.println("Hp terminate");
	}

}
