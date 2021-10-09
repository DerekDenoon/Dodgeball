package apcsjava;

public class Target {
    private boolean isHit;

    public Target(){
        isHit = false;
    }

    public boolean isHit() {
        return isHit;
    }

    public void setHit(boolean hit) {
        isHit = hit;
    }
}
