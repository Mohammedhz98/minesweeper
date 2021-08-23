package com.company;

public class FlagTile extends Tile {
    private final int tileCode = 3;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    public String toString() {
        String flagBox = "[\uD83D\uDEA9]";
        return flagBox;
    }
}
