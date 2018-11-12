package com.kodilla.rps;

public interface Figure {
    int DRAW = 0;
    int WIN = 1;
    int LOSS = -1;

    public int winWith(Figure figure);
}
