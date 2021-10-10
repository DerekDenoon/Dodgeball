package apcsjava;


import java.util.Scanner;

public class Simulation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfThrowers;
        int numberOfTargets;
        int trials;
        double hitChance;

        System.out.println("Enter the number of throwers");
        numberOfThrowers = in.nextInt();
        System.out.println("Enter the number of targets");
        numberOfTargets = in.nextInt();
        System.out.println("Enter the number of trials");
        trials = in.nextInt();
        System.out.println("Enter the hit probability (as a decimal)");
        hitChance = in.nextDouble();

        double avgPlayersHit = 0;
        double probOverHalf = 0;
        Game[] games = new Game[trials];

        for (int i = 0; i < trials; i++) {
            games[i] = new Game(numberOfTargets,numberOfThrowers,hitChance);
        }

        for (int i = 0; i < trials; i++) {
            avgPlayersHit += games[i].getDiscretePlayersHit();
        }

        avgPlayersHit = avgPlayersHit/trials;

        for (int i = 0; i < trials; i++) {
            if (games[i].isOverHalfHit()){
                probOverHalf++;
            }
        }
        probOverHalf = probOverHalf/trials;

        System.out.println("avg hit is " + avgPlayersHit);
        System.out.println("avg over half is " + probOverHalf);


    }

}

