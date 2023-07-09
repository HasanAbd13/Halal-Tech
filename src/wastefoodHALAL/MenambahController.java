package wastefoodHALAL;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class MenambahController implements Initializable {
    private ObservableList<Makanan> makananList = FXCollections.observableArrayList();
    private ArrayMakan Makanan = new ArrayMakan();

    private Main main;

    @FXML
    private Button menambahButton;

    @FXML
    private Button pesanmakananButton;

    @FXML
    private Button backButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button submitButton;

    @FXML
    private TextField noField;

    @FXML
    private TextField restoField;

    @FXML
    private TextField makananField;

    @FXML
    private TextField stockField;

    @FXML
    private Button clearButton;

    @FXML
    private TableColumn<Makanan, Integer> noColumn;

    @FXML
    private TableColumn<Makanan, String> restoColumn;

    @FXML
    private TableColumn<Makanan, String> makananColumn;

    @FXML
    private TableColumn<Makanan, Integer> stockColumn;

    @FXML
    private TableView<Makanan> daftarTableView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tampilkanMakanan();
        noColumn.setCellValueFactory(new PropertyValueFactory<Makanan, Integer>("No"));
        restoColumn.setCellValueFactory(new PropertyValueFactory<Makanan, String>("Nama Resto"));
        makananColumn.setCellValueFactory(new PropertyValueFactory<Makanan, String >("Nama Makanan"));
        stockColumn.setCellValueFactory(new PropertyValueFactory<Makanan, Integer>("Stock"));
        daftarTableView.setItems(makananList);
    }

    @FXML
    public void submitButton(ActionEvent event) {
        int no = Integer.parseInt(noField.getText());
        String resto = restoField.getText();
        String makanan = makananField.getText();
        int stock = Integer.parseInt(stockField.getText());
        Makanan.addStockMakanan(no, resto, makanan, stock);
        Makanan newMakanan = new Makanan(no, resto, makanan, stock);
        makananList.add(newMakanan);
        ArrayMakan.simpan(Makanan.getStockMakananList());
        noField.clear();
        restoField.clear();
        makananField.clear();
        stockField.clear();
    }

    @FXML
    public void clearButton(ActionEvent event) {
        Makanan selectedMakanan = daftarTableView.getSelectionModel().getSelectedItem();
        if (selectedMakanan != null) {
            makananList.remove(selectedMakanan);
        }
    }

    public void tampilkanMakanan() {
        for (int i = 0; i < Makanan.getStockMakananList().size(); i++) {
            makananList.add(Makanan.getStock(i));
        }
    }

    public void setMainApp(Main main) {
        this.main = main;
    }

    @FXML
    private void handlelogoutButton() throws Exception {
        main.showLoginForm();
    }

    @FXML
    private void handlebackButton() throws Exception {
        main.showHomePage();
    }

    @FXML
    private void handlepesanmakananButton() throws Exception {
        main.showPesanPage();
    }

    @FXML
    private void handlemenambahButton() throws Exception {
        main.showHomePage();
    }
}
