package com.company;

public class HiddenTile extends Tile {
    private final int tileCode = 5;

    public String toString() {
        String hiddenBox = "[\u25A0]";
        return hiddenBox;
    }
}
