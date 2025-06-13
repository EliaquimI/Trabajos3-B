package mx.edu.utez.apuntesjava;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
//apuntes java
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label label = new Label("Label 1");
        Label label2 = new Label("Labe2");
        Button button = new Button("Button Aceptado");
        Button button2 = new Button("Button Cancelado");

        button.setOnAction(e -> {
            label.setText("Aceptad");
        });

        button2.setOnAction(e -> {

            label.setText("Cancelado!");
        });

        VBox vbox = new VBox(20,label, label2, button, button2);
        vbox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vbox, 500, 240);

        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}