/*
Name: Denoon, Derek
Date: October 11, 2021
Assignment: Dodgeball
 */
package apcsjava;

public class Thrower {
    // if they have thrown
    private boolean hasThrown;


    public Thrower() {
        this.hasThrown = false;
    }

    // setter and getter
    public boolean isHasThrown() {
        return hasThrown;
    }

    public void setHasThrown(boolean hasThrown) {
        this.hasThrown = hasThrown;
    }


    // returns the player hit
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
