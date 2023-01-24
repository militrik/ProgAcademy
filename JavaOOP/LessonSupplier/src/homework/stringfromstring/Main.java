package homework.stringfromstring;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier<String> sup = new GetNextWord("Hello Java world");
        String word;
        while ((word = sup.get()) != null) {
            System.out.println(word);
        }
    }
}

class GetNextWord implements Supplier<String> {
    private String[] stringArr;
    private int ptr = 0;

    GetNextWord(String in) {
        stringArr = in.split("[\\W]");
    }

    @Override
    public String get() {
        if (ptr < stringArr.length)
            return stringArr[ptr++];
        else
            return null;
    }
}