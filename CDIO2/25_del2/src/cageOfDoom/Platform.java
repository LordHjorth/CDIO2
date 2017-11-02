package cageOfDoom;

import desktop_fields.*;
import desktop_resources.GUI;

import java.awt.Color;

import javax.swing.JButton;

import desktop_codebehind.*;

public class Platform {

	private static Field [] fields = new Field[21];	
	
	public static void opretSpillebræt() {
		
	fields [0] = new Street.Builder().setBgColor(Color.RED).setTitle("START").setDescription("START").setSubText("").build();
	fields [1] = new Street.Builder().setBgColor(Color.BLUE).setDescription("Tower").setTitle("Tower").setSubText("+250").build();
	fields [2]= new Street.Builder().setBgColor(Color.RED).setDescription("Crater").setTitle("Crater").setSubText("-100").build();
	fields [3]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Palace gates").setTitle("Palace Gates").setSubText("+100").build();
	fields [4]= new Street.Builder().setBgColor(Color.RED).setDescription("Cold Desert").setTitle("Cold Desert").setSubText("-20").build();
	fields [5]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Walled City").setTitle("Walled City").setSubText("+180").build();
	fields [6]= new Street.Builder().setBgColor(Color.RED).setDescription("Monastery").setTitle("Monastery").setSubText("0").build();
	fields [7]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Black cave").setTitle("Black cave").setSubText("-70").build();
	fields [8]= new Street.Builder().setBgColor(Color.RED).setDescription("Huts in the mountain").setTitle("Huts in the mountain").setSubText("+60").build();
	fields [9]= new Street.Builder().setBgColor(Color.BLUE).setDescription("The werewall").setTitle("The werewall").setSubText("-80").build();
	fields [10]= new Street.Builder().setBgColor(Color.RED).setDescription("The pit").setTitle("The pit").setSubText("-50").build();
	fields [11]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Goldmine").setTitle("Goldmine").setSubText("+650").build();
	fields [12] = new Empty.Builder().build();
	fields [13] = new Empty.Builder().build();
	fields [14] = new Empty.Builder().build();
	fields [15] = new Empty.Builder().build();
	fields [16] = new Empty.Builder().build();
	fields [17] = new Empty.Builder().build();
	fields [18] = new Empty.Builder().build();
	fields [19] = new Empty.Builder().build();
	fields [20]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Regler").setTitle("Regler").setSubText("Reglerne er som følger: ").build();
	
	GUI.create(fields);	
	
	}
	public static void getFelt(int i) {
		
		fields[i].displayOnCenter();

	}

}
