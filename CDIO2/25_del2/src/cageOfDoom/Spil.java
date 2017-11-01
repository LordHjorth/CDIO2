package cageOfDoom;

import javax.swing.JOptionPane;

import desktop_board.Board;
import desktop_resources.GUI;

public class Spil {

	public void opretSpil() {

		Spiller spiller1 = new Spiller(JOptionPane.showInputDialog("Indtast navn, spiller 1"));
		Spiller spiller2 = new Spiller(JOptionPane.showInputDialog("Indtast navn, spiller 2"));

		GUI.addPlayer(spiller1.getNavn(), spiller1.getBalance());
		GUI.addPlayer(spiller2.getNavn(), spiller2.getBalance());

		Terning terning = new Terning(0, 0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		GUI.getUserButtonPressed("Din tur " + spiller2 + " - tryk på knappen for at kaste terningerne",
				"Kast terningerne");
		terning.random(); // kaster terningerne
		GUI.setDice(terning.getTerning1(), terning.getTerning2());
	}
}
