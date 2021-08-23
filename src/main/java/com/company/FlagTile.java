package com.company;

public class FlagTile extends Tile {
    private final int tileCode = 3;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    @Override
    public String toString() {
        return "[\uD83D\uDEA9]";
    }
}
