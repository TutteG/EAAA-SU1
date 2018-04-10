package opgave4;

public class Fugl extends Dyr {

	private double vingefang;
	private boolean traekfugl;
	private boolean flyvende;

	public Fugl(double vingefang, boolean traekfugl, boolean flyvende, boolean male, String name, boolean carnivore,
			String location, double speed) {
		super(male, name, carnivore, location, speed);
		// TODO Auto-generated constructor stub
		this.vingefang = vingefang;
		this.traekfugl = traekfugl;
		this.flyvende = flyvende;
	}

	public double getVingefang() {
		return vingefang;
	}

	public void setVingefang(double vingefang) {
		this.vingefang = vingefang;
	}

	public boolean isTraekfugl() {
		return traekfugl;
	}

	public void setTraekfugl(boolean traekfugl) {
		this.traekfugl = traekfugl;
	}

	public boolean isFlyvende() {
		return flyvende;
	}

	public void setFlyvende(boolean flyvende) {
		this.flyvende = flyvende;
	}

	@Override
	public void printDyr() {
		super.printDyr();
		System.out.println("Vingefang:	" + vingefang);
		System.out.println("Trækfugl: 	" + traekfugl);
		System.out.println("Flyve: 		" + flyvende);
	}

}
