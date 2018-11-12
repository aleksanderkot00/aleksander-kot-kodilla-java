package com.kodilla.rps.figures;

public class Rock implements Figure {

    public int winWith(Figure figure) {
        if ( getClass().getSimpleName().equals(figure.getClass().getSimpleName()) ) {
            return DRAW;
        } else if ( figure.getClass().getSimpleName().equals(Scissors.class.getSimpleName()) ) {
            return WIN;
        } else {
            return LOSS;
        }
    }
}
