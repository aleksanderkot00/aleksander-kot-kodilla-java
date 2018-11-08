package com.kodilla.rps;

public interface Figure {
    int DRAW = 0;
    int WIN = 1;
    int LOSE = -1;

    public int WinWith(Figure figure);
}
