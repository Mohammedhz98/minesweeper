package com.company;

public class HiddenTile {
    private final int tileCode = 5;

    public String toString() {
        String hiddenBox = "  ------ \n" +
                           " | / / / | \n" +
                           " |/ / / /| \n" +
                           "  ------ \n";
        return hiddenBox;
    }
}
