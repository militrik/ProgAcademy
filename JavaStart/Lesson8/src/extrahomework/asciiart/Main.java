package extrahomework.asciiart;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        asciiFlash("flash.txt");
    }

    public static void asciiFlash(String s) {
        char[][] flash = new char[40][40];
        for (int i = 0; i < flash.length; i++) {
            for (int j = 0; j < flash[0].length; j++) {
                flash[i][j] = ' ';
            }
        }
        flashStream(0, 0, flash, 3, 0);
        arrayChar2DToFile(s, flash);
    }

    /**
     *
     */
    public static int flashStream(int x, int y, char[][] arr, int direction, int amountNodes) {
        int nodeProbability = 7;
        int maxNodes = 2;
        Random rnd = new Random();
        while (x < arr.length - 1 && y < arr[0].length - 1) {
            int xInc = rnd.nextInt(-1, 2);
            int yInc = rnd.nextInt(-1, 2);

            if (!checkDirection(direction, x, y, xInc, yInc, arr)) {
                continue;
            }

            int probability = rnd.nextInt(0, nodeProbability);
            if ((xInc == 0 && yInc == 0 && probability == 0) && amountNodes < maxNodes) {
                int newDirection;
                do {
                    newDirection = rnd.nextInt(0, 4);
                } while (newDirection == 1 || newDirection == direction);

                amountNodes++;
                amountNodes = flashStream(x, y, arr, newDirection, amountNodes); // flash node
            }

            x = checkXBounds(x, xInc, arr);
            y = checkYBounds(y, yInc, arr);

            if (xInc != 0 || yInc != 0) {
                arr[x][y] = '*';
            }
        }
        return amountNodes;
    }

    public static int checkXBounds(int x, int xInc, char[][] arr) {
        if (x >= 0) {
            if (x + xInc < 0) x = 0;
            else if (x + xInc > arr.length - 1) {
                x = arr.length - 1;
            } else
                x += xInc;
        }
        return x;
    }

    public static int checkYBounds(int y, int yInc, char[][] arr) {
        if (y >= 0) {
            if (y + yInc < 0) {
                y = 0;
            } else if (y + yInc > arr[0].length - 1) {
                y = arr[0].length - 1;
            } else
                y += yInc;
        }
        return y;
    }

    public static void arrayChar2DToFile(String name, char[][] arr) {
        File myFile = new File(name);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (PrintWriter pw = new PrintWriter(myFile)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    pw.print(arr[i][j]);
                    System.out.print(arr[i][j]);
                }
                pw.print(System.lineSeparator());
                System.out.print(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean checkDirection(int direction, int x, int y, int xInc, int yInc, char[][] arr) {
        if (xInc != 0 || yInc != 0) {
            switch (direction) {
                case 0 -> {
                    if (
                            ((xInc == -1 && yInc == -1)
                                    || (xInc == 0 && yInc == -1)
                                    || (xInc == 1 && yInc == -1)
                                    || (xInc == 1 && yInc == 0)
                                    || (xInc == 1 && yInc == 1))
                                    ||
                                    (arr[checkXBounds(x, xInc, arr)][checkYBounds(y, yInc, arr)] == 'y')
                    ) {
                        return false;
                    }
                }
                case 1 -> {
                    {
                        return false; // direction to quadrant #1 denied
                    }
                }
                case 2 -> {
                    if (
                            ((xInc == -1 && yInc == -1)
                                    || (xInc == -1 && yInc == 0)
                                    || (xInc == -1 && yInc == 1)
                                    || (xInc == 0 && yInc == 1)
                                    || (xInc == 1 && yInc == 1))
                                    ||
                                    (arr[checkXBounds(x, xInc, arr)][checkYBounds(y, yInc, arr)] == 'y')
                    ) {
                        return false;
                    }
                }
                case 3 -> {
                    if (
                            ((xInc == -1 && yInc == 1)
                                    || (xInc == -1 && yInc == 0)
                                    || (xInc == -1 && yInc == -1)
                                    || (xInc == 0 && yInc == -1)
                                    || (xInc == 1 && yInc == -1))
                                    ||
                                    (arr[checkXBounds(x, xInc, arr)][checkYBounds(y, yInc, arr)] == 'y')
                    ) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


}
