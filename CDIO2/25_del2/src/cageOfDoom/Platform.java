package cageOfDoom;

import desktop_fields.*;
import desktop_resources.GUI;

import java.awt.Color;

import desktop_codebehind.*;

public class Platform {

	
	public static void OpretSpil () {
		
	Field [] fields = new Field[11];	
	
	fields [0] = new Street.Builder().setBgColor(Color.BLUE).setDescription("Rasmus").setTitle("Tower").setSubText("rrr").setSubText("+250").build();
	fields [1]= new Street.Builder().setBgColor(Color.RED).setDescription("Crater").setTitle("Crater").setSubText("-100").build();
	fields [2]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Palace gates").setTitle("Palace Gates").setSubText("+100").build();
	fields [3]= new Street.Builder().setBgColor(Color.RED).setDescription("Cold Desert").setTitle("Cold Desert").setSubText("-20").build();
	fields [4]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Walled City").setTitle("Walled City").setSubText("+180").build();
	fields [5]= new Street.Builder().setBgColor(Color.RED).setDescription("Monastery").setTitle("Monastery").setSubText("0").build();
	fields [6]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Black cave").setTitle("Black cave").setSubText("-70").build();
	fields [7]= new Street.Builder().setBgColor(Color.RED).setDescription("Huts in the mountain").setTitle("Huts in the mountain").setSubText("+60").build();
	fields [8]= new Street.Builder().setBgColor(Color.BLUE).setDescription("The werewall").setTitle("The werewall").setSubText("-80").build();
	fields [9]= new Street.Builder().setBgColor(Color.RED).setDescription("The pit").setTitle("The pit").setSubText("-50").build();
	fields [10]= new Street.Builder().setBgColor(Color.BLUE).setDescription("Goldmine").setTitle("Goldmine").setSubText("+650").build();
		
	GUI.create(fields);	
		
	}

}
