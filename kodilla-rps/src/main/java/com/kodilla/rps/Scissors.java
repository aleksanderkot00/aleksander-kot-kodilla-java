package com.kodilla.rps;

public class Scissors implements Figure {

    public int WinWith(Figure figure) {
        if ( getClass().getSimpleName().equals(figure.getClass().getSimpleName()) ) {
            return DRAW;
        } else if ( figure.getClass().getSimpleName().equals(Paper.class.getSimpleName()) ) {
            return WIN;
        } else {
            return LOSE;
        }
    }
}
