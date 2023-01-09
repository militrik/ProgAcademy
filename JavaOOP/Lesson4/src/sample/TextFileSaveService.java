package sample;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileSaveService {
	private File file;
	private String delimiter = ";";

	public TextFileSaveService(File file) {
		super();
		this.file = file;
	}

	public TextFileSaveService(File file, String delimiter) {
		super();
		this.file = file;
		this.delimiter = delimiter;
	}

	public void saveToCSVFile(GetDateToTextFile gdtt) throws IOException {
		String[] date = gdtt.textRepresentation().split(";");
		try (PrintWriter pw = new PrintWriter(file)) {
			for (int i = 0; i < date.length - 1; i++) {
				pw.print(date[i] + delimiter);
			}
			pw.print(date[date.length - 1]);
		} catch (IOException e) {
			throw e;
		}
	}
}