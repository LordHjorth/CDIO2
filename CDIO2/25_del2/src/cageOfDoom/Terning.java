package cageOfDoom;

import java.util.Random;

public class Terning {

	Random random = new Random();

	private int terning1;
	private int terning2;
	private int sum;

	public Terning(int terning1, int terning2) {
		this.terning1 = terning1;
		this.terning2 = terning2;
	}

	public void random() {
		terning1 = random.nextInt(6) + 1;
		terning2 = random.nextInt(6) + 1;
	}

	public int getSum() {
		sum = terning1 + terning2;
		return sum;
	}

	public int getTerning1() {
		return terning1;
	}

	public int getTerning2() {
		return terning2;
	}

}
