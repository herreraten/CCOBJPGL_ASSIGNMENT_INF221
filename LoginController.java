import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;
    
    @FXML
    Label mywarningLabel;

    public void login(ActionEvent event) throws IOException{
        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("tenten") && password.equals("12345")){
        
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    } 
    else {
        mywarningLabel.setVisible(true);


    }

    }
}
