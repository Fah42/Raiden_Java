public class Projectile {
    int x,y;
    
    public Projectile(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void move() {
        y--;
    }
}