package wildcards;

public class Main {

	public static void main(String[] args) {
		
		Box<Integer> bx = new Box<>();
		
		Box<Object> bx2 = new Box<>();
		
		bx.set(1);
		BoxHandler.peekBox(bx);
		
		//BoxHandler.peekBox(bx2);

	}

}
