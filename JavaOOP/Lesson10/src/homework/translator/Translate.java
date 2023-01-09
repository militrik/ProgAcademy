package homework.translator;

import java.io.*;

public class Translate extends CSVtoStringConverter implements FileDataConverter {

    File fileIn;

    public Translate(File fileIn) {
        this.fileIn = fileIn;
    }

    @Override
    public String readFileToData(File file) {

        String text = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (true) {
                String temp = br.readLine();
                if (temp == null) {
                    break;
                }
                text += temp + System.lineSeparator();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }

    @Override
    public File writeDataToFile(Object object) {
        String text = (String) object;
        String fileOutTitle = (fileIn.getName().split("[.]"))[0];
        String fileOutExt = (fileIn.getName().split("[.]"))[1];
        String fileOutName = fileOutTitle + "_tranlated." + fileOutExt;
        File fileOut = new File(fileOutName);
        try (Writer writer = new FileWriter(fileOut)) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fileOut;
    }

    /*    public static void saveGroupToCSV(Group gr) throws IOException {
        try (Writer writer = new FileWriter(gr.getGroupName() + ".csv")) {
            Student[] students = gr.getStudens().toArray(new Student[0]);
            for (Student student : students
            ) {
                String text = new CSVStringConverter().toStringRepresentation(student);
                writer.write(text);
            }
        }
    }*/

/*    public static String loadGroupFromCSV(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while (true) {
                String text = br.readLine();
                if (text == null) {
                    break;
                }
                Student student = new CSVStringConverter().fromStringRepresentation(text);
                try {
                    group.addStudent(student);
                } catch (Group.GroupOverflowException e) {
                    System.out.println(e.getMessage());
                }
            }
            String fileName = file.getName();
            group.setGroupName(fileName.substring(0, fileName.length() - 4));
            return group;
        } catch (IOException | CSVStringConverter.CSVStringConverterException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }*/


    public void translatorENUA() {
        String textEn = readFileToData(fileIn);
        writeDataToFile(textEn);
    }

    public static class GroupFileStorageException extends Exception {
        public GroupFileStorageException(String message) {
            super(message);
        }
    }
}
