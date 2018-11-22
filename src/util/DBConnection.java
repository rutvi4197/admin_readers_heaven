package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

    private DBConnection() 
            throws ClassNotFoundException, SQLException {
    	System.out.println("database ma class pela");
        Class.forName(DBConfigSql.DB_DRIVER); 
        System.out.println("database ma class pa6i");
        con = DriverManager.getConnection(
                DBConfigSql.DB_URL, 
                DBConfigSql.DB_USER, 
                DBConfigSql.DB_PWD );
       
        
    }
      
    public static DBConnection getInstance() 
            throws ClassNotFoundException, SQLException {
        if (instance == null )
            instance = new DBConnection();
       
        return instance;
    }
    
    public Connection getConnection() throws SQLException{
        return con;
    }

    public Connection getConnectionSchema(String schema) throws SQLException{
   
        Statement st = con.createStatement();
        st.execute("set search_path to " + schema + ";");
        return con;
    }

    public void close() throws SQLException{
        con.close();
        instance = null;
    }

    private final Connection con;
    private static DBConnection instance = null;
    
}