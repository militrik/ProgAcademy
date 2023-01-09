package com.gmail.simakarenko93;

import java.util.HashMap;
import java.util.Map;

public class ASCII {

    public void printArt(String text) {
        char[] array = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(searchBaseASCII(array[i]));
        }
        System.out.println(sb.toString());

    }

    public String searchBaseASCII(char letter) {
        Map<Character, String> mOne = baseASCII();
        return mOne.get(letter);
    }

    public Map<Character, String> baseASCII() {

        Map<Character, String> m = new HashMap<>();

        StringBuilder sbA = new StringBuilder();
        sbA.append("     *     " + System.lineSeparator() + "    * *    " + System.lineSeparator() + "   *   *   "
                + System.lineSeparator() + "  *******  " + System.lineSeparator() + " *       * "
                + System.lineSeparator() + "*         *" + System.lineSeparator());
        m.put('A', sbA.toString());

        StringBuilder sbB = new StringBuilder();
        sbB.append("****" + System.lineSeparator() + "*   *" + System.lineSeparator() + "*    *"
                + System.lineSeparator() + "*****" + System.lineSeparator() + "*    *" + System.lineSeparator()
                + "*****" + System.lineSeparator());
        m.put('B', sbB.toString());

        StringBuilder sbC = new StringBuilder();
        sbC.append(" ***** " + System.lineSeparator() + "*     *" + System.lineSeparator() + "*"
                + System.lineSeparator() + "*" + System.lineSeparator() + "*     *" + System.lineSeparator() + " ***** "
                + System.lineSeparator());
        m.put('C', sbC.toString());

        StringBuilder sbD = new StringBuilder();
        sbD.append("*****" + System.lineSeparator() + "*    *" + System.lineSeparator() + "*     *"
                + System.lineSeparator() + "*     *" + System.lineSeparator() + "*    *" + System.lineSeparator()
                + "*****" + System.lineSeparator());
        m.put('D', sbD.toString());

        StringBuilder sbE = new StringBuilder();
        sbE.append("*******" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator()
                + "*******" + System.lineSeparator() + "*" + System.lineSeparator() + "*******"
                + System.lineSeparator());
        m.put('E', sbE.toString());

        StringBuilder sbF = new StringBuilder();
        sbF.append("*******" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator()
                + "****" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator());
        m.put('F', sbF.toString());

        StringBuilder sbG = new StringBuilder();
        sbG.append(" ***** " + System.lineSeparator() + "*     *" + System.lineSeparator() + "*"
                + System.lineSeparator() + "*  ***" + System.lineSeparator() + "*     *" + System.lineSeparator()
                + " ***** " + System.lineSeparator());
        m.put('G', sbG.toString());

        StringBuilder sbH = new StringBuilder();
        sbH.append("*     *" + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *"
                + System.lineSeparator() + "*******" + System.lineSeparator() + "*     *" + System.lineSeparator()
                + "*     *" + System.lineSeparator());
        m.put('H', sbH.toString());

        StringBuilder sbI = new StringBuilder();
        sbI.append("***" + System.lineSeparator() + " * " + System.lineSeparator() + " * " + System.lineSeparator()
                + " * " + System.lineSeparator() + " * " + System.lineSeparator() + "***" + System.lineSeparator());
        m.put('I', sbI.toString());

        StringBuilder sbJ = new StringBuilder();
        sbJ.append("  ***" + System.lineSeparator() + "   *" + System.lineSeparator() + "   *" + System.lineSeparator()
                + "   *" + System.lineSeparator() + "*  *" + System.lineSeparator() + " ** " + System.lineSeparator());
        m.put('J', sbJ.toString());

        StringBuilder sbK = new StringBuilder();
        sbK.append("*  *" + System.lineSeparator() + "* *" + System.lineSeparator() + "**" + System.lineSeparator()
                + "*" + System.lineSeparator() + "**" + System.lineSeparator() + "* *" + System.lineSeparator());
        m.put('K', sbK.toString());

        StringBuilder sbL = new StringBuilder();
        sbL.append("*" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator() + "*"
                + System.lineSeparator() + "*" + System.lineSeparator() + "*******" + System.lineSeparator());
        m.put('L', sbL.toString());

        StringBuilder sbM = new StringBuilder();
        sbM.append("**   **" + System.lineSeparator() + "* * * *" + System.lineSeparator() + "*  *  *"
                + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *" + System.lineSeparator()
                + "*     *" + System.lineSeparator());
        m.put('M', sbM.toString());

        StringBuilder sbN = new StringBuilder();
        sbN.append("*    *" + System.lineSeparator() + "**   *" + System.lineSeparator() + "* *  *"
                + System.lineSeparator() + "*  * *" + System.lineSeparator() + "*   **" + System.lineSeparator()
                + "*    *" + System.lineSeparator());
        m.put('N', sbN.toString());

        StringBuilder sbO = new StringBuilder();
        sbO.append(" ***** " + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *"
                + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *" + System.lineSeparator()
                + " ***** " + System.lineSeparator());
        m.put('O', sbO.toString());

        StringBuilder sbP = new StringBuilder();
        sbP.append("******" + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *"
                + System.lineSeparator() + "******" + System.lineSeparator() + "*" + System.lineSeparator() + "*"
                + System.lineSeparator());
        m.put('P', sbP.toString());

        StringBuilder sbQ = new StringBuilder();
        sbQ.append(" ***** " + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *"
                + System.lineSeparator() + "*   * *" + System.lineSeparator() + "*    **" + System.lineSeparator()
                + " ******" + System.lineSeparator());
        m.put('Q', sbQ.toString());

        StringBuilder sbR = new StringBuilder();
        sbR.append("******" + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *"
                + System.lineSeparator() + "******" + System.lineSeparator() + "*    *" + System.lineSeparator()
                + "*     *" + System.lineSeparator());
        m.put('R', sbR.toString());

        StringBuilder sbS = new StringBuilder();
        sbS.append(" ******" + System.lineSeparator() + "*" + System.lineSeparator() + "*" + System.lineSeparator()
                + " ***** " + System.lineSeparator() + "      *" + System.lineSeparator() + "******"
                + System.lineSeparator());
        m.put('S', sbS.toString());

        StringBuilder sbT = new StringBuilder();
        sbT.append("*******" + System.lineSeparator() + "   *" + System.lineSeparator() + "   *"
                + System.lineSeparator() + "   *" + System.lineSeparator() + "   *" + System.lineSeparator() + "   *"
                + System.lineSeparator());
        m.put('T', sbT.toString());

        StringBuilder sbU = new StringBuilder();
        sbU.append("*     *" + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *"
                + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *" + System.lineSeparator()
                + " ***** " + System.lineSeparator());
        m.put('U', sbU.toString());

        StringBuilder sbV = new StringBuilder();
        sbV.append("*         *" + System.lineSeparator() + " *       * " + System.lineSeparator() + "  *     *  "
                + System.lineSeparator() + "   *   *   " + System.lineSeparator() + "    * *" + System.lineSeparator()
                + "     *     " + System.lineSeparator());
        m.put('V', sbV.toString());

        StringBuilder sbW = new StringBuilder();
        sbW.append("*     *" + System.lineSeparator() + "*     *" + System.lineSeparator() + "*     *"
                + System.lineSeparator() + "*  *  *" + System.lineSeparator() + "* * * *" + System.lineSeparator()
                + " *   * " + System.lineSeparator());
        m.put('W', sbW.toString());

        StringBuilder sbX = new StringBuilder();
        sbX.append("*     *" + System.lineSeparator() + " *   * " + System.lineSeparator() + "  * *  "
                + System.lineSeparator() + "   *   " + System.lineSeparator() + "  * *  " + System.lineSeparator()
                + " *   * " + System.lineSeparator());
        m.put('X', sbX.toString());

        StringBuilder sbY = new StringBuilder();
        sbY.append("*     *" + System.lineSeparator() + " *   * " + System.lineSeparator() + "  * *  "
                + System.lineSeparator() + "   *   " + System.lineSeparator() + "  *" + System.lineSeparator() + " *"
                + System.lineSeparator());
        m.put('Y', sbY.toString());

        StringBuilder sbZ = new StringBuilder();
        sbZ.append("******" + System.lineSeparator() + "    *" + System.lineSeparator() + "   *"
                + System.lineSeparator() + "  *" + System.lineSeparator() + " *" + System.lineSeparator() + "******"
                + System.lineSeparator());
        m.put('Z', sbZ.toString());

        return m;

    }

}
