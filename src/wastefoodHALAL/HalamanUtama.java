package wastefoodHALAL;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HalamanUtama { 

    private Main main;
    
    
    @FXML
    private Button menambahButton;

    @FXML
    private Button pesanmakananButton;

    @FXML
    private Button backButton;

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
    private void handlebackButton() throws Exception {
        main.showLoginForm();
    }

     @FXML
    private void handlepesanmakananButton() throws Exception {
       main.showPesanPage();
    }
    
    @FXML
    private void handlemenambahButton() throws Exception {
       main.showMenambahPage();
    }

   
}
