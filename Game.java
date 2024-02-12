import java.util.ArrayList;
import java.util.List;

public class Game {
    Player player;
    List<Enemy> enemies = new ArrayList<>();
    List<Projectile> projectiles = new ArrayList<>();
    InputHandler inputHandler;
    Update updateGame;
    DrawGame drawGame;

    public Game() {
        player = new Player(2, 5); // Position initiale du joueur
        enemies.add(new Enemy(69, 13)); // Ajouter des ennemis
        enemies.add(new Enemy(69, 23));
        drawGame = new DrawGame(player, enemies, projectiles);
        inputHandler = new InputHandler(player, projectiles); // Initialiser InputHandler
        updateGame = new Update(player, enemies, projectiles, drawGame);
    }

    public void start() {
        /*
         * Utilisation d'une expression lambda (fonction anonyme) -> qui permet d'eviter la creation d'une classe pour l'excution de handleInput
         */
        Thread inputThread = new Thread(() -> inputHandler.handleInput()); // Créer un thread pour gérer les entrées
        inputThread.start(); // Démarrer le thread d'entrée

        while (true) { // Boucle principale du jeu
            updateGame.gameUpdate(); // Met à jour l'état du jeu
            drawGame.drawGame(); // Dessine l'état actuel du jeu dans le terminal

            try {
                Thread.sleep(1000); // Pause pour contrôler la vitesse de la boucle de jeu
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}