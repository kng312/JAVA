package Interface;

public class SSprinter implements MSprinter
{
	//1.프린터 초기화
	public boolean init(int dev)
	{
		
		System.out.println("삼성 프린터 초기화");
		return true;
	}
		
	//2.프린터 시작
	public boolean start(int dev)
	{
		System.out.println("삼성 프린터 시작");
		return true;
	}
		
	//3.긴급정지
	public void stop(int dev)
	{
		System.out.println("삼성 프린터 정지");
	}

}
