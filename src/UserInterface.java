import java.util.Scanner;

/**
 * Η κλάση αυτή υλοποιεί μια διεπαφή γραμμής εντολών για το παιχνίδι "μάντεψε 
 * τον αριθμό"
 *
 * Thic class represents a console UI for the game "guess the number"
 */
public class UserInterface {
    private Scanner scanner;
    private GuessTheNumber game = new GuessTheNumber(10);

    /**
     * Constructor of the class.
     *
     * Αρχικοποίηση της κλάσης.
     */
    public UserInterface() {
        // συμπληρώστε τον κώδικα
        scanner = new Scanner(System.in);
    }
    
    /** 
     * Εδώ υλοποιείται όλη η αλληλεπίδραση με τον χρήστη στην γραμμή εντολών
     *
     * This method implements the interaction between the user the console.
     */
    public void start() {
        // Συμπληρώστε τον κώδικα
        while (game.getLives() > 0) {
            System.out.print("give number: ");
            int guess = scanner.nextInt();
            int r = game.userGuess(guess);
            if (r == 0) {
                System.out.println("you found it!");
                break;
            } else if (r == 1) {
                System.out.println("The hidden is bigger");
            } else if (r == -1) {
                System.out.println("The hidden is smaller");
            }
        }
        if (!game.getFound()) {
            System.out.println("You lost. The hidden number was " + game.getHidden());
        }
    }

    /**
     * Εκκίνηση της διεπαφής γραμμής εντολών
     *
     * Starting the console UI.
     * 
     * @param args παράμετροι γραμμής εντολών, the parameters of the console.
     */
    public static void main(String[] args) {
        // Συμπληρώστε τον κώδικα
        UserInterface ui = new UserInterface();
        ui.start();
    }
}
