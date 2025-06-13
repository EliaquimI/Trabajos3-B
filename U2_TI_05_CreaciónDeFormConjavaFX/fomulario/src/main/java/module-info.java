module mx.edu.utez.fomulario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.fomulario to javafx.fxml;
    exports mx.edu.utez.demo3b.src;
    opens mx.edu.utez.demo3b.src to javafx.fxml;
    exports mx.edu.utez.apuntesjava;
    opens mx.edu.utez.apuntesjava to javafx.fxml;
}