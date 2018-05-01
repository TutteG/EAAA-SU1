package opgave3medarbejder;

public class Medarbejder {
	private String navn;
	private int iD;
	private String brugernavn;
	private String kodeord;
	private String[] kompetencer;
	private boolean teamLeder;

	public Medarbejder(String navn, String brugernavn, String[] kompetencer) {
		this.navn = navn;
		this.brugernavn = brugernavn;
		this.kompetencer = kompetencer;
		this.teamLeder = false;
		setID(); // lav en random metode til at sætte ID
		setKodeord(); // lav metode der generer et random kodeord
	}

	public boolean getTeamleader() {
		return this.teamLeder;
	}

	public void setTeamleader(boolean teamleder) {
		this.teamLeder = teamleder;
	}

	public String getBrugernavn() {
		return this.brugernavn;
	}

	public void setBrugernavn(String brugernavn) {
		this.brugernavn = brugernavn;
	}

	public void setKodeord() {
		int range = (9999 - 1000) + 1;
		range = (int) (Math.random() * range) + 1000;
		this.kodeord = "" + range;
	}

	public void setKodeord(String kodeord) {
		this.kodeord = kodeord;
	}

	public String getKodeord() {
		return this.kodeord;
	}

	public void setID() {
		int range = (999999 - 100000) + 1;
		range = (int) (Math.random() * range) + 100000;
		this.iD = range;
	}

	public int getID() {
		return iD;
	}

	public void printMedarbejder() {
		System.out.println();
		System.out.println();
		System.out.println("Medarbejder information");
		System.out.println("Navn: " + navn);
		System.out.println("Brugernavn: " + brugernavn);
		System.out.println("Medarbejder ID: " + iD);
		System.out.println("Kompetencer:");
		for (int i = 0; i < kompetencer.length; i++) {
			System.out.println(kompetencer[i]);
		}
		if (teamLeder) {
			System.out.println("Medarbejder er teamleder");
		} else {
			System.out.println("Medarbejder er ikke teamleder");
		}
	}
}
