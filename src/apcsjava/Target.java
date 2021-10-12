/*
Name: Denoon, Derek
Date: October 11, 2021
Assignment: Dodgeball
 */
package apcsjava;

public class Target {
    // how many times its been hit
    private int hitCount;

    // initial hit count is 0
    public Target() {
        hitCount = 0;
    }

    // setter and getter

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }


    // adds one to hit count
    public void hitCountPlusOne(){
       hitCount++;
    }
}
