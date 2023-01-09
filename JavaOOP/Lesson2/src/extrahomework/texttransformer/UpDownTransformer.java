package extrahomework.texttransformer;

public class UpDownTransformer extends TextTransformer {
    public UpDownTransformer() {
    }

    @Override
    public String transform(String text) {
        String text1 = "";
        for (int i = 0; i < text.length(); i++) {
            text1 = text1 + (i%2==1? (""+text.charAt(i)).toLowerCase():(""+text.charAt(i)).toUpperCase());
        }
        return text1;
    }
}

