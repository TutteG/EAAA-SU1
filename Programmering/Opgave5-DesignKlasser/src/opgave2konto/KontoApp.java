package opgave2konto;

public class KontoApp {
	public static void main(String[] args) {
		Konto konto = new Konto("Opsparingskonto", 80000000);
		konto.deposit(100);
		System.out.println(konto.getSaldo() + " DKK");

	}
}
