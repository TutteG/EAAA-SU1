package opgave4;

public class DyrApp {
	public static void main(String[] args) {
		Fugl pingvin = new Fugl(10, false, false, true, "Pingvin", true, "Sydpolen", 100);
		pingvin.printDyr();

		Fisk soehest = new Fisk(true, "Søhest", false, "Bermuba", 300, false);
		soehest.printDyr();

		Pattedyr platypus = new Pattedyr(4, true, true, "Næbdyr", true, "Sydamerika?", 10);
		platypus.printDyr();
	}
}
