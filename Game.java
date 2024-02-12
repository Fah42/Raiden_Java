import java.util.ArrayList;
import java.util.List;
public class Game {
    Player player;
    List<Enemy> enemies = new ArrayList<>();
    List<Projectile> projectiles = new ArrayList<>();
    InputHandler inputHandler;

    public Game() {
        player = new Player(10, 10); // Position initiale du joueur
        enemies.add(new Enemy(5, 5)); // Ajouter des ennemis
        enemies.add(new Enemy(15, 5));
        inputHandler = new InputHandler(player, projectiles); // Initialiser InputHandler
    }

    public void start() {
        Thread inputThread = new Thread(() -> inputHandler.handleInput()); // Créer un thread pour gérer les entrées
        inputThread.start(); // Démarrer le thread d'entrée

        while (true) { // Boucle principale du jeu
            inputHandler.handleInput(); // Verifie l'input du joueur;
            updateGame(); // Met à jour l'état du jeu
            drawGame(); // Dessine l'état actuel du jeu dans le terminal

            try {
                Thread.sleep(100); // Pause pour contrôler la vitesse de la boucle de jeu
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateGame() {
        // Logique de mise à jour du jeu
    }

    private void drawGame() {
        // Logique de dessin du jeu
    }
}