package opgave2;

public class Kontotype {
	private String navn;
	private String beskrivelser;
	private String betingelser;

	public Kontotype(String navn, String beskrivelser, String betingelser) {
		// TODO Auto-generated constructor stub
		this.navn = navn;
		this.beskrivelser = beskrivelser;
		this.betingelser = betingelser;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public String getNavn() {
		return navn;
	}

	public void setBeskrivelser(String beskrivelser) {
		this.beskrivelser = beskrivelser;
	}

	public String getBeskrivelser() {
		return beskrivelser;
	}

	public void setBetingelser(String betingelser) {
		this.betingelser = betingelser;
	}

	public String getBetingelser() {
		return betingelser;
	}
}
