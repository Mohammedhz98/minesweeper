package com.company;

public class BombTile extends Tile {
    private static final int tileCode = 2;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    @Override
    public String toString() {
        return "[\uD83D\uDCA3]";
    }
}
