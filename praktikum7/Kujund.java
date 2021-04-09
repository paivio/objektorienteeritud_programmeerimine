package oop;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Kujund extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {

        Group juur = new Group(); // luuakse juur
        Canvas lõuend = new Canvas(500, 500); // luuakse lõuend
        GraphicsContext gc = lõuend.getGraphicsContext2D(); // graafiline sisu
        Rectangle ristkülik = new Rectangle();
        ristkülik.setX(75);
        ristkülik.setY(75);
        ristkülik.setWidth(130);
        ristkülik.setHeight(150);
        ristkülik.setArcHeight(20);
        ristkülik.setArcWidth(20);
        ristkülik.setFill(Color.HOTPINK);
        juur.getChildren().add(ristkülik);

        Text tekst = new Text();
        tekst.setText("Päivi");
        tekst.setFill(Color.TURQUOISE);
        tekst.setFont(Font.font("null", FontWeight.BOLD, 40));
        tekst.setX(300);
        tekst.setY(350);
        juur.getChildren().add(tekst);
        juur.getChildren().add(lõuend);  // lõuend lisatakse juure alluvaks

        Path path = new Path();
        path.getElements().add(new MoveTo(400,100));
        path.getElements().add(new LineTo(100, 350));
        PathTransition pathTransition = new PathTransition();
        pathTransition.setPath(path);
        pathTransition.setDuration(Duration.millis(1500));
        pathTransition.setNode(ristkülik);
        pathTransition.setCycleCount(4);
        pathTransition.setAutoReverse(true);
        RotateTransition rotate = new RotateTransition(Duration.millis(3000), ristkülik);
        rotate.setByAngle(360);
        rotate.setCycleCount(4);
        rotate.setAutoReverse(true);

       ParallelTransition p = new ParallelTransition();
        p.getChildren().add(pathTransition);
        p.getChildren().add(rotate);
        p.play();

        /*SequentialTransition s = new SequentialTransition();
        s.getChildren().add(pathTransition);
        s.getChildren().add(rotate);
        s.play();*/

        Scene stseen1 = new Scene(juur);  // luuakse stseen
        peaLava.setTitle("Kujundid");  // lava tiitelribale pannakse tekst
        peaLava.setScene(stseen1);  // lavale lisatakse stseen
        peaLava.show();  // lava tehakse nähtavaks
    }

    public static void main(String[] args) {
        launch(args);
    }
}
