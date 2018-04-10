package opgave4;

public class Pattedyr extends Dyr {

	private int ben;
	private boolean egg;

	public Pattedyr(int ben, boolean egg, boolean male, String name, boolean carnivore, String location, double speed) {
		super(male, name, carnivore, location, speed);
		// TODO Auto-generated constructor stub
		this.setBen(ben);
		this.setEgg(egg);
	}

	public int getBen() {
		return ben;
	}

	public void setBen(int ben) {
		this.ben = ben;
	}

	public boolean isEgg() {
		return egg;
	}

	public void setEgg(boolean egg) {
		this.egg = egg;
	}

	@Override
	public void printDyr() {
		super.printDyr();
		System.out.println("Ben: 		" + ben);
		if (!egg) {
			System.out.println("Lægger ikke æg");
		} else {
			System.out.println("Lægger æg");
		}

	}
}
