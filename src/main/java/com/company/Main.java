package com.company;

import java.util.Scanner;

import static com.company.MSGrid.*;

public class Main {

    public static void main(String[] args) {
        boolean gameRunning = false;
        System.out.println("Hello there my name is Miynes Weeper you must be bored\n" +
                           "from the looks of it. Would you like to play a game of " +
                           "Minesweeper? ");
        Scanner response = new Scanner(System.in);
        String answer = response.nextLine();
        if(answer.equals("yes")) {
            gameRunning =true;
            System.out.println("Wonderful let us play Minesweeper: ");
            System.out.println("How big do you want the Minesweeper grid to be? ");
            System.out.println("Enter grid size: ");
            Scanner sizeResponse = new Scanner(System.in);
            int size = sizeResponse.nextInt();
            setHiddenBoard(createHiddenGrid(size, size));
            setUncoveredBoard(createUncoveredGrid(size, size));
            System.out.println(displayHiddenGrid());
        }
        else if(answer.equals("no")) {
            System.out.println("That is sad to hear but oh well you can always run me" +
                               " again if you change your mind.");
            System.out.println("Goodbye!");
        }
        else {
            System.out.println("I'm sorry you didn't say a logical answer there please" +
                               " type either 'yes' or 'no': ");
            response = new Scanner(System.in);
            answer =response.nextLine();
        }
        System.out.println("Choose a co-ordinate where 0,0 is the top left corner of the grid or mark a flag on where\n" +
                           "you think a bomb may be what would you like to do? ");
        while (gameRunning) {
            System.out.println("Simply type the allocated number to select your options: \n" +
                               "1: Select a tile  2: flag a tile 3: un-flag a tile :");
            Scanner selection = new Scanner(System.in);
            int choice = selection.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Choose an X - Coordinate: ");
                    Scanner xChoice = new Scanner(System.in);
                    int x = xChoice.nextInt();
                    System.out.println("Choose a Y - Coordinate: ");
                    Scanner yChoice = new Scanner(System.in);
                    int y = yChoice.nextInt();
                    if(getUncoveredBoard()[y][x].getTileCode() == 2) {
                        System.out.println("Oh dear you have hit a bomb. Look like you lose.");
                        getHiddenBoard()[y][x] = getUncoveredBoard()[y][x];
                        System.out.println(displayHiddenGrid());
                        System.out.println("Better luck next time.");
                        gameRunning = false;
                    }
                    else {
                        getHiddenBoard()[y][x] = getUncoveredBoard()[y][x];
                        System.out.println(displayHiddenGrid());
                    }
                    break;
                case 2:
                    boolean flagPicked = false;
                    while (!flagPicked) {
                        System.out.println("Choose an X - Coordinate: ");
                        xChoice = new Scanner(System.in);
                        x = xChoice.nextInt();
                        System.out.println("Choose a Y - Coordinate: ");
                        yChoice = new Scanner(System.in);
                        y = yChoice.nextInt();
                        Tile flag = new FlagTile();
                        if (getHiddenBoard()[y][x].getTileCode() == 1 || getHiddenBoard()[y][x].getTileCode() == 6) {
                            System.out.println("You cannot flag an empty or numbered tile. You can only flag covered \n" +
                                    "tile's. Please select a covered tile to flag.");
                        } else {
                            getHiddenBoard()[y][x] = flag;
                            System.out.println(displayHiddenGrid());
                            flagPicked = true;
                        }
                    }
                    break;
                case 3:
                    boolean unflaggedPick = false;
                    while (!unflaggedPick) {
                        System.out.println("Choose an X - Coordinate: ");
                        xChoice = new Scanner(System.in);
                        x = xChoice.nextInt();
                        System.out.println("Choose a Y - Coordinate: ");
                        yChoice = new Scanner(System.in);
                        y = yChoice.nextInt();
                        Tile hidden = new HiddenTile();
                        if (getHiddenBoard()[y][x].getTileCode() != 3) {
                            System.out.println("The tile you had selected was not a flag tile. Please input the co-ordinates \n" +
                                    "for a tile that is flagged.");
                        } else {
                            getHiddenBoard()[y][x] = hidden;
                            System.out.println(displayHiddenGrid());
                            unflaggedPick = true;
                        }
                    }
            }
        }
    }
}
