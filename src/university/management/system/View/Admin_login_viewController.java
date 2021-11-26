/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package university.management.system.View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author raziu
 */
public class Admin_login_viewController implements Initializable {

    @FXML
    private TextField admin_email_input;
    @FXML
    private PasswordField admin_pass_input;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       
    }    

    @FXML
    private void adminLoginBtn(ActionEvent event) {
      String email = admin_email_input.getText().trim();
      String pass = admin_pass_input.getText();
      if(email.isEmpty())
            System.out.println("Please Enter your email");
      if(pass.isEmpty())
            System.out.println("Please enter valid password");
        
        
    }
    
}
