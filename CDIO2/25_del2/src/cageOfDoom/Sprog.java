package cageOfDoom;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sprog {

	public static String[] setToDansk() throws IOException {

		String file = "src/Sprog/Dansk.txt";
		return setSprog(file);
	}

	public static String[] setToEngelsk() throws IOException {

		String file = "src/Sprog/Engelsk.txt";
		return setSprog(file);
	}

	private static String[] setSprog(String file) throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String currentline = null;
		int antalLinjer = 21;
		String[] sprog = new String[antalLinjer];
		for (int i = 0; i < antalLinjer; i++) {
			currentline = reader.readLine();
			sprog[i] = currentline;
		}
		reader.close();

		return sprog;
	}

	public static void setSubText(boolean dansk) throws IOException {

		if (dansk == true) {
			Platform.getFields()[1].setSubText(Sprog.setToEngelsk()[7]);
			Platform.getFields()[2].setSubText(Sprog.setToEngelsk()[8]);
			Platform.getFields()[3].setSubText(Sprog.setToEngelsk()[9]);
			Platform.getFields()[4].setSubText(Sprog.setToEngelsk()[10]);
			Platform.getFields()[5].setSubText(Sprog.setToEngelsk()[11]);
			Platform.getFields()[6].setSubText(Sprog.setToEngelsk()[12]);
			Platform.getFields()[7].setSubText(Sprog.setToEngelsk()[13]);
			Platform.getFields()[8].setSubText(Sprog.setToEngelsk()[14]);
			Platform.getFields()[9].setSubText(Sprog.setToEngelsk()[15]);
			Platform.getFields()[10].setSubText(Sprog.setToEngelsk()[16]);
			Platform.getFields()[11].setSubText(Sprog.setToEngelsk()[17]);
			Platform.getFields()[20].setSubText(Sprog.setToEngelsk()[18]);
			Platform.getFields()[20].setDescription(Sprog.setToEngelsk()[19]);
			Platform.getFields()[20].setTitle(Sprog.setToEngelsk()[19]);
		}
		if (dansk == false) {
			Platform.getFields()[1].setSubText(Sprog.setToDansk()[7]);
			Platform.getFields()[2].setSubText(Sprog.setToDansk()[8]);
			Platform.getFields()[3].setSubText(Sprog.setToDansk()[9]);
			Platform.getFields()[4].setSubText(Sprog.setToDansk()[10]);
			Platform.getFields()[5].setSubText(Sprog.setToDansk()[11]);
			Platform.getFields()[6].setSubText(Sprog.setToDansk()[12]);
			Platform.getFields()[7].setSubText(Sprog.setToDansk()[13]);
			Platform.getFields()[8].setSubText(Sprog.setToDansk()[14]);
			Platform.getFields()[9].setSubText(Sprog.setToDansk()[15]);
			Platform.getFields()[10].setSubText(Sprog.setToDansk()[16]);
			Platform.getFields()[11].setSubText(Sprog.setToDansk()[17]);
			Platform.getFields()[20].setSubText(Sprog.setToDansk()[18]);
			Platform.getFields()[20].setDescription(Sprog.setToDansk()[19]);
			Platform.getFields()[20].setTitle(Sprog.setToDansk()[19]);
		}
	}
}