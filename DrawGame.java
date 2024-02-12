import java.util.List;

public class DrawGame {
    int gameWidth = 80;
    int gameHeight = 24;
    Player player;
    List<Enemy> enemies;
    List<Projectile> projectiles;
    
    public DrawGame(Player player, List<Enemy> enemies, List<Projectile> projectiles) {
        this.player = player;
        this.enemies = enemies;
        this.projectiles = projectiles;
    }

    public void drawGame() {
        // Créer un tableau 2D pour représenter l'aire de jeu
        char[][] gameBoard = new char[gameHeight][gameWidth];
        StringBuilder buffer = new StringBuilder();

        // Initialiser l'aire de jeu avec des espaces vides
        for (int i = 0; i < gameHeight; i++) {
            for (int j = 0; j < gameWidth; j++) {
                gameBoard[i][j] = ' ';
            }
        }

        // Placer le joueur sur le tableau
        if (player.x >= 0 && player.x < gameWidth && player.y >= 0 && player.y < gameHeight) {
            gameBoard[player.y][player.x] = 'P';
        }
    
        // Placer les ennemis sur le tableau
        for (Enemy enemy : enemies) {
            if (enemy.x >= 0 && enemy.x < gameWidth && enemy.y >= 0 && enemy.y < gameHeight) {
                gameBoard[enemy.y][enemy.x] = 'E';
            }
        }
    
        // Placer les projectiles sur le tableau
        for (Projectile projectile : projectiles) {
            gameBoard[projectile.y][projectile.x] = '|';
        }
    
        // Construis ta sortie dans le buffer
        for (int i = 0; i < gameHeight; i++) {
            for (int j = 0; j < gameWidth; j++) {
                buffer.append(gameBoard[i][j]);
            }
            buffer.append("\n"); // Ajoute une nouvelle ligne à la fin de chaque ligne de l'aire de jeu
        }

        // Effacer l'écran avant de dessiner
        System.out.print("\033[H\033[2J");
        System.out.print(buffer.toString());
        System.out.flush();
    }
}
