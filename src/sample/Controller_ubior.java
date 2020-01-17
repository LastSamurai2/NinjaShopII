package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_ubior implements Initializable {
    @FXML

    public HBox kategoriabron;
    public HBox kategoriaubior;
    public HBox kategoriaobowie;
    public HBox kategoriawszystko;
    public Text nazwa_ubior01,nazwa_ubior02,nazwa_ubior03,nazwa_ubior04;
    public Text opis_ubior01,opis_ubior02,opis_ubior03,opis_ubior04;

    FXMLLoader loader = new FXMLLoader();
    @FXML
    ListView<String> listakoszyk = new ListView<String>(); //wygląd listy

    ObservableList<String> items = FXCollections.observableArrayList();     //przedmioty w liście

    @FXML
    public Label gowno;//TODO : destroy this
    //   public ObservableList<String> listakoszyk  =FXCollections.observableArrayList();
    @FXML
    private String dodaj;

    public void test() {
        System.out.println("działa");
    }

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

        //access the controller and call a method
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

        //access the controller and call a method
        Controller_ubior controller = loader.getController();
        controller.init(items);

        window.setScene(scena_ubior);
        window.show();
    }

    public void kategoria_koszyk(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("koooszyk.fxml"));
        Parent koszyk_Parent = loader.load();

        Scene scena_koszyk = new Scene(koszyk_Parent);

        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        //access the controller and call a method
        Controller_koszyk controller = loader.getController();
        controller.init(items);

        window.setScene(scena_koszyk);
        window.show();
    }

     class ubior{
        String nazwa;
        String opis;


         public ubior(String nazwa,String opis) {
             this.nazwa = nazwa;
             this.opis = opis;
         }
     }
    ubior ubior1=new ubior("Strój Ninja ozdobny"," długiiiii oppissssssssssssssssssssssssssssssssssssssssssss");
    ubior ubior2=new ubior("Stroj Ninja klasyczny"," W nocy staniesz się niewidzialny !!!!");
    ubior ubior3=new ubior("Spodnie Hakama"," W nocy staniesz się niewidzialny !!!!");
    ubior ubior4=new ubior("Skarpetki Nija"," W nocy staniesz się niewidzialny !!!!");

    public void dodaj_ubior01(){
        dodaj = ubior1.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
//        System.out.printf(listakoszyk.getItems().toString());
    }
    public void dodaj_ubior02(){
        dodaj = ubior2.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_ubior03(){
        dodaj = ubior3.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_ubior04(){
        dodaj = ubior4.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
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



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listakoszyk.setItems(items);
        nazwa_ubior01.setText(ubior1.nazwa);
        opis_ubior01.setText(ubior1.opis);
        nazwa_ubior02.setText(ubior2.nazwa);
        opis_ubior02.setText(ubior2.opis);
        nazwa_ubior03.setText(ubior3.nazwa);
        opis_ubior03.setText(ubior3.opis);
        nazwa_ubior04.setText(ubior4.nazwa);
        opis_ubior04.setText(ubior4.opis);

    }



}
