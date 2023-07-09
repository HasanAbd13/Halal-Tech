package wastefoodHALAL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    private Main main;

    @FXML
    private Label notifLabel;
    
    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Button signinButton;
    
    public void setMainApp(Main main) {
        this.main = main;
    }
    
    @FXML
    private void login() {
    }

    @FXML
    private void handleloginButton(ActionEvent event)throws Exception{
        String username = usernameField.getText();
        String password = passwordField.getText();
        
        if (username.equals("halal") && password.equals("tech")) {
            System.out.println("Login successful!");
            main.showHomePage();
        } else {
            notifLabel.setText("Invalid username or password !!!");
            System.out.println("Invalid username or password");  
        }
        
    }

    @FXML
    private void handlesigninbutton(ActionEvent event)throws Exception {
        main.showSignInForm();
    }

}
