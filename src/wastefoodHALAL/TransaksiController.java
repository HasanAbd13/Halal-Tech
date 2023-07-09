package wastefoodHALAL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class TransaksiController { 

    private Main main;
    
   
    @FXML
    private Button menuButton;

    @FXML
    private Button logoutButton;

    
   
    
    public void setMainApp(Main main) {
        this.main = main;
    }

    @FXML
    private void handlelogoutButton() throws Exception {
        main.showLoginForm();
    }

    @FXML
    private void handlemenuButton(ActionEvent event) throws Exception {
        main.showPesanPage();
    }

}

