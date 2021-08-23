package com.company;

public class QuestionMarkTile extends Tile {
    private static final int TILECODE = 4;

    @Override
    public int getTileCode() {
        return TILECODE;
    }

    @Override
    public String toString() {
        return "[?]";
    }
}
