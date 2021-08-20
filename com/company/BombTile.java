package com.company;

public class BombTile extends Tile {
    private final int tileCode = 2;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    public String toString() {
        String bombBox = "[\uD83D\uDCA5]";

        return bombBox;
    }

}
