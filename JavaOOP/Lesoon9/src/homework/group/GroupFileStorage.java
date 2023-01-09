package homework.group;

import java.io.*;

public class GroupFileStorage {
    public GroupFileStorage() {
    }

    public static void saveGroupToCSV(Group gr) throws IOException {
        try (Writer writer = new FileWriter(gr.getGroupName() + ".csv")) {
            Student[] students = gr.getStudens().toArray(new Student[0]);
            for (Student student : students
            ) {
                String text = new CSVStringConverter().toStringRepresentation(student);
                writer.write(text);
            }
        }
    }

    public static Group loadGroupFromCSV(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            Group group = new Group();

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
    }

    public static File findFileByGroupName(String groupName, File workFolder) throws GroupFileStorageException {
        File file = new File(workFolder.getName() + "/" + groupName + ".csv");
        if (!file.exists()) {
            throw new GroupFileStorageException("File not find");
        } else {
            return file;
        }
    }

    public static class GroupFileStorageException extends Exception {
        public GroupFileStorageException(String message) {
            super(message);
        }
    }
}
