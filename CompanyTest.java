package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company Com1 = Company.getInstance();
		Company Com2 = Company.getInstance();
		
		System.out.println(Com1);
		System.out.println(Com2);
		System.out.println(Com1 == Com2);

	}

}
