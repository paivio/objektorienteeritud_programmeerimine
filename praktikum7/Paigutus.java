package oop;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Paigutus extends Application {

    public void start(Stage peaLava) {

        /*BorderPane piiriPaan = new BorderPane();
        PasswordField salasõnaVäli = new PasswordField();
        Slider liugur = new Slider(0, 4, 0.5);
        Label silt = new Label("Silt");
        piiriPaan.setCenter(salasõnaVäli); // ülaserva
        piiriPaan.setTop(liugur); // keskele
        piiriPaan.setBottom(silt);   // alaserva
        Scene stseen1 = new Scene(piiriPaan, 400, 400, Color.SNOW);
        peaLava.setTitle("Paigutus");
        peaLava.setScene(stseen1);
        peaLava.show();*/

        FlowPane flow = new FlowPane();
        TextField tekst = new TextField("mingi tekst");
        flow.getChildren().add(tekst);
        ListView<String> list = new ListView<String>();
        ObservableList<String> items = FXCollections.observableArrayList (
                "Esimene", "Teine", "Kolmas", "Neljas");
        list.setMaxHeight(100);
        list.setItems(items);
        flow.getChildren().add(list);
        BorderPane border = new BorderPane();
        border.setMinWidth(250);
        Button nupp1 = new Button("1");
        border.setLeft(nupp1);
        Button nupp2 = new Button("2");
        border.setRight(nupp2);
        HBox hbox = new HBox();
        Label silt1 = new Label("silt1");
        Label silt2 = new Label("silt2");
        hbox.getChildren().addAll(silt1, silt2);
        border.setCenter(hbox);
        flow.getChildren().add(border);
        Scene stseen1 = new Scene(flow, 250, 150, Color.SNOW);
        peaLava.setScene(stseen1);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
