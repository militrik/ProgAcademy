package homework.xmledit;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String xml = "<dependency>\n" +
                "<groupId>junit</groupId>\n" +
                "<artifactId>junit</artifactId>\n" +
                "<version>4.4</version>\n" +
                "<scope>test</scope>\n" +
                "</dependency>\n" +
                "<dependency>\n" +
                "<groupId>org.powermock</groupId>\n" +
                "<artifactId>powermock-reflect</artifactId>\n" +
                "<version>3.2</version>\n" +
                "</dependency>";

        String key1 = "groupId";

        System.out.println(xml.lines()
                .filter(s -> s.contains(key1))
                .map(s -> s.replaceAll("(</??.*?>)", ""))
                .collect(Collectors.toList()));
    }
}
