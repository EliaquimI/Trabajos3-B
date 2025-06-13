package mx.edu.utez.apuntesjava;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
//apuntes java
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label label = new Label("Label 1");
        Label lbname = new Label("Nombre");
        TextField tfNombre = new TextField();
        tfNombre.setMaxWidth(200);
        Label lbapellido = new Label("Apellido");
        TextField tfApellido = new TextField();
        tfApellido.setMaxWidth(200);

        Label lbage = new Label("Edad: ");
        TextField tfage = new TextField();
        tfage.setMaxWidth(200);

        Label lbRol = new Label("Rol: ");
        ObservableList<String> rol = FXCollections.observableArrayList("Estudiante","Profesor", "Admin");
        ComboBox<String> cbRol = new ComboBox(rol);

        Button button = new Button("Button Aceptado");
        Button button2 = new Button("Button Cancelado");

        button.setOnAction(e -> {
            label.setText("Aceptad");
        });

        button2.setOnAction(e -> {

            label.setText("Cancelado!");
        });

        VBox vbox = new VBox(5,lbname,tfNombre,lbapellido,tfApellido,lbage,tfage,lbRol,cbRol, button, button2);
        vbox.setAlignment(Pos.BASELINE_LEFT);
        Scene scene = new Scene(vbox, 500, 540);

        stage.setTitle("Hello!");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}