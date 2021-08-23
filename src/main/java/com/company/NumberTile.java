package com.company;

public class NumberTile extends Tile {
    private static final int tileCode = 6;
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

    @Override
    public String toString() {
        return "[" + getMineNumber() + "]";
    }
}
