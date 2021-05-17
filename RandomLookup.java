
public class RandomLookup {

	public static void main(String[] args) {
		//0~12사이의 임의의 값을 생성한다.
			// 생성된 숫자를 20크기의 배열에 차례로 저장한다.
				//배열에 0~12사이의 숫자가 존재하는지 검사.
				
		int [] arTarget = new int [20]; // 랜덤 넘버 저장
		int rn = (int)(Math.random() * 13); // 랜덤 넘버 생성
		int val;                            // 타겟 배열의 값
				
		for (int i = 0; i < arTarget.length; i++)
		{
			rn = (int)(Math.random() * 13);
			arTarget[i] = rn;
		}
				
		//룩업 테이블
		boolean [] arTable = new boolean [13];
				
		for (int i = 0; i < arTable.length; i++)
		{
			arTable[i] = false;
		}
				
		// 랜덤 넘버를 검사
		for (int i = 0; i < arTarget.length; i++)
		{
			val = arTarget[i];
			arTable[val] = true;
		}
				
		// 출력
		for (int i = 0; i < arTable.length; i++)
		{
			if (arTable[i] == false)
			{
				System.out.println(i + "값이 없습니다.");
			}
		}
				
		System.out.println("프로그램이 끝났습니다.");

		}

	}
