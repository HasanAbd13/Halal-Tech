package wastefoodHALAL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;



public class DaftarController { 

    private Main main;
    
    
    @FXML
    private Button menambahButton;

    @FXML
    private Button pesanmakananButton;

    @FXML
    private Button rekomendasiButton;

    @FXML
    private Button daftarButton;

    @FXML
    private Button sateButton;

    @FXML
    private Button baksoButton;

    @FXML
    private Button backButton;

    @FXML
    private Button logoutButton;
    
    @FXML
    private Button pesanButton1;

     @FXML
    private Button pesanButton2;

     @FXML
    private Button pesanButton3;

     @FXML
    private Button pesanButton4;
    
    
    public void setMainApp(Main main) {
        this.main = main;
    }
    
   @FXML
    private void handlelogoutButton() throws Exception {
        main.showLoginForm();
    }

    @FXML
    private void handlebackButton() throws Exception {
        main.showPesanPage();
    }

    @FXML
    private void handlerekomendasiButton(ActionEvent event) throws Exception {
        main.showPesanPage();
    }

    @FXML
    private void handledaftarButton(ActionEvent event) throws Exception {
        main.showPesanPage();
    }

    @FXML
    private void handlepesanmakananButton(ActionEvent event) throws Exception {
       main.showPesanPage();
    }

     @FXML
    private void handlemenambahButton(ActionEvent event) throws Exception {
       main.showMenambahPage();
    }

    @FXML
    private void handlesateButton(ActionEvent event) throws Exception {
        main.showSatePage();
    }

    @FXML
    private void handlebaksoButton(ActionEvent event) throws Exception {
        main.showBaksoPage();
    }
}

