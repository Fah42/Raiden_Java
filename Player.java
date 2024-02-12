public class Player {
    int x, y;
    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void moveLeft() {
        x--;
    }

    public void moveRight() {
        x++;
    }
}