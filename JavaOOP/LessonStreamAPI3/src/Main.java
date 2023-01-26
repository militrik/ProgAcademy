import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<String> stringStream;

        try {
            stringStream = Files.lines(Path.of("./url.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        stringStream
                .peek(System.out::print)
                .map(Main::isSiteAlive)
                .forEach(System.out::println);
    }

    public static String isSiteAlive(String url) {
        HttpURLConnection connection = null;
        try {
            connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setConnectTimeout(100);
            return "\t" + connection.getResponseCode() + " " + connection.getResponseMessage();
        } catch (IOException e) {
            return "\t" + e.getMessage();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

}