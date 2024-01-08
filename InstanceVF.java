package day4app;

public class InstanceVF {
	// Instance Variables
	int no = 101;
	String name = "RAmana";

	InstanceVF()
	{
		System.out.println(" Default Constructor.........");
	}
	public static void main(String[] args) {
		display();
		InstanceVF ivf = new InstanceVF();

		System.out.println(" No value " + ivf.no);
		System.out.println(" No value " + ivf.name);
		ivf.show();
	}

	// Instance Method
	void show() {
		System.out.println("Instace Methods");
	}

	static void display() {
		System.out.println("Static Methods");
	}

}