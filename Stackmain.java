

public class Stackmain {

	public static void main(String[] args) {
		
		Stack st1 = new Stack (5);
		
		boolean res;
		
		res = st1.push(100);
		res = st1.push(200);
		res = st1.push(300);
		res = st1.push(400);
		res = st1.push(500);
		
		res = st1.pop();
		res = st1.pop();
		res = st1.pop();
		
		res = st1.push(600);
		
		

	}

}
