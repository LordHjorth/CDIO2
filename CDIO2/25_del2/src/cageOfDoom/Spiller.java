package cageOfDoom;

public class Spiller {

	private int balance = 0;
	private String navn;

	public Spiller(String navn) {
		this.navn = navn;
	}

	public int getBalance() {
		return balance;
	}

	public String getNavn() {
		return navn;
	}

	public int setPengebeholdning(int point) {
		balance = balance + point;

		if (balance < 0) {
			balance = 0;
		}
		
		return balance;
	}

}
