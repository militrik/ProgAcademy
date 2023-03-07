package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws IOException {

        String jsonCurrency = getStringFromURL("https://api.monobank.ua/bank/currency");
        Double value1 = getCurrencyFromJSON(jsonCurrency, "USD", "UAH");
        Double value2 = getCurrencyFromJSON(jsonCurrency, "EUR", "UAH");
        Double value3 = getCurrencyFromJSON(jsonCurrency, "GBP", "UAH");
        Double value4 = getCurrencyFromJSON(jsonCurrency, "IDR", "ZAR");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
    }

    private static Double getCurrencyFromJSON(String jsonCurrency, String codeA, String codeB) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Currency[] currencies = gson.fromJson(jsonCurrency, Currency[].class);
        return Arrays.stream(currencies)
                .filter(currency ->
                        currency.getCurrencyCodeA() == Currency.countryCurrencyCodes.get(codeA.toUpperCase())
                                && currency.getCurrencyCodeB() == Currency.countryCurrencyCodes.get(codeB.toUpperCase()))
                .findFirst()
                .map(Currency::getRateSell)
                .orElse(null);
    }

    public static String getStringFromURL(String url) throws IOException {
        URLConnection connection = (new URL(url)).openConnection();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            return br.lines().reduce(String::concat).get();
        }
    }

}