package opgave4;

public class Dyr {
	private boolean male;
	private String name;
	private boolean carnivore;
	private String location;
	private double speed;

	public Dyr(boolean male, String name, boolean carnivore, String location, double speed) {
		this.male = male;
		this.name = name;
		this.carnivore = carnivore;
		this.location = location;
		this.speed = speed;

	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCarnivore() {
		return carnivore;
	}

	public void setCarnivore(boolean carnivore) {
		this.carnivore = carnivore;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void printDyr() {
		System.out.println("Art:		" + name);
		if (male) {
			System.out.println("Køn: 		Han");
		} else {
			System.out.println("Køn: 		Hun");
		}
		if (carnivore) {
			System.out.println("Spiser:		Kød");
		} else {
			System.out.println("Spiser:		Planter");
		}
		System.out.println("Lokation: 	" + location);
		System.out.println("Hastighed:	" + speed);
	}

}
