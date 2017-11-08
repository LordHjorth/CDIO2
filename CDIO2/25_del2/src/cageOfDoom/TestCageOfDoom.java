package cageOfDoom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCageOfDoom {
	Spiller testSpiller = new Spiller("testSpiller");

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getNavn() {
		String expected = "testSpiller"; // der forventes at penegbholdningen er 1000 ved opstart af programmet
		String actual = testSpiller.getNavn();
		assertEquals("Navnene matcher ikke", expected, actual);
	}

	@Test
	public void getBalance() {
		int expected = 1000; // der forventes at pengebeholdningen er 1000 ved opstart af programmet
		int actual = testSpiller.getBalance();
		assertEquals("balancen matcher ikke", expected, actual);

	}

	@Test
	public void setPengebeholdning() {
		testSpiller.setPengebeholdning(+2000);
		int expected = 3000; // der forventes at penegbholdningen er de 1000 fra start + 2000 altså 3000
		int actual = testSpiller.getBalance();
		assertEquals("balancen matcher ikke", expected, actual);

	}

	@Test
	public void getBalance2() {
		testSpiller.setPengebeholdning(-20000);
		int expected2 = 0; // der forventes at penegbholdningen bliver sat til 0, når den samlet bliver negativ
		int actual2 = testSpiller.getBalance();
		assertEquals("balancen matcher ikke", expected2, actual2);

	}

	@Test
	public void random() {  // test af randomfunktionen, for at se om sandsynligheden af summen stemmer overens med den teroretiske
		Terning testTerning = new Terning(1, 1);

		int[] sum = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};

		int i = 0;
		while (i < 100000) { //terningerne rulles 100.000 gange

			testTerning.random();

			switch (testTerning.getSum()) {  
			case 2:
				sum[0]++;
				break;
			case 3:
				sum[1]++;
				break;
			case 4:
				sum[2]++;
				break;
			case 5:
				sum[3]++;
				break;
			case 6:
				sum[4]++;
				break;
			case 7:
				sum[5]++;
				break;
			case 8:
				sum[6]++;
				break;
			case 9:
				sum[7]++;
				break;
			case 10:
				sum[8]++;
				break;
			case 11:
				sum[9]++;
				break;
			case 12:
				sum[10]++;
				break;
			}
			i++;
		}
		System.out.println("sum\tforekomst");
		for (int v = 0; v < sum.length; v++) {
			System.out.print(v + 2);
			System.out.print("\t");
			System.out.println(sum[v]);

		}

	}
}
