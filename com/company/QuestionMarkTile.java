package com.company;

public class QuestionMarkTile extends Tile {
    private final int tileCode = 4;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    public String toString() {
        String QuestionMarkBox = "[?]";

        return QuestionMarkBox;
    }
}
