package Interface;

public interface MSprinter 
{	
	//interface 의 변수 자체가 final, public, static 성격을 가지고 있다.
	int MAX_color = 5000;
	
	
	//1.프린터 초기화
	public boolean init(int dev);
	
	//2.프린터 시작
	public boolean start(int dev);
	
	//3.긴급정지
	public void stop(int dev);

}
