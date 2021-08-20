package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class MSGrid {
    public static Tile[][] hiddenBoard;
    private static Tile[][] uncoveredBoard;
    private static int totalMines;
    private static int x;
    private static int y;


    public static Tile[][] getHiddenBoard() {
        return hiddenBoard;
    }

    public static void setHiddenBoard(Tile[][] hiddenBoard) {
        MSGrid.hiddenBoard = hiddenBoard;
    }

    public static Tile[][] getUncoveredBoard() {
        return uncoveredBoard;
    }

    public static void setUncoveredBoard(Tile[][] uncoveredBoard) {
        MSGrid.uncoveredBoard = uncoveredBoard;
    }

    public static Tile[][] createHiddenGrid(int x, int y) {
        hiddenBoard = new Tile[x][y];
        HiddenTile hidden = new HiddenTile();
        for(int i=0; i < hiddenBoard.length; i++) {
            for(int j=0; j < hiddenBoard.length; j++) {
                hiddenBoard[i][j] = hidden;
            }
        }
        return hiddenBoard;
    }

    public static Tile[][] createUncoveredGrid(int x, int y) {
        uncoveredBoard = new Tile[x][y];
        int lowerBound = 10;
        int randomRange = 15;
        totalMines = (int) (lowerBound + Math.round(Math.random()*randomRange));
        int mineCount = totalMines;
        System.out.println(totalMines);
        Tile tile = new Tile();
        Tile bomb = new BombTile();
        for(int i=0; i < uncoveredBoard.length; i++) {
            int bombLineCount = 0;
            for(int j=0; j < uncoveredBoard.length; j++) {
                if(Math.random() >= 0.6 && mineCount!=0 && bombLineCount == 3) {
                    uncoveredBoard[i][j] = tile;
                }
                else if(Math.random() >= 0.6 && mineCount!=0) {
                    uncoveredBoard[i][j] = bomb;
                    mineCount --;
                    bombLineCount++;
                }
                else {
                    uncoveredBoard[i][j] = tile;
                }
            }
        }
        return uncoveredBoard;
    }

    public static String displayHiddenGrid() {
        StringBuilder board = new StringBuilder();
        for (int i = 0; i < getHiddenBoard().length; i++) {
            for (int j = 0; j < getHiddenBoard().length; j++) {
                board.append(getHiddenBoard()[i][j]);
            }
            board.append("\n");
        }
        return board.toString();
    }

    public static String displayUncoveredGrid() {
        StringBuilder board = new StringBuilder();
        for (int i = 0; i < getUncoveredBoard().length; i++) {
            for (int j = 0; j < getUncoveredBoard().length; j++) {
                board.append(getUncoveredBoard()[i][j]);
            }
            board.append("\n");
        }
        return board.toString();
    }

    public static void main(String[] args) {
        uncoveredBoard = createUncoveredGrid(10,10);
        // System.out.println(displayHiddenGrid());
        //int maxMines = 15;
        //totalMines = (int) (10 + Math.round(Math.random()*maxMines));
        System.out.println(displayUncoveredGrid());
    }
}
