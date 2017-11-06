package cageOfDoom;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JOptionPane;

import desktop_codebehind.Car;
import desktop_resources.GUI;

public class Spil {

	static String tillykke, empire, kastTerning, kastKnap, sprog, tower, crater, palace_gates, cold_desert, walled_city,
			monastery, black_cave, huts, werewall, pit, goldmine, regler1, regler2;

	public static void spil() throws IOException {

		tillykke = Sprog.setToEngelsk()[2];
		empire = Sprog.setToEngelsk()[3];
		kastTerning = Sprog.setToEngelsk()[4];
		kastKnap = Sprog.setToDansk()[5];
		sprog = Sprog.setToEngelsk()[6];
		tower = Sprog.setToEngelsk()[7];
		crater = Sprog.setToEngelsk()[8];
		palace_gates = Sprog.setToEngelsk()[9];
		cold_desert = Sprog.setToEngelsk()[10];
		walled_city = Sprog.setToEngelsk()[11];
		monastery = Sprog.setToEngelsk()[12];
		black_cave = Sprog.setToEngelsk()[13];
		huts = Sprog.setToEngelsk()[14];
		werewall = Sprog.setToEngelsk()[15];
		pit = Sprog.setToEngelsk()[16];
		goldmine = Sprog.setToEngelsk()[17];
		regler1 = Sprog.setToEngelsk()[18];
		regler2 = Sprog.setToEngelsk()[19];

		boolean dansk = false;

		Spiller spiller1 = new Spiller(
				JOptionPane.showInputDialog(null, Sprog.setToEngelsk()[0], "Cage of Doom ", JOptionPane.PLAIN_MESSAGE));
		Spiller spiller2 = new Spiller(
				JOptionPane.showInputDialog(null, Sprog.setToEngelsk()[1], "Cage of Doom ", JOptionPane.PLAIN_MESSAGE));

		Car car1 = new Car.Builder().typeRacecar().primaryColor(Color.BLACK).build();
		Car car2 = new Car.Builder().typeUfo().primaryColor(Color.orange).build();

		GUI.addPlayer(spiller1.getNavn(), spiller1.getBalance(), car1);
		GUI.addPlayer(spiller2.getNavn(), spiller2.getBalance(), car2);
		GUI.setCar(1, spiller1.getNavn());
		GUI.setCar(1, spiller2.getNavn());

		GUI.displayChanceCard();

		Terning terning = new Terning(0, 0);

		int felt1 = 1;
		int felt2 = 1;
		boolean spil = true;

		while (spil == true) {

			
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
							tillykke = Sprog.setToEngelsk()[2];
							empire = Sprog.setToEngelsk()[3];
							kastTerning = Sprog.setToEngelsk()[4];
							kastKnap = Sprog.setToEngelsk()[5];
							sprog = Sprog.setToEngelsk()[6];
							regler2 = Sprog.setToEngelsk()[20];
							GUI.setChanceCard(regler2);
							Sprog.setSubText(dansk);
							
							dansk = false;
						} else if (dansk == false) {
							tillykke = Sprog.setToDansk()[2];
							empire = Sprog.setToDansk()[3];
							kastTerning = Sprog.setToDansk()[4];
							kastKnap = Sprog.setToDansk()[5];
							sprog = Sprog.setToDansk()[6];
							regler2 = Sprog.setToDansk()[20];
							GUI.setChanceCard(regler2);
							Sprog.setSubText(dansk);
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
							tillykke = Sprog.setToEngelsk()[2];
							empire = Sprog.setToEngelsk()[3];
							kastTerning = Sprog.setToEngelsk()[4];
							kastKnap = Sprog.setToEngelsk()[5];
							sprog = Sprog.setToEngelsk()[6];
							regler2 = Sprog.setToEngelsk()[20];
							GUI.setChanceCard(regler2);
							Sprog.setSubText(dansk);
							dansk = false;
							
						} else if (dansk == false) {
							tillykke = Sprog.setToDansk()[2];
							empire = Sprog.setToDansk()[3];
							kastTerning = Sprog.setToDansk()[4];
							kastKnap = Sprog.setToDansk()[5];
							sprog = Sprog.setToDansk()[6];
							regler2 = Sprog.setToDansk()[20];
							GUI.setChanceCard(regler2);
							Sprog.setSubText(dansk);
							dansk = true;
						}

					}
					
					if (spiller1.getBalance() >= 3000) {

						JOptionPane.showMessageDialog(null, spiller1.getNavn() + tillykke + "\n" + empire, "Cage of Doom ",
								JOptionPane.PLAIN_MESSAGE);
						spil = false;

					}

					if (spiller2.getBalance() >= 3000) {

						JOptionPane.showMessageDialog(null, spiller2.getNavn() + tillykke + "\n" + empire, "Cage of Doom ",
								JOptionPane.PLAIN_MESSAGE);

						spil = false;
					}
				}

			}

		}
	}
}
