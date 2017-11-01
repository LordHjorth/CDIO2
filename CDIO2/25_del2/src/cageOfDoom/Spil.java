package cageOfDoom;

import desktop_board.Board;
import desktop_resources.GUI;

public class Spil {

	public void opretSpil() {
	
	Terning terning = new Terning(0,0);
		
	int runde = 1;
	
	 if (terning.getPoint2() > terning.getPoint1()) {
     	GUI.showMessage("TILLYKKE TIL "+spiller2.toUpperCase());
     	Board.destroy();

				if (runde % 2 == 0) { // Hvis runde modulus 2 er lig 0, så er det spiller 2s tur,
					GUI.getUserButtonPressed("Din tur " + spiller2 + " - tryk på knappen for at kaste terningerne",
							"Kast terningerne");
					terning.random(); // kaster terningerne
					GUI.setDice(terning.getTerning1(), terning.getTerning2());


					// GUI.setBalance(spiller2, terning.setPoint2(terning.getSum()));

				}

				if (runde % 2 != 0) {

					GUI.getUserButtonPressed("Din tur " + spiller1 + " - tryk på knappen for at kaste terningerne",
							"Kast terningerne");
					terning.random(); // kaster terningerne
					GUI.setDice(terning.getTerning1(), terning.getTerning2());

					GUI.setBalance(spiller1, terning.setPoint1(terning.getSum()));

				} else {

				}
				runde++;

			}
	
	}	
}
}
