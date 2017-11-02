package cageOfDoom;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JOptionPane;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Spil {

	public static void spil() throws IOException {

		String navnSpiller1 = Sprog.setToEngelsk()[0];
		String navnSpiller2 = Sprog.setToEngelsk()[1];
		String tillykke = Sprog.setToEngelsk()[2];
		String empire = Sprog.setToEngelsk()[3];
		String kastTerning = Sprog.setToEngelsk()[4];
		String kastKnap = Sprog.setToEngelsk()[5];
		String sprog = Sprog.setToEngelsk()[6];
		boolean dansk = false;

		Spiller spiller1 = new Spiller(
				JOptionPane.showInputDialog(null, navnSpiller1, "Cage of Doom ", JOptionPane.PLAIN_MESSAGE));
		Spiller spiller2 = new Spiller(
				JOptionPane.showInputDialog(null, navnSpiller2, "Cage of Doom ", JOptionPane.PLAIN_MESSAGE));

		Car car1 = new Car.Builder().typeRacecar().primaryColor(Color.BLACK).build();
		Car car2 = new Car.Builder().typeUfo().primaryColor(Color.orange).build();

		GUI.addPlayer(spiller1.getNavn(), spiller1.getBalance(), car1);
		GUI.addPlayer(spiller2.getNavn(), spiller2.getBalance(), car2);
		GUI.setCar(1, spiller1.getNavn());
		GUI.setCar(1, spiller2.getNavn());
		GUI.setChanceCard("REGLER ER SOM FØLGER: " + "\n" + "bla.. bla.. bla.."); // kan bruges til at sætte reglerne i
																					// midten når intet andet er vist
		GUI.displayChanceCard();

		Terning terning = new Terning(0, 0);

		int felt1 = 1;
		int felt2 = 1;

		while (true) {

			if (spiller1.getBalance() >= 3000) {

				JOptionPane.showMessageDialog(null, spiller1.getNavn() + tillykke + "\n" + empire, "Cage of Doom ",
						JOptionPane.PLAIN_MESSAGE);

				break;

			}

			if (spiller2.getBalance() >= 3000) {

				JOptionPane.showMessageDialog(null, spiller2.getNavn() + tillykke + "\n" + empire, "Cage of Doom ",
						JOptionPane.PLAIN_MESSAGE);

				break;
			}
			int runde = 1;

			if (spiller1.getBalance() < 3000 && spiller2.getBalance() < 3000) {

				while (runde % 2 != 0) {
					if (GUI.getUserLeftButtonPressed(spiller1.getNavn() + kastTerning, kastKnap, sprog) == true) {
						terning.random();
						GUI.setDice(terning.getTerning1(), terning.getTerning2());
						GUI.removeCar(felt1, spiller1.getNavn());
						felt1 = terning.getSum();
						GUI.setCar(felt1, spiller1.getNavn());
						Platform.getFelt(felt1);

						switch (felt1 - 1) {

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
					} else {
						if (dansk == true) {
							navnSpiller1 = Sprog.setToEngelsk()[0];
							navnSpiller2 = Sprog.setToEngelsk()[1];
							tillykke = Sprog.setToEngelsk()[2];
							empire = Sprog.setToEngelsk()[3];
							kastTerning = Sprog.setToEngelsk()[4];
							kastKnap = Sprog.setToEngelsk()[5];
							sprog = Sprog.setToEngelsk()[6];
							dansk = false;
						} else if (dansk == false) {
							navnSpiller1 = Sprog.setToDansk()[0];
							navnSpiller2 = Sprog.setToDansk()[1];
							tillykke = Sprog.setToDansk()[2];
							empire = Sprog.setToDansk()[3];
							kastTerning = Sprog.setToDansk()[4];
							kastKnap = Sprog.setToDansk()[5];
							sprog = Sprog.setToDansk()[6];
							dansk = true;
						}
					}

				}

				while (runde % 2 == 0) {
					if (GUI.getUserLeftButtonPressed(spiller2.getNavn() + kastTerning, kastKnap, sprog) == true) {
						terning.random();
						GUI.setDice(terning.getTerning1(), terning.getTerning2());
						GUI.removeCar(felt2, spiller2.getNavn());
						felt2 = terning.getSum();
						GUI.setCar(felt2, spiller2.getNavn());
						Platform.getFelt(felt2);

						switch (felt2 - 1) {

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
					} else {
						if (dansk == true) {
							navnSpiller1 = Sprog.setToEngelsk()[0];
							navnSpiller2 = Sprog.setToEngelsk()[1];
							tillykke = Sprog.setToEngelsk()[2];
							empire = Sprog.setToEngelsk()[3];
							kastTerning = Sprog.setToEngelsk()[4];
							kastKnap = Sprog.setToEngelsk()[5];
							sprog = Sprog.setToEngelsk()[6];
							dansk = false;
						} else if (dansk == false) {
							navnSpiller1 = Sprog.setToDansk()[0];
							navnSpiller2 = Sprog.setToDansk()[1];
							tillykke = Sprog.setToDansk()[2];
							empire = Sprog.setToDansk()[3];
							kastTerning = Sprog.setToDansk()[4];
							kastKnap = Sprog.setToDansk()[5];
							sprog = Sprog.setToDansk()[6];
							dansk = true;
						}
					}

				}

			}

		}
	}
}
