
public class Max_function {

	public static void main(String[] args) {
		//13, 19, 38, 22, 4 값을 배열에 저장하고 이 값들 중 가장 큰 값을 찾으시오 또한 가장 큰 값의 위치(배열인덱스)를 구하시오.
		
//		//배열에 값을 저장
//		int [] ar = new int [] {13, 19, 38, 22, 4, 51, 3};
//		//큰값을 찾기
//		int Max_value = ar[0];
//		int Max_Index = 0;
//		
//		for (int i = 0; i < ar.length; i++)
//		{
//			if (Max_value < ar[i])
//			{
//				Max_value = ar[i];
//				Max_Index = i;        //큰값 위치 찾기
//			}
//		}
//		System.out.println(Max_value);
//		System.out.println(Max_Index);
		
		
		// 함수로 표현
		int [] arsource = new int [] {13, 19, 38, 22, 4, 51, 3};
		
		int max_Value = getMaxValue(arsource);
		int max_Index = getMaxIndex(arsource);
		
		int min_Index = getMinIndex(arsource);
		
		System.out.println(max_Value);
		System.out.println(max_Index);
		
		System.out.println(min_Index);
	}
	
	public static  int  getMaxIndex (int [] ar)
	{
		int max_Value = ar[0];
		int max_Index = 0;
		
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] > max_Value)
			{
				max_Value = ar[i];
				max_Index = i;
			}
		}
		return max_Index;
	}
	
	
	public static  int  getMaxValue (int [] ar)
	{
		int max_Value = ar[0];
		
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] > max_Value)
			{
				max_Value = ar[i];
			}
		}
		return max_Value;
	}
	
	public static  int  getMinIndex (int [] ar)
	{
		int min_Value = ar[0];
		int min_Index = 0;
		
		for (int i = 0; i < ar.length; i++)
		{
			if (ar[i] < min_Value)
			{
				min_Value = ar[i];
				min_Index = i;
			}
		}
		return min_Index;
	}
}
