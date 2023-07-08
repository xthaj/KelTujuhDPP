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
        User user = new User("12345", "123", false);
        Database instance = Database.getInstance(); 
        Map<String, Boolean> expResult = new HashMap<>();
        expResult.put("isLoggedIn", false);
        expResult.put("isAdmin", false);
        
        Map<String, Boolean> result = instance.login(user);
        
        
        assertEquals(expResult, result);
    }
    
}
