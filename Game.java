import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    Player player;
    List<Enemy> enemies = new ArrayList<>();
    List<Projectile> projectiles = new ArrayList<>();

    public Game() {
        player = new Player(10, 10);
        enemies.add(new Enemy(5, 5));
        enemies.add(new Enemy(15, 5));
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            if (scanner.hasNextLine()) {
                if ("left".equals(input)) {
                    player.moveLeft();
                } else if ("right".equals(inputs)) {
                    player.moveRight();
                } else if ("shoot".equals(input)) {
                    projectiles.add(new Projectile(player.x, player.y));
                }
            }
            
            updateGame();
            drawGame();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateGame() {
        // a faire
    }

    private void drawGame() {
        // a faire
    }
}