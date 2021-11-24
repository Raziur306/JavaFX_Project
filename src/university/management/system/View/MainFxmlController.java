package university.management.system.View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tab;

public class MainFxmlController implements Initializable {

    @FXML
    private Tab admin_tab;
    @FXML
    private Tab student_tab;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        try {
            Parent root = FXMLLoader.load(getClass().getResource("View/Admin_login_view.fxml"));
            admin_tab.setContent(root);
        } catch (Exception e) {
        }
        try {
              Parent root = FXMLLoader.load(getClass().getResource("View/Student_login_view.fxml"));
              student_tab.setContent(root);
        } catch (Exception e) {
        }
        
    }    
    
}
