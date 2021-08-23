package com.company;

public class HiddenTile extends Tile {
    private static final int TILECODE = 5;

    @Override
    public int getTileCode() {
        return TILECODE;
    }

    @Override
    public String toString() {
        return "[\u25A0]";
    }
}
