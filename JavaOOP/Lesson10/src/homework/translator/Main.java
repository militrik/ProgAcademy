package homework.translator;

import java.io.File;


public class Main {
    public static void main(String[] args) {

        TranslatorLangLang enua = new TranslatorLangLang(new File("A_good_boy.txt"), Dictionary.Langs.ENUA);
        enua.translator();

        TranslatorLangLang uaen = new TranslatorLangLang(enua.getFileOut(), Dictionary.Langs.UAEN);
        uaen.translator();

        Dictionary.fillDictionary(Dictionary.Langs.ENUA, "always", "завжди");
        Dictionary.fillDictionary(Dictionary.Langs.UAEN, "завжди", "always");

        enua.translator();
        uaen.translator();
    }
}
