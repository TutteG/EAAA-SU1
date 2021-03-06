package opgave2;

import java.util.ArrayList;

public class Konto {
	private int nr;
	private Kontotype kontotype;
	private ArrayList<Transaktion> transaktioner = new ArrayList<Transaktion>();
	private int saldo;

	public Konto(Kontotype kontotype) {
		// TODO Auto-generated constructor stub
		this.kontotype = kontotype;
	}

	public void indsætbeløb(int beløb) {
		Transaktion transaktion = new Transaktion(beløb);
		transaktioner.add(transaktion);
		beregnSaldo();
	}

	public int beregnSaldo() {
		int saldo = 0;
		for (Transaktion transaktion : transaktioner) {
			saldo += transaktion.getBeløb();
		}
		this.saldo = saldo;
		return saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void printKonto() {
		// TODO Auto-generated method stub
		System.out.println("Kontonavn:		" + kontotype.getNavn());
		System.out.println("Kontonr:		" + nr);
		System.out.println("Kontobeskrivelse:	" + kontotype.getBeskrivelser());
		System.out.println("Saldo:			" + getSaldo());
	}

	public void printTransaktioner() {
		int antaltransaktioner = 0;
		System.out.println("Transaktioner på:	" + kontotype.getNavn());

		for (Transaktion transaktion : transaktioner) {
			System.out.println("Transaktionsdato:	" + transaktion.getDato());
			System.out.println("Beløb:			" + transaktion.getBeløb());
			antaltransaktioner++;
		}
		System.out.println("Antal transaktioner:	" + antaltransaktioner);
	}
}
