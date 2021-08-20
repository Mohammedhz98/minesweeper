package com.company;

import java.util.Scanner;

import static com.company.MSGrid.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello there my name is Miynes Weeper you must be bored\n" +
                           "from the looks of it. Would you like to play a game of " +
                           "Minesweeper? ");
        Scanner response = new Scanner(System.in);
        String answer = response.nextLine();
        if(answer.equals("yes")) {
            setHiddenBoard(createHiddenGrid(10,10));
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
    }
}
