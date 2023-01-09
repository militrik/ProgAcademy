package sample;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
//    // TODO Auto-generated method stub
        String spec = "https://dou.ua/";
//
//    try {
//      String htmlText = NetService.getStringFromURL(spec, "UTF-8");
//      System.out.println(htmlText);
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

//    String spec = "https://content2.rozetka.com.ua/goods/images/big/305999825.jpg";

//    File folder = new File("WEB IMG");
//    folder.mkdirs();
//
//    try {
//      System.out.println(NetService.getFileFromURL(spec, folder));
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

        try {
            Map<String, List<String>> headers = NetService.getHeadersFromURL(spec);
            for (String k : headers.keySet()) {
                System.out.println(k + " -> " + headers.get(k));
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}