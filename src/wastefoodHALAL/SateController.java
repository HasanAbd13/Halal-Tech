package wastefoodHALAL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class SateController { 

    private Main main;
    
    
    @FXML
    private Button menambahButton;

    @FXML
    private Button pesanmakananButton;

    @FXML
    private Button backButton;

    @FXML
    private Button pesanButton1;

     @FXML
    private Button pesanButton2;

     @FXML
    private Button pesanButton3;

    
   
    
    public void setMainApp(Main main) {
        this.main = main;
    }

    @FXML
    private void handlelogoutButton() throws Exception {
        main.showLoginForm();
    }

    @FXML
    private void handlebackButton() throws Exception {
        main.showDaftarPage();
    }

     @FXML
    private void handlepesanmakananButton(ActionEvent event) throws Exception {
       main.showPesanPage();
    }

    @FXML
    private void handlepesanButton(ActionEvent event) throws Exception {
        main.showTransaksiPage();
    }
    
    @FXML
    private void handlemenambahButton(ActionEvent event) throws Exception {
       main.showMenambahPage();
    }

   

   

    


}

