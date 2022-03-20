package com.github.java_learning.divisibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) throws IOException {
               BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        Main.class.getResourceAsStream("/FiguresSet.txt")
                )
        );
        List<String> lines = Main.readAllLines(reader);

        List<Double> textFigures = new ArrayList<>();

        for (String textLine : lines) {
            List<Double> lineWords = Main.getFigures(textLine);
            textFigures.addAll(lineWords);
        }
        System.out.println(textFigures);
        int a = 1, b = 2, c = 3, d = 4, e = 5, f = 7, g = 8, h = 8, i = 9;
        int divisibilityby1 = 0, divisibilityby2 = 0, divisibilityby3 = 0, divisibilityby4 = 0, divisibilityby5 = 0;
        int divisibilityby6 = 0, divisibilityby7 = 0, divisibilityby8 = 0, divisibilityby9 = 0;

        for (Double textFigure : textFigures) {
            divisibilityby1++;
            if ((textFigure / b) - Math.floor((textFigure / b)) == 0) divisibilityby2++;
            if ((textFigure / c) - Math.floor((textFigure / c))== 0) divisibilityby3++;
            if ((textFigure / d) - Math.floor((textFigure / d))== 0) divisibilityby4++;
            if ((textFigure / e) - Math.floor((textFigure / e))== 0) divisibilityby5++;
            if ((textFigure / f) - Math.floor((textFigure / f))== 0) divisibilityby6++;
            if ((textFigure / g) - Math.floor((textFigure / g))== 0) divisibilityby7++;
            if ((textFigure / h) - Math.floor((textFigure / h))== 0) divisibilityby8++;
            if ((textFigure / i) - Math.floor((textFigure / i))== 0) divisibilityby9++;
        }
        System.out.println("1=" + divisibilityby1);
        System.out.println("2=" + divisibilityby2);
        System.out.println("3=" + divisibilityby3);
        System.out.println("4=" + divisibilityby4);
        System.out.println("5=" + divisibilityby5);
        System.out.println("6=" + divisibilityby6);
        System.out.println("7=" + divisibilityby7);
        System.out.println("8=" + divisibilityby8);
        System.out.println("9=" + divisibilityby9);
    }


    private static ArrayList<Double> getFigures(String line) {
        String[] s = line.split(" ");
        ArrayList<Double> figures = new ArrayList<>();
        for (String s1 : s) {
            Double a = Double.valueOf(s1);
            figures.add(a);
        }
        return figures;
    }

    private static List<String> readAllLines(BufferedReader reader) throws IOException {
        List<String> lines = new ArrayList<>();
        while (true) {
            String line = reader.readLine();
            if (line == null) {
                break;
            }
            lines.add(line);
        }
        return lines;
    }

}
