package isahasa;

public class smartphon extends computer{
	
	protected int camCount;	//카메라 갯수	하위클래스에서 가져오기 위해 protected사용
	
	smartphon() 
	{
		System.out.println("call");
		camCount = 1;
	}
	

	smartphon(int camCount) 
	{
		System.out.println("call");
		this.camCount = camCount;
	}
	
	public int getCamCount()
	{
		return camCount;
	}
	
	

	

	


}
