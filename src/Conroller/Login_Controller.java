package Conroller;

import java.sql.*;
import Database_Connector.DB_Connector;

public class Login_Controller {

    private final DB_Connector ct = new DB_Connector();
    private final Connection dbLink = ct.Connector();
    //for admin
    private String email;
    private String password;

    public Login_Controller(String email, String password) {
        this.email = email;
        this.password = password;
    }
    //for student
    private Long id;
    private String stPass;

    public Login_Controller(Long id, String stPass) {
        this.id = id;
        this.stPass = stPass;
    }

    public boolean login_AS_a() throws SQLException {

        String connQuery = "SELECT * FROM user_admin WHERE email='" + email + "' AND password ='" + password + "'";
        Statement statement = dbLink.createStatement();
        ResultSet rs = statement.executeQuery(connQuery);
        while (rs.next()) {
            System.out.println("WOrking");
            System.out.println(rs.getString("name"));
        }

        return false;

    }

    public boolean login_AS_s() {
        String connQuery = "SELECT * FROM student WHERE id='"+id+"' AND 'password='"+stPass+"'";
    }

}
