package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {
    static int souls =1;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Label alter = new Label("Java is fun");
        GridPane gridShow = new GridPane();
        gridShow.setAlignment(Pos.CENTER);
        gridShow.add(alter, 0, 0);
        alter.setOnMouseClicked(e -> {
            switch (souls) {
                case 1:
                    alter.setText("Java is powerful");
                    souls--;
                    break;
                case 0:
                    alter.setText("Java is fun");
                    souls++;
                    break;
            }

        });
        Scene scene = new Scene(gridShow,70,70);
        primaryStage.setTitle("Click meh");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
