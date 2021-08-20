package com.company;

public class BombTile extends Tile {
    private final int tileCode = 2;

    public String toString() {
        String bombBox = "  ------ \n" +
                         " |   i  | \n" +
                         " |   O  | \n" +
                         "  ------ \n";

        return bombBox;
    }
}
