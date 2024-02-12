import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {
    Player player;
    List<Projectile> projectiles = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public InputHandler(Player player) {
        this.player = player;
    }

    public InputHandler(Player player, List<Projectile> projectiles) {
        this.player = player;
        this.projectiles = projectiles;
    }

    public void handleInput() {
        while (true) {
            if (scanner.hasNextLine()) { 
                String input = scanner.nextLine().toLowerCase();
                // Vérifie la commande entrée par l'utilisateur et agit en conséquence
                switch (input) {
                    case "a":
                        player.moveLeft();
                        break;
                    case "d":
                        player.moveRight();
                        break;
                    case "w":
                        projectiles.add(new Projectile(player.x, player.y - 1)); // Crée un nouveau projectile à la position du joueur
                        break;
                }
            }
        }
    }
}