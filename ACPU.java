package isahasa;

//ACPU is a kind of cpu
//���� �������� �������� �� �����̴�.
public class ACPU extends cpu{
	
	
	
	public ACPU()
	{
		System.out.println("CALL ACPU");
	}
	
	//�������̵� ������	����Ŭ������ ��������ʰ� ���� �������̽��� ������ ���� �����佺�� ��� + ����Ŭ������ ����� ��ȣ
	public void setOverClock(float multiple)
	{
		if(multiple > 4.0f)
			return;
		clock = clock * multiple;
	}

}
