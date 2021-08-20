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
            setHiddenBoard(createHiddenGrid(10,10));
            setUncoveredBoard(createUncoveredGrid(10,10));
            System.out.println(displayHiddenGrid());
        }
        else if(answer.equals("no")) {
            System.out.println("That is sad to hear but oh well you can always run me" +
                               " again if you change your mind.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Goodbye!");
        }
        else {
            System.out.println("I'm sorry you didn't say a logical answer there please" +
                               " type either 'yes' or 'no': ");
            response = new Scanner(System.in);
            answer =response.nextLine();
        }
        System.out.println("Chose a co-ordinate where 0,0 is the top left corner of the grid.");
        while (gameRunning) {
            System.out.println("Chose an X - Coordinate: ");
            Scanner xChoice = new Scanner(System.in);
            int x = xChoice.nextInt();
            System.out.println("Chose a Y - Coordinate: ");
            Scanner yChoice = new Scanner(System.in);
            int y = yChoice.nextInt();
            if(getUncoveredBoard()[x][y].getTileCode() == 2) {
               System.out.println("Oh dear you have hit a bomb. Look like you lose.");
               getHiddenBoard()[x][y] = getUncoveredBoard()[x][y];
               System.out.println(displayHiddenGrid());
               System.out.println("Better luck next time.");
               gameRunning =false;
            }
            else {
                getHiddenBoard()[x][y] = getUncoveredBoard()[x][y];
                System.out.println(displayHiddenGrid());
            }
        }
    }
}
