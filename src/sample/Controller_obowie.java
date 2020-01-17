package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_obowie implements Initializable {
    @FXML

    public HBox kategoriaobowie;
    public Text nazwa_obowie01,nazwa_obowie02,nazwa_obowie03;
    public Text opis_obowie01,opis_obowie02,opis_obowie03;

    FXMLLoader loader = new FXMLLoader();
    @FXML
    ListView<String> listakoszyk = new ListView<String>(); //wygląd listy

    ObservableList<String> items = FXCollections.observableArrayList();     //przedmioty w liście

    @FXML
    public Label gowno;//TODO : destroy this
    //   public ObservableList<String> listakoszyk  =FXCollections.observableArrayList();
    @FXML
    private String dodaj;

    public void init(ObservableList<String> chuj) {
        System.out.println(chuj);
        chuj.add("aa");
        listakoszyk.setItems(chuj);
    }

    public void initData(String chuj) {
        System.out.println(chuj);
        gowno.setText(chuj);
    }

    public void kategoria_bron(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("bron.fxml"));
        Parent tableViewParent = loader.load();

        Scene tableViewScene = new Scene(tableViewParent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        Controller controller = loader.getController();
        controller.init(items);

        window.setScene(tableViewScene);
        window.show();
    }
    public void kategoria_ubior(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ubior.fxml"));
        Parent ubior_Parent = loader.load();

        Scene scena_ubior = new Scene(ubior_Parent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        Controller_ubior controller = loader.getController();
        controller.init(items);

        window.setScene(scena_ubior);
        window.show();
    }
    public void kategoria_obowie(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("obowie.fxml"));
        Parent obowie_Parent = loader.load();

        Scene scena_obowie = new Scene(obowie_Parent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        Controller_obowie controller = loader.getController();
        controller.init(items);

        window.setScene(scena_obowie);
        window.show();
    }

    public void kategoria_koszyk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("koooszyk.fxml"));
        Parent koszyk_Parent = loader.load();

        Scene scena_koszyk = new Scene(koszyk_Parent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        Controller_koszyk controller = loader.getController();
        controller.init(items);

        window.setScene(scena_koszyk);
        window.show();
    }

     class obowie{
        String nazwa;
        String opis;


         public obowie(String nazwa,String opis) {
             this.nazwa = nazwa;
             this.opis = opis;
         }
     }
    obowie obowie1=new obowie("Buty Tabi"," długiiiii oppissssssssssssssssssssssssssssssssssssssssssss");
    obowie obowie2=new obowie("Klapki Japońskie tradycyjne"," W nocy staniesz się niewidzialny !!!!");
    obowie obowie3=new obowie("Klapki kubota"," W nocy staniesz się niewidzialny !!!!");


    public void dodaj_obowie01(){
        dodaj = obowie1.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_obowie02(){
        dodaj = obowie2.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_obowie03(){
        dodaj = obowie3.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listakoszyk.setItems(items);
        nazwa_obowie01.setText(obowie1.nazwa);
        opis_obowie01.setText(obowie1.opis);
        nazwa_obowie02.setText(obowie2.nazwa);
        opis_obowie02.setText(obowie2.opis);
        nazwa_obowie03.setText(obowie3.nazwa);
        opis_obowie03.setText(obowie3.opis);
    }

}
