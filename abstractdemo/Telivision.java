package abstractdemo;

public class Telivision extends Remote{

	
	Telivision()
	{
	super();	
	}
	@Override
	public void on1() {
		System.out.println("Switch On Telivision");
	}

	@Override
	public void off1() {
		System.out.println("Switch Off Telivision");
	}
	
	public void monitor()
	{
		System.out.println(" Monitor....");
	}
	
	
}
	
	



