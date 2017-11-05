package cageOfDoom;

import desktop_fields.*;
import desktop_resources.GUI;

import java.awt.Color;

public class Platform {

	private static Field[] fields = new Field[21];

	public static void opretSpillebræt() {
		// opretter farver til spillebrættet.
		Color Start = new Color(76, 153, 0);
		Color Tower = new Color(74, 159, 223);
		Color Crater = new Color(160, 160, 160);
		Color Palace_gates = new Color(255, 204, 255);
		Color Cold_Desert = new Color(204, 255, 255);
		Color Walled_City = new Color(255, 102, 0);
		Color Monastery = new Color(255, 204, 229);
		Color Black_cave = new Color(0, 0, 0);
		Color Huts_in_the_mountain = new Color(204, 102, 0);
		Color The_werewall = new Color(229, 31, 31);
		Color The_pit = new Color(224, 224, 224);
		Color The_goldmine = new Color(212, 175, 55);

		fields[0] = new Street.Builder().setBgColor(Start).setTitle("START").setDescription("START").setSubText("")
				.build();
		fields[1] = new Street.Builder().setBgColor(Tower).setDescription("Tower").setTitle("Tower").setSubText("+250, You sell Rapunzels Hair")
				.build();
		fields[2] = new Street.Builder().setBgColor(Crater).setDescription("Crater").setTitle("Crater")
				.setSubText("-100, Ladders are expensive").build();
		fields[3] = new Street.Builder().setBgColor(Palace_gates).setDescription("Palace gates")
				.setTitle("Palace Gates").setSubText("+100, A crystal fell of the gates").build();
		fields[4] = new Street.Builder().setBgColor(Cold_Desert).setDescription("Cold Desert").setTitle("Cold Desert")
				.setSubText("-20, You buy a warm coat.").build();
		fields[5] = new Street.Builder().setBgColor(Walled_City).setDescription("Walled City").setTitle("Walled City")
				.setSubText("+180, You tell stories of world").build();
		fields[6] = new Street.Builder().setBgColor(Monastery).setDescription("Monastery").setTitle("Monastery")
				.setSubText("0, A little peace and quiet").build();
		fields[7] = new Street.Builder().setBgColor(Black_cave).setDescription("Black cave").setTitle("Black cave")
				.setSubText("-70, The cost of illumination.").setFgColor(Color.white).build();
		fields[8] = new Street.Builder().setBgColor(Huts_in_the_mountain).setDescription("Huts in the mountain")
				.setTitle("Huts in the mountain").setSubText("+60, Location is everything").build();
		fields[9] = new Street.Builder().setBgColor(The_werewall).setDescription("The werewall")
				.setTitle("The werewall").setSubText("-80,Alea jacta est.").build();
		fields[10] = new Street.Builder().setBgColor(The_pit).setDescription("The pit").setTitle("The pit")
				.setSubText("-50, AKA Hell on earth").build();
		fields[11] = new Street.Builder().setBgColor(The_goldmine).setDescription("Goldmine").setTitle("Goldmine")
				.setSubText("+650, A goldmine, you´re rich!").build();
		fields[12] = new Empty.Builder().build();
		fields[13] = new Empty.Builder().build();
		fields[14] = new Empty.Builder().build();
		fields[15] = new Empty.Builder().build();
		fields[16] = new Empty.Builder().build();
		fields[17] = new Empty.Builder().build();
		fields[18] = new Empty.Builder().build();
		fields[19] = new Empty.Builder().build();
		fields[20] = new Street.Builder().setBgColor(Color.GRAY).setDescription("Regler").setTitle("Regler")
				.setSubText("Reglerne er som følger: ").build();

		GUI.create(fields);

	}

	public static void getFelt(int i) {

		fields[i-1].displayOnCenter();

	}

}
