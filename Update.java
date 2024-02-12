import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Update {
    Player player;
    DrawGame drawGame;
    List<Enemy> enemies;
    List<Projectile> projectiles;

    public Update(Player player, List<Enemy> enemies, List<Projectile> projectiles) {
        this.player = player;
        this.enemies = enemies;
        this.projectiles = projectiles;
    }

    public Update() {
    }

    public void gameUpdate() {
        // Mettre à jour le joueur
        updatePlayer();

        // Mettre à jour les ennemis
        updateEnemies();

        // Mettre à jour les projectiles
        updateProjectiles();

        // Gérer les collisions
        checkCollisions();
    }

    private void updatePlayer(String input) {
        if ("w".equals(input) && player.y > 0) {
            player.moveUp(); // Déplace le joueur en haut si possible
        } else if ("s".equals(input) && player.y < drawGame.gameWidth - 1) {
            player.moveDown(); // Déplace le joueur bas si possible
        }
    }

    private void updateEnemies() {
        // Logique de déplacement des ennemis...
    }

    private void updateProjectiles() {
        // Logique de mise à jour des projectiles...
    }

    private void checkCollisions() {
        // Logique de détection des collisions...
    }
}
