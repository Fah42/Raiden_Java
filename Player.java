public class Player {
    int x, y;
    private String currentInput;

    public Player(int startX, int startY) {
        this.x = startX;
        this.y = startY;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public String getCurrentInput() {
        return this.currentInput;
    }

    public void setCurrentInput(String currentInput) {
        this.currentInput = currentInput;
    }

}