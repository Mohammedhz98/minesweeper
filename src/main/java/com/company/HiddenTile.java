package com.company;

public class HiddenTile extends Tile {
    private final int tileCode = 5;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    @Override
    public String toString() {
        return "[\u25A0]";
    }
}
