package com.company;

public class QuestionMarkTile extends Tile {
    private static final int tileCode = 4;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    @Override
    public String toString() {
        return "[?]";
    }
}
