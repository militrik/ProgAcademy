package homework.streamIO;

public class CSVStringConverter implements StringConverter {
    @Override
    public String toStringRepresentation(Student student) {

        if (student == null) {
            return "";
        } else {
            return student.getName() + "," + student.getLastName() + ","
                    + student.getGender() + "," + student.getId() + ","
                    + student.getGroupName() + System.lineSeparator();
        }
    }

    @Override
    public Student fromStringRepresentation(String str) throws CSVStringConverterException {
        try {
            Student student = new Student();
            String[] strArray = str.split("[,]");
            student.setName(strArray[0]);
            student.setLastName(strArray[1]);
            student.setGender(Human.Gender.valueOf(strArray[2]));
            student.setId(Integer.parseInt(strArray[3]));
            student.setGroupName(strArray[4]);
            return student;
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            throw new CSVStringConverterException("Invalid string");
        }

    }

    public class CSVStringConverterException extends Exception {
        public CSVStringConverterException(String message) {
            super(message);
        }
    }
}
