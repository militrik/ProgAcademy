package extrahomework.texttransformer;

public class InverseTransformer extends TextTransformer {
    public InverseTransformer() {
    }

    @Override
    public String transform(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
