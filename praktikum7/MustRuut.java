package oop;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.control.Button;
import javafx.scene.effect.Bloom;
import javafx.scene.effect.DropShadow;
import javafx.scene.shape.Rectangle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MustRuut extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {
        Group juur = new Group(); // luuakse juur
        Rectangle ristkulik1 = new Rectangle(50, 50, 435, 435);
        juur.getChildren().add(ristkulik1);  // ristkülik lisatakse juure alluvaks
        Button nupp1 = new Button("Olen nõus"); // luuakse nupp
        Button nupp2 = new Button("Olen teine nupp");
        nupp1.setLayoutX(100); // nupu paigutamine x-koordinaadi mõttes
        nupp1.setLayoutY(60); // nupu paigutamine y-koordinaadi mõttes
        nupp2.setLayoutX(200.0);
        nupp2.setLayoutY(60);
        juur.getChildren().add(nupp1); // nupp lisatakse juure alluvaks
        juur.getChildren().add(nupp2);
        DropShadow vari = new DropShadow(20, Color.GREEN);
        vari.setOffsetX(20);
        nupp1.setEffect(vari);
        Bloom bloom = new Bloom();
        bloom.setThreshold(0.7);
        nupp2.setEffect(bloom);

        FadeTransition ft = new FadeTransition(Duration.millis(10000), juur);  // luuakse uus haihtumine
        ft.setFromValue(1.0);  // määratakse algväärtus (1.0 - täiesti selge)
        ft.setToValue(0.0); // määratakse lõppväärtus (0 - täiesti haihtunud)
        ft.setCycleCount(Timeline.INDEFINITE); // lõpmatu tsüklite arv
        ft.setAutoReverse(true); // lõppu jõudes tagasi, algusest jälle edasi
        ft.play(); // animatsioon mängima

        Scene stseen1 = new Scene(juur, 535, 535, Color.SNOW);  // luuakse stseen
        peaLava.setTitle("Must ruut");  // lava tiitelribale pannakse tekst
        peaLava.setScene(stseen1);
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
