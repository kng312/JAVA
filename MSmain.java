package Interface;

public class MSmain {

	public static void main(String[] args) 
	{
		HPprinter hpp = new HPprinter();
		SSprinter ssp = new SSprinter();
		
		System.out.println(MSprinter.MAX_color);
		
		hpp.init(0);
		hpp.start(0);
		hpp.stop(0);
		
		ssp.init(0);
		ssp.start(0);
		ssp.stop(0);

	}

}
