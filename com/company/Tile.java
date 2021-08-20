package com.company;

public class Tile {
    private final int tileCode = 1;
    public String toString() {
        String box = "  ------ \n" +
                     " |      | \n" +
                     " |      | \n" +
                     "  ------ \n";
        return box;
    }

    public static void main(String[] args) {
        Tile tileOne = new Tile();
        Tile tileTwo = new Tile();
        System.out.println(tileOne);
    }
}
