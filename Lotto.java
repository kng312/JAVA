
public class Lotto {
	//1�� �߻�ȭ
	int [] marNumber = new int [6];
	//2�� ������
	Lotto()
	{
		//�߰����� �ڵ�� ���⿡ �ۼ�.
	}
	//3�� �޼ҵ�
	
	//�ζ� ��ȣ�� �����ϴ� �޼ҵ�
	boolean genLottoNumber()
	{
		int pos = 0;
	    int nNumber;
	    boolean isExist = false;
	    
	    while(pos < marNumber.length)
	      {
	         //1. ��ȣ����
	         
	    	nNumber = (int)(Math.random()*45) + 1;

	              //2. �� ��ȣ�� �����ϴ���
	            for(int k = 0; k < marNumber.length; k++)
	            {   
	               //�̹� ��ȣ�� ������
	               if(nNumber == marNumber[k])
	               {
	                     isExist = true;
	                     break;
	               }
	            }
	              //�������� ������ ���� �� �����迭
	            if (isExist == false)
	            {
	            	marNumber[pos] = nNumber;
	               pos = pos + 1;
	         
	            }
	            else
	            {
	               isExist = false;
	            }
	      
	      }
		return true; // �� �Լ��� ������ �׽�Ʈ �Ҷ� ������ ���ų� ������ ��� �ٸ� ����� ���� �� �ִ�.
					// ������ true �� �ϴ� ����

//		// boolean �� ��� �ϴ� ������ ������ �� �� �ֱ� ����
//		lo.genLottoNumber();
//		System.out.println("�ζ� ��ȣ ������ �����߻�");
	}
	
	//�ζ� ��ȣ�� �������ִ� �Լ�.
	void getNumber(int [] arTarget)
	{
		for (int i = 0; i < marNumber.length; i++ )
		{
			arTarget[i] = this.marNumber[i];
		}
	}
	
	
	
}
