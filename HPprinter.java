package Interface;

public class HPprinter implements MSprinter
{
	//1. 프린터 초기화
	public boolean init(int dev)
	{
		System.out.println(MAX_color);
		System.out.println("Hp init");
		return true;
	}
	
	//2. 프린팅 시작
	public boolean start(int dev)
	{
		System.out.println("Hp start");
		return true;
	}
	
	//3. 긴급정지
	public void stop(int dev)
	{
		System.out.println("Hp terminate");
	}

}
