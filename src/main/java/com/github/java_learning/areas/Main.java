package com.github.java_learning.areas;

import java.util.List;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Figure myBigSquare = new Square(7.0);
        Figure myMagicTriangle = new Triangle(5.0, 7.0);
        Figure myRound = new Round(3.0);

        List<Figure> myFigures = asList(
                myBigSquare,
                myMagicTriangle,
                myRound
        );

        for (Figure myFigure : myFigures) {
            System.out.println(myFigure.getArea());
        }
    }
}
