package com.company;

public class MSGrid {
    public static Tile[][] hiddenBoard;
    private static Tile[][] uncoveredBoard;
    private static int totalMines;


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
        //System.out.println(hiddenBoard.length);
        HiddenTile hidden = new HiddenTile();
        for(int i=0; i < hiddenBoard.length; i++) {
            for(int j=0; j < hiddenBoard.length; j++) {
                hiddenBoard[i][j] = hidden;
            }
        }
        return hiddenBoard;
    }

    public static int bombsAroundTile(Tile[][] uncoveredGrid, int x,int y) {
                int totalBombsAroundTile = 0;
                if (x > 0 &&  y > 0 && uncoveredGrid[x - 1][y - 1].getTileCode() == 2) {
                    totalBombsAroundTile++;
                }
                if (y > 0 && uncoveredGrid[x][y - 1].getTileCode() == 2) {
                    totalBombsAroundTile++;
                }
                if (x < (uncoveredGrid.length - 1) && y > 0 && uncoveredGrid[x + 1][y - 1].getTileCode() == 2) {
                    totalBombsAroundTile++;
                }
                if (x > 0 && uncoveredGrid[x - 1][y].getTileCode() == 2) {
                    totalBombsAroundTile++;
                }
                if (x < (uncoveredGrid.length - 1) && uncoveredGrid[x + 1][y].getTileCode() == 2) {
                    totalBombsAroundTile++;
                }
                if (x > 0 && y < (uncoveredGrid.length - 1) && uncoveredGrid[x - 1][y + 1].getTileCode() == 2) {
                    totalBombsAroundTile++;
                }
                if (y < (uncoveredGrid.length - 1) && uncoveredGrid[x] [y + 1].getTileCode() == 2) {
                    totalBombsAroundTile++;
                }
                if (x < (uncoveredGrid.length - 1) && y < (uncoveredGrid.length - 1) && uncoveredGrid[x + 1][y + 1].getTileCode() == 2) {
                    totalBombsAroundTile++;
                }
        return totalBombsAroundTile;
    }
    public static Tile[][] addNumberTiles(Tile[][] uncoveredGrid) {
        for(int i=0; i < uncoveredGrid.length; i++) {
            for(int j=0; j < uncoveredGrid.length; j++) {
                if(uncoveredGrid[i][j].getTileCode() == 1 && bombsAroundTile(uncoveredGrid,i,j) != 0 ) {
                    uncoveredGrid[i][j] = new NumberTile(bombsAroundTile(uncoveredGrid,i,j));
                }
            }
        }
        return uncoveredGrid;
    }
    public static Tile[][] createUncoveredGrid(int x, int y) {
        uncoveredBoard = new Tile[x][y];
        int lowerBound = 15;
        int randomRange = 15;
        int placeableMines = (int) (lowerBound + Math.round(Math.random()*randomRange));
        Tile tile = new Tile();
        Tile bomb = new BombTile();
        for(int i=0; i < uncoveredBoard.length; i++) {
            int bombLineCount = 0;
            for(int j=0; j < uncoveredBoard.length; j++) {
                if(Math.random() >= 0.8 && placeableMines !=0 && bombLineCount == 4) {
                    uncoveredBoard[i][j] = tile;
                }
                else if(Math.random() >= 0.8 && placeableMines !=0 && bombLineCount < 4) {
                    uncoveredBoard[i][j] = bomb;
                    placeableMines--;
                    bombLineCount++;
                    totalMines++;
                }
                else {
                    uncoveredBoard[i][j] = tile;
                }
            }
        }
        addNumberTiles(uncoveredBoard);
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
}
