package DataLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 The purpose of Connector is to...


 */
public class Connector {

    private static final String URL = "jdbc:mysql://167.99.222.203:3306/FogCase";
    private static final String USERNAME = "test";
    private static final String PASSWORD = "password123!";

    private static Connection singleton;

    public static void setConnection( Connection con ) {
        singleton = con;
    }

    public static Connection connection() throws ClassNotFoundException, SQLException {
        System.out.println("Connecting..... ");
        if ( singleton == null ) {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            singleton = DriverManager.getConnection( URL, USERNAME, PASSWORD );
            System.out.println("Making a connection");
        }
        return singleton;
    }



}
