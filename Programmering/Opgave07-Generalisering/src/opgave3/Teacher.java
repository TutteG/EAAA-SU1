package opgave3;

public class Teacher extends Person {
	private double salary;
	private boolean ekspert;

	public Teacher(String name, String address, String qualification, double salary) {
		super(name, address, qualification);
		// TODO Auto-generated constructor stub
		this.salary = salary;
		this.ekspert = false;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double yearSalary() {
		return (salary * 12) * 1.125;
	}

	public boolean getEkspert() {
		return ekspert;
	}

	public void setEkspert() {
		if (ekspert) {
			ekspert = false;
		} else {
			ekspert = true;
		}
	}

	@Override
	public void udskrivPerson() {
		super.udskrivPerson();
		System.out.println("Løn:		" + salary);
		System.out.println("Årsløn:		" + yearSalary());
		System.out.println("Ekspert:	" + ekspert);
	}

}
