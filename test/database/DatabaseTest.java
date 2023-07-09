package database;

import java.util.HashMap;
import java.util.Map;
import keltujuhdpp.entity.User;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author atha <222111930>
 */
public class DatabaseTest {
    
    public DatabaseTest() {
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
     * Test of login method, of class Database.
     */
    @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        User user = new User("123", "123", true);
        Database instance = Database.getInstance(); 
        Map<String, Boolean> expResult = new HashMap<>();
        expResult.put("isLoggedIn", true);
        expResult.put("isAdmin", false);
        
        Map<String, Boolean> result = instance.login(user);
        
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSignUp() throws Exception {
        System.out.println("signUp");

        // Create a test user
        User user = new User("12345", "John Doe", "password", "johndoe@example.com", false);

        // Get the instance of the Database class
        Database instance = Database.getInstance();

        // Call the signUp method
        int statusCode = instance.signUp(user);

        // Perform assertions based on the returned status code
        switch (statusCode) {
            case 0:
                fail("Sign-up failed");
                break;
            case 1:
                fail("Nik already exists");
                break;
            case 2:
                System.out.println("Sign-up successful");
                break;
        }
}

    
    
    
}
