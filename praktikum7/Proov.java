package oop;

import javafx.animation.ParallelTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Proov extends Application {


    @Override
    public void start(Stage peaLava) throws Exception {
        FlowPane flow = new FlowPane();
        BorderPane border = new BorderPane();
        flow.getChildren().add(border);
        Scene stseen1 = new Scene(flow);
        peaLava.setScene(stseen1);
        border.setMinSize(200.0, 200.0);
        Button nupp1 = new Button("Olen esimene nupp");
        border.setTop(nupp1);
        Button nupp2 = new Button("Olen teine nupp");
        border.setCenter(nupp2);
        Button nupp3 = new Button("Olen kolmas nupp");
        border.setRight(nupp3);
        Button nupp4 = new Button("Olen neljas nupp");
        border.setBottom(nupp4);
        GridPane grid = new GridPane();
        Label silt1 = new Label("Mina olen silt");
        Label silt2 = new Label("MIna olen ka silt");
        GridPane.setConstraints(silt1, 6, 2);
        GridPane.setConstraints(silt2, 2, 4);
        grid.getChildren().addAll(silt1, silt2);
        flow.getChildren().add(grid);
        RotateTransition rotate1 = new RotateTransition(Duration.millis(1500), nupp2);
        rotate1.setByAngle(360);
        rotate1.setCycleCount(Timeline.INDEFINITE);
        rotate1.setAutoReverse(true);
        RotateTransition rotate2 = new RotateTransition(Duration.millis(1500), nupp3);
        rotate2.setByAngle(360);
        rotate2.setCycleCount(Timeline.INDEFINITE);
        rotate2.setAutoReverse(true);

        ParallelTransition p = new ParallelTransition();
        p.getChildren().add(rotate1);
        p.getChildren().add(rotate2);
        p.play();

        peaLava.setTitle("Ebareaalne skeem");
        peaLava.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
