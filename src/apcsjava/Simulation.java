/*
Name: Denoon, Derek
Date: October 11, 2021
Assignment: Dodgeball
 */


package apcsjava;


import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        // scanner
        Scanner in = new Scanner(System.in);
        int numberOfThrowers;
        int numberOfTargets;
        int trials;
        double hitChance;

        // entering the parameters in to variables

        System.out.println("Enter the number of throwers");
        numberOfThrowers = in.nextInt();
        System.out.println("Enter the number of targets");
        numberOfTargets = in.nextInt();
        System.out.println("Enter the number of trials  (100,000 recommended ");
        trials = in.nextInt();
        System.out.println("Enter the hit probability (as a decimal)");
        hitChance = in.nextDouble();



        double avgPlayersHit = 0;
        double probOverHalf = 0;
        // creates an array of games with the number of trials as the length
        Game[] games = new Game[trials];

        // creates the game (and as a result runs the constructor)
        for (int i = 0; i < trials; i++) {
            games[i] = new Game(numberOfTargets,numberOfThrowers,hitChance);
        }

        // finds the total players hit
        for (int i = 0; i < trials; i++) {
            avgPlayersHit += games[i].getDiscretePlayersHit();
        }

        // finds the average
        avgPlayersHit = avgPlayersHit/trials;


        // finds if over half were hit
        for (int i = 0; i < trials; i++) {
            if (games[i].isOverHalfHit()){
                probOverHalf++;
            }
        }

        // finds over half percentage

        probOverHalf = probOverHalf/trials;

        System.out.println("avg hit is " + avgPlayersHit);
        System.out.println("avg over half is " + probOverHalf);


    }

}

