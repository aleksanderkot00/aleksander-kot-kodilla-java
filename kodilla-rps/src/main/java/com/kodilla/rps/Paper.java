package com.kodilla.rps;

public class Paper implements Figure {

    public int winWith(Figure figure) {
        if ( getClass().getSimpleName().equals(figure.getClass().getSimpleName()) ) {
            return DRAW;
        } else if ( figure.getClass().getSimpleName().equals(Rock.class.getSimpleName()) ) {
            return WIN;
        } else {
            return LOSS;
        }
    }
}
