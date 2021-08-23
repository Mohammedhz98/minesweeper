package com.company;

public class BombTile extends Tile {
    private static final int TILECODE = 2;

    @Override
    public int getTileCode() {
        return TILECODE;
    }

    @Override
    public String toString() {
        return "[\uD83D\uDCA3]";
    }
}
