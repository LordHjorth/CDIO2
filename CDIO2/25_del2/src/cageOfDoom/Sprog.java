package cageOfDoom;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sprog {

	public static String[] setToDansk() throws IOException {

		String file = "src/Sprog/Dansk.txt";
		BufferedReader reader = new BufferedReader(new FileReader(file));

		String currentline = null;
		int antalLinjer = 7;
		String[] dansk = new String[antalLinjer];

		for (int i = 0; i < antalLinjer; i++) {
			currentline = reader.readLine();
			dansk[i] = currentline;
		}

		reader.close();

		return dansk;

	}

	public static String[] setToEngelsk() throws IOException {

		String file = "src/Sprog/Engelsk.txt";
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String currentline = null;
		int antalLinjer = 7;
		String[] engelsk = new String[antalLinjer];
		for (int i = 0; i < antalLinjer; i++) {
			currentline = reader.readLine();
			engelsk[i] = currentline;
		}
		reader.close();

		return engelsk;

	}

}
