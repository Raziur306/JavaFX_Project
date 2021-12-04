package Database_Connector;

import java.sql.*;

public class DB_Connector {

    private String url = "jdbc:mysql://localhost:3306/ums_db";
    private String userName = "root";
    Connection dbLink = null;

    public Connection Connector() {
        try {
            dbLink = DriverManager.getConnection(url, userName, "");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return dbLink;
    }

}
