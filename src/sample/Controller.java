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
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    public Text nazwa_bron01,nazwa_bron02,nazwa_bron03,nazwa_bron04,nazwa_bron05,nazwa_bron06,nazwa_bron07,nazwa_bron08,nazwa_bron09;
    public Text opis_bron01,opis_bron02,opis_bron03,opis_bron04,opis_bron05,opis_bron06,opis_bron07,opis_bron08,opis_bron09;
    public ImageView image_bron01;
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

//    public void kategoria_bron(ActionEvent event) throws IOException {
//        FXMLLoader loader = new FXMLLoader();
//        loader.setLocation(getClass().getResource("bron.fxml"));
//        Parent tableViewParent = loader.load();
//
//        Scene tableViewScene = new Scene(tableViewParent);
//
//        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
//
//        //access the controller and call a method
//        Controller controller = loader.getController();
//        controller.init(items);
//
//        window.setScene(tableViewScene);
//        window.show();
//    }
    public void kategoria_obowie(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("obowie.fxml"));
        Parent obowie_Parent = loader.load();

        Scene scena_obowie = new Scene(obowie_Parent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        Controller_obowie controller = loader.getController();
        controller.init(items);

        window.setScene(scena_obowie);
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

     class bron{
        String nazwa;
        String opis;


         public bron(String nazwa,String opis) {
             this.nazwa = nazwa;
             this.opis = opis;
         }
     }
    bron bron1=new bron("Miecz samurajski Katana"," długiiiii oppissssssssssssssssssssssssssssssssssssssssssss");
    bron bron2=new bron("Kamy"," Broń na bliski dystans");
    bron bron3=new bron("Noże Kunai"," Broń na bliski dystans");
    bron bron4=new bron("Shuriken"," Broń na bliski dystans");
    bron bron5=new bron("Nóż Tanto"," Broń na bliski dystans");
    bron bron6=new bron("Kij BO"," Broń na bliski dystans");
    bron bron7=new bron("Nunchaku"," Broń na bliski dystans");
    bron bron8=new bron("Sztylety Sai"," Broń na bliski dystans");
    bron bron9=new bron("Włócznia Yari"," Broń na bliski dystans");


    public void dodaj_bron01(){
        dodaj = bron1.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
//        System.out.printf(listakoszyk.getItems().toString());
    }
    public void dodaj_bron02(){
        dodaj = bron2.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_bron03(){
        dodaj = bron3.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_bron04(){
        dodaj = bron4.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_bron05(){
        dodaj = bron5.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_bron06(){
        dodaj = bron6.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_bron07(){
        dodaj = bron7.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_bron08(){
        dodaj = bron8.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }
    public void dodaj_bron09(){
        dodaj = bron9.nazwa;
        items.add(dodaj);
        listakoszyk.setItems(items);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listakoszyk.setItems(items);
        nazwa_bron01.setText(bron1.nazwa);
        opis_bron01.setText(bron1.opis);
        nazwa_bron02.setText(bron2.nazwa);
        opis_bron02.setText(bron2.opis);
        nazwa_bron03.setText(bron3.nazwa);
        opis_bron03.setText(bron3.opis);
        nazwa_bron04.setText(bron4.nazwa);
        opis_bron04.setText(bron4.opis);
        nazwa_bron05.setText(bron5.nazwa);
        opis_bron05.setText(bron5.opis);
        nazwa_bron06.setText(bron6.nazwa);
        opis_bron06.setText(bron6.opis);
        nazwa_bron07.setText(bron7.nazwa);
        opis_bron07.setText(bron7.opis);
        nazwa_bron08.setText(bron8.nazwa);
        opis_bron08.setText(bron8.opis);
        nazwa_bron09.setText(bron9.nazwa);
        opis_bron09.setText(bron9.opis);
    }
}
