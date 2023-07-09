package wastefoodHALAL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;
    public Object showHomePage;
    public Object showLoginForm;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        showLoginForm();
    }
    
    public void showLoginForm() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginRevisi.fxml"));
        BorderPane root = loader.load();
        LoginController loginController = loader.getController();
        loginController.setMainApp(this);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login Form");
        primaryStage.show();
    }

    public void showSignInForm() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("SignIn.fxml"));
        BorderPane root = loader.load();
        SignInController signInController = loader.getController();
        signInController.setMainApp(this);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Signup Form");
        primaryStage.show();
    }
    
    public void showHomePage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenuUtamaa.fxml"));
        AnchorPane root = loader.load();
        HalamanUtama homeController = loader.getController();
        homeController.setMainApp(this);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Home Page");
        primaryStage.show();
    }

    public void showPesanPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("HalUtama.fxml"));
        AnchorPane root = loader.load();
        HalUtamaController homeController = loader.getController();
        homeController.setMainApp(this);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pesan Page");
        primaryStage.show();
    }

    public void showMenambahPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MenambahPage.fxml"));
        AnchorPane root = loader.load();
        MenambahController homeController = loader.getController();
        homeController.setMainApp(this);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Menambah Page");
        primaryStage.show();
    }
    
    public void showDaftarPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("DaftarResto.fxml"));
        AnchorPane root = loader.load();
        DaftarController homeController = loader.getController();
        homeController.setMainApp(this);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Daftar Page");
        primaryStage.show();
    }

    public void showBaksoPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Bakso.fxml"));
        AnchorPane root = loader.load();
        BaksoController homeController = loader.getController();
        homeController.setMainApp(this);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bakso Page");
        primaryStage.show();
    }

     public void showSatePage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sate.fxml"));
        AnchorPane root = loader.load();
        SateController homeController = loader.getController();
        homeController.setMainApp(this);
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Sate Page");
        primaryStage.show();
    }

    public void showTransaksiPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Transaksi.fxml"));
        AnchorPane root = loader.load();
        TransaksiController homeController = loader.getController();
        homeController.setMainApp(this);
        
        Scene scene = new Scene(root, 1533, 900);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Transaksi Page");
        primaryStage.show();
    }

    

    
    public static void main(String[] args) {
        launch(args);
    }
}
