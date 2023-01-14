package homework.asciifont;

import java.util.*;

public class StringToASCII extends ASCIIfont {
    private Fonts font;
    private Map<Character, List<String>> decodedFontArray;
    private char filler;

    public StringToASCII(Fonts font, char filler) {
        this.font = font;
        this.filler = filler;
        decodedFontArray = decodeFontArray();
    }

    public String convertStringtoASCII(String textIn) {
        String textOut = "";
        int textLength = textIn.length();
        char[] charArray = textIn.toCharArray();
        List<List<String>> prepareString = new ArrayList<List<String>>(textLength);
        for (int i = 0; i < textLength; i++) {
            prepareString.add(decodedFontArray.get(charArray[i]));
        }

        for (int i = 0; i < prepareString.get(0).size(); i++) {
            for (int j = 0; j < prepareString.size(); j++) {
                textOut += prepareString.get(j).get(i);
            }
            textOut += System.lineSeparator();
        }
        return textOut;
    }

    private Map<Character, List<String>> decodeFontArray() {

        FontTable fontTable = getFontTable();
        Map<Character, List<String>> fontMap = new HashMap<>();

        for (int i = 0; i < ASCIIfont.endChar - ASCIIfont.beginChar; i++) {

            short[] oneCharacterCode = Arrays.copyOfRange(fontTable.getTableArray(),
                    i * (2 * fontTable.getWeight() + 1) + 1,
                    i * (2 * fontTable.getWeight() + 1) + 1 + 2 * fontTable.getWeight());

            char[][] oneCharacterArray = new char[getFontTable().getWeight()][getFontTable().getHeight()];
            for (int j = 0; j < oneCharacterCode.length; j += 2) {
                int oneVerticalLine = oneCharacterCode[j] + oneCharacterCode[j + 1] * (0xFF + 1);
                for (int k = 0; k < getFontTable().getHeight(); k++) {
                    if (oneVerticalLine % 2 == 0) {
                        oneCharacterArray[j / 2][k] = ' ';
                    } else {
                        oneCharacterArray[j / 2][k] = filler;
                    }
                    oneVerticalLine /= 2;
                }
            }
            fontMap.put((char) (i + ASCIIfont.beginChar), mirrorANDtransponde(oneCharacterArray));
        }
        return fontMap;
    }

    private FontTable getFontTable() {
        for (FontTable fontTable : getFontTables()
        ) {
            if (fontTable.getFont().equals(this.font)) {
                return fontTable;
            }
        }
        return null;
    }

    private List<String> mirrorANDtransponde(char[][] arr) {
        List<String> asciiChar = new ArrayList<>();
        for (int i = 0; i < arr[0].length; i++) {
            String str = "";
            for (int j = 0; j < arr.length; j++) {
                str += arr[j][i];
            }
            asciiChar.add(str);
        }
        return asciiChar;
    }
}
