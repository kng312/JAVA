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
	
	//ACPU���忡�� ����Ŭ������ �ٲٸ� �ȵȴ�. �������̵� �ϱ�
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
