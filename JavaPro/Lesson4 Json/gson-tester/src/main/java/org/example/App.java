package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App {

    static String JSON = """
                {
                    "recipient": {
                        "name": "dsfdsf",
                        "phone": "34543545"
                    },
                    "details": [
                        {
                            "name": "Xxxx",
                            "price": 79.5
                        },
                        {
                            "name": "Yyyyyy",
                            "price": 55.5
                        },
                        {
                            "name": "ddfdfg",
                            "price": 90
                        }
                    ]
                }
            """;

    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Person person = gson.fromJson(JSON, Person.class);
        System.out.println(person);

        String json = gson.toJson(person);
        System.out.println(json);
    }
}
