package homework.asciifont;

public class Main {
    public static void main(String[] args) {

        StringToASCII ascii1 = new StringToASCII(ASCIIfont.Fonts.GOST7X13, '█');
        System.out.println(ascii1.convertStringtoASCII("GOST font."));

        StringToASCII ascii2 = new StringToASCII(ASCIIfont.Fonts.SEGOE_SCRIPT11X16, '*');
        System.out.println(ascii2.convertStringtoASCII("Segoe font?"));

        StringToASCII ascii3 = new StringToASCII(ASCIIfont.Fonts.UBUNTU9X11, '8');
        System.out.println(ascii3.convertStringtoASCII("Ubuntu font!"));
    }
}
