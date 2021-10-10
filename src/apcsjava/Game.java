package apcsjava;

public class Game {
    public static void main(String[] args) {
        runGame(10,10,1);


    }

    public static void runGame(int targetCount,int throwerCount, double hitProbability){

        Thrower[] throwers = new Thrower[throwerCount];
        for (int i = 0; i < 10; i++) {
            throwers[i] = new Thrower();
        }

        Target[] targets = new Target[targetCount];
        for (int i = 0; i < 10; i++) {
            targets[i] = new Target();
        }
        for (int i = 0; i < 10; i++){
            int targetHit = throwers[i].throwBall(targetCount,hitProbability);
            if(targetHit != -1){
                targets[targetHit].hitCountPlusOne();
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(targets[i].getHitCount());
        }

        System.out.println("targets hit is " + discretePlayersHit(targets));

    }

    public static int discretePlayersHit(Target[] in){
        Target[] targets = in.clone();
        int playersHit = 0;
        for (int i = 0; i< targets.length;i++){
            if(targets[i].getHitCount() > 0 ){
                playersHit++;
            }
        }

        return playersHit;
    }

    public static void ProbOverHalfHit(Target[] in){

    }
}
