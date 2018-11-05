import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Grigorios Tsoumakas
 */
public class GuessTheNumberTest {
    
    public GuessTheNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLives method, of class GuessTheNumber.
     */
    @Test
    public void testGetLives() {
        System.out.println("getLives");
        GuessTheNumber instance = new GuessTheNumber(10);        
        int expResult = 10;
        int result = instance.getLives();
        assertEquals(expResult, result);
        int hidden = instance.getHidden();
        if (hidden <100) {
            hidden++;
        } else {
            hidden--;
        }
        instance.userGuess(hidden); 
        result = instance.getLives();
        assertEquals(9, result);
    }

    /**
     * Test of getHidden method, of class GuessTheNumber.
     */
    @Test
    public void testGetHidden() {
        System.out.println("getHidden");
        GuessTheNumber instance = new GuessTheNumber(3);
        int expResult = 0;
        int result = instance.getHidden();
        assertTrue((result >= 1 && result <= 100));
    }

    /**
     * Test of getFound method, of class GuessTheNumber.
     */
    @Test
    public void testGetFound() {
        System.out.println("getFound");
        GuessTheNumber instance = new GuessTheNumber(4);
        boolean expResult = false;
        instance.userGuess(-10);
        boolean result = instance.getFound();
        assertEquals(expResult, result);
        expResult = true;
        instance.userGuess(instance.getHidden());
        result = instance.getFound();
        assertEquals(expResult, result);
    }

    /**
     * Test of userGuess method, of class GuessTheNumber.
     */
    @Test
    public void testUserGuess() {
        System.out.println("userGuess");
        int x = 0;
        GuessTheNumber instance = new GuessTheNumber(5);
        if (instance.getHidden() > 1) {
            int result = instance.userGuess(1);
            int expResult = 1;
            assertEquals(expResult, result);
        }
        if (instance.getHidden() < 100) {
            int result = instance.userGuess(100);
            int expResult = -1;
            assertEquals(expResult, result);
        }
        int expResult = 0;
        int result = instance.userGuess(instance.getHidden());
        assertEquals(expResult, result);        
    }
    
}
