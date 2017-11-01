package cageOfDoom;

import java.awt.Color;

import javax.swing.JOptionPane;

import desktop_board.Board;
import desktop_codebehind.Car;
import desktop_codebehind.Car.Builder;
import desktop_resources.GUI;

public class Spil {

	public static void opretSpil() {

		Spiller spiller1 = new Spiller(JOptionPane.showInputDialog(null, "Indtast navn, spiller 1","Cage of Doom ", JOptionPane.PLAIN_MESSAGE));
		Spiller spiller2 = new Spiller(JOptionPane.showInputDialog(null, "Indtast navn, spiller 2","Cage of Doom ", JOptionPane.PLAIN_MESSAGE));

		Car car1 = new Car.Builder().typeRacecar().primaryColor(Color.BLACK).build(); 
		Car car2 = new Car.Builder().typeUfo().primaryColor(Color.orange).build();
		
		GUI.addPlayer(spiller1.getNavn(), spiller1.getBalance(), car1);
		GUI.addPlayer(spiller2.getNavn(), spiller2.getBalance(), car2);
		GUI.setCar(1, spiller1.getNavn());
		GUI.setCar(1, spiller2.getNavn());
		
		Terning terning = new Terning(0, 0);
		
		int felt1 = 1;  
		int felt2 = 1; 
		
		while (true) {
			
			
			if (spiller1.getBalance() >1020) {
				
				JOptionPane.showMessageDialog
				(null, "Tillyke " + spiller1.getNavn() +"!" + "\n Du har vundet Cage of Doom" + "\n May the Empire be with you!"
					,"Cage of Doom ", JOptionPane.PLAIN_MESSAGE);
				
//				JOptionPane.showMessageDialog(null, "TIllykke! " + spiller1.getNavn() + " Du har vundet Cage Of Doom. May the Empire be with you! ","Vinder meddelelse", JOptionPane.PLAIN_MESSAGE);
				break;
			}
			
			if(spiller2.getBalance() >1020) {
				
				JOptionPane.showMessageDialog
				(null, "Tillyke " + spiller2.getNavn()+"!" + "\n Du har vundet Cage of Doom" + "\n May the Empire be with you!"
						,"Cage of Doom ", JOptionPane.PLAIN_MESSAGE);
				
//				JOptionPane.showMessageDialog(null, "TIllykke! " + spiller2.getNavn() + " Du har vundet Cage Of Doom. May the Empire be with you!" ,"Vinder meddelelse", JOptionPane.PLAIN_MESSAGE);;
				break;
			}
			int runde = 1;

			if (spiller1.getBalance() < 3000 && spiller2.getBalance() < 3000) {

				if (runde % 2 != 0) {
					GUI.getUserButtonPressed(
							"Din tur " + spiller1.getNavn() + ". Tryk på knappen for at kaste terningerne", "Kast");
					terning.random();
					GUI.setDice(terning.getTerning1(), terning.getTerning2());
					GUI.removeCar(felt1, spiller1.getNavn());
					felt1 = terning.getSum();
					GUI.setCar(felt1, spiller1.getNavn());
					switch (felt1-1) {

					case 1: // Tower
						spiller1.setPengebeholdning(250);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 2: // Crater
						spiller1.setPengebeholdning(-100);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 3: // Palace Gates
						spiller1.setPengebeholdning(100);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 4: // Cold Dessert
						spiller1.setPengebeholdning(-20);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 5: // Walled City
						spiller1.setPengebeholdning(180);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 6: // Monastery
						spiller1.setPengebeholdning(0);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 7: // Black Cave
						spiller1.setPengebeholdning(-70);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 8: // Pots In The Mountain
						spiller1.setPengebeholdning(+60);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 9: // The Werewall
						spiller1.setPengebeholdning(-80);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						break;
					case 10: // The Pit
						spiller1.setPengebeholdning(-50);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					case 11: // Goldmine
						spiller1.setPengebeholdning(+650);
						GUI.setBalance(spiller1.getNavn(), spiller1.getBalance());
						runde++;
						break;
					default:
						runde++;
						break;

					}

				}

				if(runde%2 == 0) {
					GUI.getUserButtonPressed(
							"Din tur " + spiller2.getNavn() + ". Tryk på knappen for at kaste terningerne", "Kast");
					terning.random();
					GUI.setDice(terning.getTerning1(), terning.getTerning2());
					GUI.removeCar(felt2, spiller2.getNavn());
					felt2 = terning.getSum();
					GUI.setCar(felt2, spiller2.getNavn());
					switch (felt2-1) {

					case 1: // Tower
						spiller2.setPengebeholdning(250);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 2: // Crater
						spiller2.setPengebeholdning(-100);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 3: // Palace Gates
						spiller2.setPengebeholdning(100);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 4: // Cold Dessert
						spiller2.setPengebeholdning(-20);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 5: // Walled City
						spiller2.setPengebeholdning(180);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 6: // Monastery
						spiller2.setPengebeholdning(0);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 7: // Black Cave
						spiller2.setPengebeholdning(-70);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 8: // Pots In The Mountain
						spiller2.setPengebeholdning(+60);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 9: // The Werewall
						spiller2.setPengebeholdning(-80);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						break;
					case 10: // The Pit
						spiller2.setPengebeholdning(-50);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					case 11: // Goldmine
						spiller2.setPengebeholdning(+650);
						GUI.setBalance(spiller2.getNavn(), spiller2.getBalance());
						runde++;
						break;
					default:
						runde++;
						break;

					}
				}

			}
			
			

		}

	}
}
