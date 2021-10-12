/*
Name: Denoon, Derek
Date: October 11, 2021
Assignment: Dodgeball
 */

package apcsjava;

public class Game {
    // represents the outcome of the game
    private int discretePlayersHit;
    private boolean overHalfHit;


    // runs the game when it is created (constructor)
    public Game(int targetCount, int throwerCount, double hitProbability) {
        runGame(targetCount,throwerCount,hitProbability);
    }

    // setter and getter
    public int getDiscretePlayersHit() {
        return discretePlayersHit;
    }
    public void setDiscretePlayersHit(int discretePlayersHit) {
        this.discretePlayersHit = discretePlayersHit;
    }
    public boolean isOverHalfHit() {
        return overHalfHit;
    }
    public void setOverHalfHit(boolean overHalfHit) {
        this.overHalfHit = overHalfHit;
    }

    // runs the gamer

    public void runGame(int targetCount, int throwerCount, double hitProbability){

        // array of throwers with the number of throwers
        Thrower[] throwers = new Thrower[throwerCount];
        for (int i = 0; i < throwerCount; i++) {
            throwers[i] = new Thrower();
        }

        // array of targets with the number of targets
        Target[] targets = new Target[targetCount];
        for (int i = 0; i < targetCount; i++) {
            targets[i] = new Target();
        }
        //
        for (int i = 0; i < throwerCount; i++){
            int targetHit = throwers[i].throwBall(targetCount,hitProbability);
            // targethit = -1 if no target was hit
            if(targetHit != -1){
                targets[targetHit].hitCountPlusOne();
            }
        }


       this.setDiscretePlayersHit(discretePlayersHit(targets));

       this.setOverHalfHit(overHalfHit(this.discretePlayersHit,targetCount));

    }

    private static int discretePlayersHit(Target[] in){
        // calculates the players hit in the target array
        Target[] targets = in.clone();
        int playersHit = 0;
        for (int i = 0; i< targets.length;i++){
            if(targets[i].getHitCount() > 0 ){
                // every time a player is hit at least once it adds one to the hit count
                playersHit++;
            }
        }

        return playersHit;
    }

    private static boolean overHalfHit(int playersHit,int totalPlayers){
        return playersHit > totalPlayers / 2;
    }


}
