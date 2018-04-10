package opgave2;

import java.time.LocalDate;

public class Transaktion {
	private int beløb;
	private LocalDate dato;

	public Transaktion(int beløb) {
		// TODO Auto-generated constructor stub
		this.beløb = beløb;
		this.dato = LocalDate.now();
	}

	public int getBeløb() {
		return beløb;
	}

	public LocalDate getDato() {
		return dato;
	}
}
