package opgave3medarbejder;

public class MedarbejderApp {
	public static void main(String[] args) {
		String[] komp = { "Ekspert", "Programmør", "Teamplayer" };

		Medarbejder m1 = new Medarbejder("Jens", "Jens", komp);
		System.out.println(m1.getKodeord());
		m1.setKodeord("Niels");
		System.out.println(m1.getKodeord());
		m1.printMedarbejder();
	}
}
