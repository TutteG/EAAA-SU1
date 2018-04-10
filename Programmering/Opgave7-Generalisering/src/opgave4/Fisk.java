package opgave4;

public class Fisk extends Dyr {
	private boolean ferskvand;

	public Fisk(boolean male, String name, boolean carnivore, String location, double speed, boolean ferskvand) {
		super(male, name, carnivore, location, speed);
		// TODO Auto-generated constructor stub
		this.setFerskvand(ferskvand);

	}

	public boolean isFerskvand() {
		return ferskvand;
	}

	public void setFerskvand(boolean ferskvand) {
		this.ferskvand = ferskvand;
	}

	@Override
	public void printDyr() {
		super.printDyr();
		if (ferskvand) {
			System.out.println("Svømmer i:	Ferskvand");
		} else {
			System.out.println("Svømmer i:	Saltvand");
		}

	}

}
