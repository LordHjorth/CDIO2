package cageOfDoom;

import desktop_fields.*;
import desktop_resources.GUI;

import java.awt.Color;
import java.io.IOException;

public class Platform {

	private static Field[] fields = new Field[21];

	public static void opretSpillebræt() throws IOException {
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
		
		
		getFields()[0] = new Street.Builder().setBgColor(Start).setTitle("START").setDescription("START").setSubText("")
				.build();
		getFields()[1] = new Street.Builder().setBgColor(Tower).setDescription("Tower").setTitle("Tower").setSubText(Sprog.setToEngelsk()[7])
				.build();
		getFields()[2] = new Street.Builder().setBgColor(Crater).setDescription("Crater").setTitle("Crater")
				.setSubText(Sprog.setToEngelsk()[8]).build();
		getFields()[3] = new Street.Builder().setBgColor(Palace_gates).setDescription("Palace gates")
				.setTitle("Palace Gates").setSubText(Sprog.setToEngelsk()[9]).build();
		getFields()[4] = new Street.Builder().setBgColor(Cold_Desert).setDescription("Cold Desert").setTitle("Cold Desert")
				.setSubText(Sprog.setToEngelsk()[10]).build();
		getFields()[5] = new Street.Builder().setBgColor(Walled_City).setDescription("Walled City").setTitle("Walled City")
				.setSubText(Sprog.setToEngelsk()[11]).build();
		getFields()[6] = new Street.Builder().setBgColor(Monastery).setDescription("Monastery").setTitle("Monastery")
				.setSubText(Sprog.setToEngelsk()[12]).build();
		getFields()[7] = new Street.Builder().setBgColor(Black_cave).setDescription("Black cave").setTitle("Black cave")
				.setSubText(Sprog.setToEngelsk()[13]).setFgColor(Color.white).build();
		getFields()[8] = new Street.Builder().setBgColor(Huts_in_the_mountain).setDescription("Huts in the mountain")
				.setTitle("Huts in the mountain").setSubText(Sprog.setToEngelsk()[14]).build();
		getFields()[9] = new Street.Builder().setBgColor(The_werewall).setDescription("The werewall")
				.setTitle("The werewall").setSubText(Sprog.setToEngelsk()[15]).build();
		getFields()[10] = new Street.Builder().setBgColor(The_pit).setDescription("The pit").setTitle("The pit")
				.setSubText(Sprog.setToEngelsk()[16]).build();
		getFields()[11] = new Street.Builder().setBgColor(The_goldmine).setDescription("Goldmine").setTitle("Goldmine")
				.setSubText(Sprog.setToEngelsk()[17]).build();
		getFields()[12] = new Empty.Builder().build();
		getFields()[13] = new Empty.Builder().build();
		getFields()[14] = new Empty.Builder().build();
		getFields()[15] = new Empty.Builder().build();
		getFields()[16] = new Empty.Builder().build();
		getFields()[17] = new Empty.Builder().build();
		getFields()[18] = new Empty.Builder().build();
		getFields()[19] = new Empty.Builder().build();
		getFields()[20] = new Street.Builder().setBgColor(Color.GRAY).setDescription(Sprog.setToEngelsk()[19]).setTitle(Sprog.setToEngelsk()[19])
				.setSubText(Sprog.setToEngelsk()[18]).build();

		GUI.create(getFields());
		
		GUI.setChanceCard(Sprog.setToEngelsk()[20]); 
	}

	public static void getFelt(int i) {

		getFields()[i-1].displayOnCenter();

	}

	public static Field[] getFields() {
		return fields;
	}
	

}
