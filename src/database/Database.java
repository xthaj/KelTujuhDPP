package database;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import keltujuhdpp.entity.*;

/**
 *
 * @author atha <222111930>
 */
public class Database {
    public static Database instance;
    
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "pbo";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
    
    
    private Database() {
    }
    
    public Connection getConnection() throws SQLException { 
        return DriverManager.getConnection("jdbc:" + DB_TYPE + "://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME,DB_USER,DB_PASS); 
    }
    
    public static synchronized Database getInstance() {
        if(instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public Map<String, Boolean> login(User user) throws SQLException {
        Connection conn = getConnection();
        try {
            // Prepare and execute the query
            String query = "SELECT * FROM user WHERE nik = ? AND pw = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, user.getNik());
            statement.setString(2, user.getPw());
            ResultSet resultSet = statement.executeQuery();

            // Check if a matching record is found
            boolean isLoggedIn = resultSet.next();
            boolean isAdmin = false;

            if (isLoggedIn) {
                isAdmin = resultSet.getBoolean("is_admin");
            }

            // Close the result set, statement, and connection
            resultSet.close();
            statement.close();
            conn.close();

            // Create and populate the result map
            Map<String, Boolean> result = new HashMap<>();
            result.put("isLoggedIn", isLoggedIn);
            result.put("isAdmin", isAdmin);

            return result;

        } catch (SQLException ex) {
            throw ex;
        }
    }

    
}
