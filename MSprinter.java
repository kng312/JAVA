package Interface;

public interface MSprinter 
{	
	//interface �� ���� ��ü�� final, public, static ������ ������ �ִ�.
	int MAX_color = 5000;
	
	
	//1.������ �ʱ�ȭ
	public boolean init(int dev);
	
	//2.������ ����
	public boolean start(int dev);
	
	//3.�������
	public void stop(int dev);

}
