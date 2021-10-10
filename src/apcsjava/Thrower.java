package apcsjava;

public class Thrower {
    private boolean hasThrown;


    public Thrower() {
        this.hasThrown = false;
    }


    public boolean isHasThrown() {
        return hasThrown;
    }

    public void setHasThrown(boolean hasThrown) {
        this.hasThrown = hasThrown;
    }

    public int throwBall(int players,double hitProbability){
        // enter hit probability in decimal form
        int playerHit = (int) (Math.random() * (players));
        setHasThrown(true);
        if(Math.random() < hitProbability){
            return playerHit;
        }else{
            return -1;
        }


    }
}
