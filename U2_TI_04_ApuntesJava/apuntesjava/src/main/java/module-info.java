module mx.edu.utez.apuntesjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.apuntesjava to javafx.fxml;
    exports mx.edu.utez.apuntesjava;
    exports mx.edu.utez.demo3b.src;
    opens mx.edu.utez.demo3b.src to javafx.fxml;
}