package isahasa;

public class cpu {
	
	private int CoreCount;
	protected float clock;
	
	public cpu()
	{
		CoreCount = 1;
		clock = 1.0f;
	}
	
	public cpu(int core_count)
	{
		CoreCount = core_count;
		clock = 1.0f;
	}
	
	//ACPU입장에서 상위클래스를 바꾸면 안된다. 오버라이딩 하기
	public void setOverClock(float multiple)
	{
		if(multiple > 2.0f)
			return;
		clock = clock * multiple;
	}
	
	public float getClock()
	{
		return clock;
	}
	
	public int getCoreCount()
	{
		return CoreCount;
	}

}
