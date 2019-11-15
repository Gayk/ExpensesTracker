import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.h2.tools.Server;
/**
 * Created by monik on 15.11.2019.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName( "org.h2.Driver" );
            Connection connection= DriverManager.getConnection( "jdbc:h2:mem:testdb","test","test" );
            Statement statement = connection.createStatement();
            if( statement.execute( "CREATE table person(name varchar(20))" )) {
                System.out.println( "Table create successfully..." );
            }
            Server.startWebServer( connection );
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
