package com.company;

public class Tile {
    private final int tileCode = 1;
    public String name = "Empty";


    public String toString() {
        String box = "[ ]";
        return box;
    }

    public int getTileCode() {
        return tileCode;
    }

    public static void main(String[] args) {
        Tile tileOne = new Tile();
        Tile tileTwo = new Tile();
        System.out.println(tileOne);
    }
}
