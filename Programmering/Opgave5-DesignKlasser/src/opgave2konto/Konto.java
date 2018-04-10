package opgave2konto;

public class Konto {
	private int kontoNr;
	private int saldo;
	private String kontotype;

	public Konto(String kontotype, int kontoNr) {
		this.kontotype = kontotype;
		this.kontoNr = kontoNr;
		this.saldo = 0;
	}

	public void deposit(int beloeb) {
		this.saldo += beloeb;
	}

	public int getSaldo() {
		return this.saldo;
	}

}
