package opgave3;

public class NedarvningTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Person:");

		Person person = new Person("Hanne", "Sydbakken 27", "Datalog");

		Student student = new Student("Margrethe", "Ringvej 7", "STX", 9.5, "DMU01");

		Teacher teacher = new Teacher("Dorthe", "Dortheavej", "Fucking Ekspert", 1000.0);

		person.udskrivPerson();

		System.out.println();

		System.out.println("Student:");

		student.udskrivPerson();// kalder overrided metode

		System.out.println();

		student.udskrivAdresse(); // kalder egen metode

		System.out.println(student.getName()); // kalder nedarvet metode

		// Test af metoder
		teacher.udskrivPerson();
		System.out.println();
		System.out.println();
		teacher.setEkspert();
		teacher.udskrivPerson();
		System.out.println();
		System.out.println();
		teacher.setSalary(5000);
		teacher.udskrivPerson();
		System.out.println();
		System.out.println();
		teacher.setName("Jens");
		teacher.udskrivPerson();
	}

}
