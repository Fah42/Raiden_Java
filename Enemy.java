public class Enemy {
    int x,y;

    public Enemy(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void move() {
        x++;
    }
}