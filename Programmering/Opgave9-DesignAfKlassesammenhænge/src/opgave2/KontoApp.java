package opgave2;

public class KontoApp {
	public static void main(String[] args) {
		Kontotype kontotype = new Kontotype("NEM-Konto", "Lønkonto", "Ting sker her");
		Konto konto = new Konto(kontotype);
		System.out.println(konto.beregnSaldo());
		konto.indsætbeløb(500);
		System.out.println(konto.getSaldo());
		konto.indsætbeløb(-1500);
		System.out.println(konto.getSaldo());

		konto.printKonto();
		konto.printTransaktioner();
		// Kommentar til første git commit :D
	}
}
