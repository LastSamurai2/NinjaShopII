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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_koszyk implements Initializable {
    FXMLLoader loader = new FXMLLoader();
    @FXML
    ListView<String> listakoszyk = new ListView<String>(); //wygląd listy

    ObservableList<String> items = FXCollections.observableArrayList();     //przedmioty w liście


    public void init(ObservableList<String> chuj) {
        System.out.println(chuj);
//        chuj.add("aa");
        listakoszyk.setItems(chuj);
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
    public void kategoria_bron(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("bron.fxml"));
        Parent bron_Parent;
        bron_Parent = loader.load();

        Scene tableViewScene = new Scene(bron_Parent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        //access the controller and call a method
        Controller controller = loader.getController();
        controller.init(items);

        window.setScene(tableViewScene);
        window.show();
    }
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


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
                listakoszyk.setItems(items);
    }

    public void usun_z_koszyka(){
        listakoszyk.getItems().remove(listakoszyk.getSelectionModel().getSelectedItem());
    }

}

