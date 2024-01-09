package abstractdemo;

public class AbstractDemo {

	 public static  final double PI=3.14;
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PI=100;
		Telivision t=new Telivision();
		t.off1();
		t.on1();
		t.monitor();
		t.display();
		t.show();
		t.view();
		
		Remote r=new Telivision();
		
		r.on1();
		r.off1();
		r.display();
		r.show();
		r.view();
		

	}

}
		

	




