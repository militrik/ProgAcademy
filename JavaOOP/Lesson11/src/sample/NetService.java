package sample;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class NetService {

    public static String getStringFromURL(String spec, String code) throws IOException {
        URL url = new URL(spec);
        URLConnection con = url.openConnection();
        String result = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), code))) {
            String temp = "";
            for (; (temp = br.readLine()) != null;) {
                result += temp + System.lineSeparator();
            }
            return result;
        }
    }

    public static long getFileFromURL(String spec, File folder) throws IOException {
        URL url = new URL(spec);
        URLConnection con = url.openConnection();
        int n = spec.lastIndexOf("/");
        String fileName = spec.substring(n + 1);
        File file = new File(folder, fileName);
        try (InputStream is = con.getInputStream(); OutputStream os = new FileOutputStream(file)) {

            return is.transferTo(os);
        }
    }

    public static Map<String, List<String>> getHeadersFromURL(String spec) throws IOException {
        URL url = new URL(spec);
        URLConnection con = url.openConnection();
        return con.getHeaderFields();
    }

}