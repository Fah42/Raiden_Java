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
                // Stocke simplement l'entrée pour qu'elle soit traitée dans Update
                player.setCurrentInput(input);
            }
        }
    }
}