package isahasa;

public class iphon extends smartphon{
	
	public iphon() 
	{
		System.out.println("call iphon");
		
		color = "black";
	}
	
	public iphon(String color)
	{
		this.color = color;
		
	}
	
	public iphon(String color,int camCount)
	{
		super(camCount);	//오버로딩된 상위생성자를 호출
		this.color = color;
		//this.camCount = camCount;
		
	}
	
	private String color;
	
	String getColor() {return this.color;}
	




}
