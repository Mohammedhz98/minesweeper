package com.company;

public class NumberTile extends Tile {
    private final int tileCode = 6;
    private int mineNumber;

    @Override
    public int getTileCode() {
        return tileCode;
    }

    public NumberTile(int noOfMines) {
        this.mineNumber = noOfMines;
    }

    public int getMineNumber() {
        return mineNumber;
    }

    public void setMineNumber(int mineNumber) {
        this.mineNumber = mineNumber;
    }

    public String toString() {
        String numberBox = "[" + getMineNumber() + "]";
        return numberBox;
    }
}
