package apcsjava;

public class Game {
    private int discretePlayersHit;
    private boolean overHalfHit;

    public Game(int targetCount, int throwerCount, double hitProbability) {
        runGame(targetCount,throwerCount,hitProbability);
    }
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

    public void runGame(int targetCount, int throwerCount, double hitProbability){

        Thrower[] throwers = new Thrower[throwerCount];
        for (int i = 0; i < throwerCount; i++) {
            throwers[i] = new Thrower();
        }

        Target[] targets = new Target[targetCount];
        for (int i = 0; i < targetCount; i++) {
            targets[i] = new Target();
        }
        for (int i = 0; i < throwerCount; i++){
            int targetHit = throwers[i].throwBall(targetCount,hitProbability);
            if(targetHit != -1){
                targets[targetHit].hitCountPlusOne();
            }
        }


       this.setDiscretePlayersHit(discretePlayersHit(targets));

       this.setOverHalfHit(overHalfHit(this.discretePlayersHit,targetCount));

    }

    private static int discretePlayersHit(Target[] in){
        Target[] targets = in.clone();
        int playersHit = 0;
        for (int i = 0; i< targets.length;i++){
            if(targets[i].getHitCount() > 0 ){
                playersHit++;
            }
        }

        return playersHit;
    }

    private static boolean overHalfHit(int playersHit,int totalPlayers){
        return playersHit > totalPlayers / 2;
    }


}
