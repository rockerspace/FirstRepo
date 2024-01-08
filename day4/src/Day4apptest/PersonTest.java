package Day4apptest;

	import day4app.Address;
import day4app.Person;

public class PersonTest {

	public static void main(String[] args) {
		Address address=new Address("HYD", "INDIA");
		Person p=new Person(101, "KUMAR", address);
		
		System.out.println(p);

	}

}
