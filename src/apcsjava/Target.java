package apcsjava;

public class Target {
    private int hitCount;

    public Target() {
        hitCount = 0;
    }

    public int getHitCount() {
        return hitCount;
    }

    public void setHitCount(int hitCount) {
        this.hitCount = hitCount;
    }

    public void hitCountPlusOne(){
       hitCount++;
    }
}
