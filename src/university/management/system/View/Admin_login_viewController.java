package university.management.system.View;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import Conroller.Login_Controller;
import java.sql.SQLException;

public class Admin_login_viewController implements Initializable {

    @FXML
    private TextField admin_input_email;
    @FXML
    private PasswordField admin_input_pass;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void adminLoginClick(ActionEvent event) throws SQLException {
        String email = admin_input_email.getText().trim();
        String password = admin_input_pass.getText();
        ObservableList<String> erroClass = null;

        //alert
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Input fields empty");
        alert.setContentText("Please fill all Input Filed");
        if (email.isEmpty()) {
            erroClass = admin_input_email.getStyleClass();
            erroClass.add("tfError");
            alert.show();
        }
        if (password.isEmpty()) {
            erroClass = admin_input_pass.getStyleClass();
            erroClass.add("tfError");
            alert.show();
        }
        if (!email.isEmpty() && !password.isEmpty()) {
            Login_Controller log = new Login_Controller(email, password);
            boolean b = log.login_AS_a();
            System.out.println(b);
        }

    }

}
