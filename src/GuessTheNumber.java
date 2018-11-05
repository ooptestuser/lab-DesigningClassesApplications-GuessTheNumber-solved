import java.util.Random;

/**
 * Η κλάση αυτή υλοποιεί την λογική ενός παιχνιδιού "μάντεψε τον αριθμό".
 * Στο παιχνίδι αυτό, ο υπολογιστής επιλέγει έναν τυχαίο αριθμό μεταξύ του 1 
 * και του 100. Ο χρήστης έχει έναν αριθμό από προσπάθειες για να μαντέψει τον 
 * αριθμό. Σε κάθε μαντεψιά, ο υπολογιστής του απαντάει αν το βρήκε, ή αν ο 
 * κρυμμένος αριθμός είναι μεγαλύτερος ή μικρότερος από αυτόν που δόθηκε. Αν 
 * βρει τον αριθμό ή αν τελειώσουν οι προσπάθειες, το παιχνίδι τελειώνει.
 *
 * This class represents the logic of the game "guess the number". In this game
 * the computer selects a random number between 1 and 100. The user has a number of
 * tries to guess the number. In every try, the computer responds if the number is the correct
 * one or if the number is greater or smaller than the correct one. If the user founds the number
 * or the number of tries is reached the game is over.
 */
public class GuessTheNumber {
    private int hidden;
    private Random r;
    private int lives;
    private boolean found = false;



    /**
     * Αρχικοποιεί τη λογική του παιχνιδιού με έναν
     * αριθμό προσπαθειών.
     *
     * Initializes the logic of the game given a number of tries.
     * 
     * @param lives
     */
    public GuessTheNumber(int lives) {
        // Συμπληρώστε τον κώδικα
        r = new Random();
        hidden = r.nextInt(100)+1;
        this.lives = lives;
    }

    /**
     * Επιστρέφει τον αριθμό των προσπαθειών που απομένουν.
     *
     * Returns the number of tries that remain.
     *
     * @return προπσπάθειες που απομένουν, the remaining number of tries.
     */
    public int getLives() {
        // Συμπληρώστε τον κώδικα
        return lives;
    }
    
    /**
     * Επιστρέφει τον κρυμμένο αριθμό.
     *
     * It returns the hidden number.
     * 
     * @return τον κρυμμένο αριθμό, the hidden number
     */
    public int getHidden() {
        // Συμπληρώστε τον κώδικα
        return hidden;
    }    

    /**
     * Επιστρέφει αληθές αν ο χρήστης έχει βρει
     * τον κρυμμένο αριθμό. 
     *
     * It return true if the user guesses the hidden number.
     *
     * @return 
     */
    public boolean getFound() {
        // Συμπληρώστε τον κώδικα
        return found;
    }

    /**
     * Ο χρήστης δίνει μια μαντεψιά.
     *
     * The user guesses.
     * 
     * @param x η μαντεψιά του χρήστη, the user's guess.
     * @return 0 αν το βρήκε, 1 αν ο κρυμμένος είναι μεγαλύτερος από αυτόν που
     * έδωσε ο χρήστης, -1 αν ο κρυμμένος είνα μικρότερος από αυτόν που έδωσε 
     * ο χρήστης.
     * 0 If the user found the number, 1 if the hidden number is greater than the one given,
     * -1  if the hidden number is smaller than the one given.
     */
    public int userGuess(int x) {
        // Συμπληρώστε τον κώδικα
        lives--;
        if (x == hidden) {
            found = true;
            return 0;
        } else if (x < hidden) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
