package wastefoodHALAL;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class SignInController {
    private Main main;

    @FXML
    private Label notifSignUp;
    
    @FXML
    private TextField usernameField;
    
    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField alamatField;

    @FXML
    private Button SignInButton;

    @FXML
    private Label genderJRadioButton;

    @FXML
    private RadioButton rlakilakiButton;

    @FXML
    private RadioButton rperempuanButton;


    String jenisGender = "";

     @FXML
    void handleButtonRadio(ActionEvent event) {
        if (rlakilakiButton.isSelected()) {
            jenisGender = "Laki-laki";
            genderJRadioButton.setText(jenisGender);
        } else  {
            jenisGender = "Perempuan";
            genderJRadioButton.setText(jenisGender);
        }
    }

    
    
    public void setMainApp(Main main) {
        this.main = main;
    }
    

    @FXML
    private void handleSignInButton(ActionEvent event)throws Exception{
        String username = usernameField.getText();
        String password = passwordField.getText();
        String alamat = alamatField.getText();
        if (username.isEmpty() && password.isEmpty() && alamat.isEmpty()) {
            System.out.println("Sign up failed !!");
            notifSignUp.setText("Please fill in the blank fields !!!");
        } else {
            System.out.println("Invalid username or password");
            main.showLoginForm();
        }
        
    }

}
