package sample;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Cat cat = new Cat("Vaska", "black", 6);
		TextFileSaveService ts = new TextFileSaveService(new File("cat.txt"));
		try {
			ts.saveToCSVFile(cat);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
