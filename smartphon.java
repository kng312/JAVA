package isahasa;

public class smartphon extends computer{
	
	protected int camCount;	//ī�޶� ����	����Ŭ�������� �������� ���� protected���
	
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
