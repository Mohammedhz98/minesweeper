package com.company;

public class HiddenTile extends Tile {
    private final int tileCode = 5;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    public String toString() {
        String hiddenBox = "[\u25A0]";
        return hiddenBox;
    }
}
