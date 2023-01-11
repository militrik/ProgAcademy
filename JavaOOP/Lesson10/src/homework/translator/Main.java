package homework.translator;

import java.io.File;


public class Main {
    public static void main(String[] args) {

        TranslatorLangLang enua = new TranslatorLangLang(new File("A_good_boy.txt"), TranslatorLangLang.Langs.ENUA );
        enua.translator();

        TranslatorLangLang uaen = new TranslatorLangLang(enua.getFileOut(), TranslatorLangLang.Langs.UAEN );
        uaen.translator();
    }
}
