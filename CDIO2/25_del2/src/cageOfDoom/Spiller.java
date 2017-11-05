package cageOfDoom;

public class Spiller {
	
	private int balance = 1000;
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

	public void setPengebeholdning(int point) {
		balance = balance + point;
		
	}
	

}
