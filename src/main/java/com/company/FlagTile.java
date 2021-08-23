package com.company;

public class FlagTile extends Tile {
    private static final int TILECODE = 3;

    @Override
    public int getTileCode() {
        return TILECODE;
    }

    @Override
    public String toString() {
        return "[\uD83D\uDEA9]";
    }
}
