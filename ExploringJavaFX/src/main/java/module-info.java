module grouppackage.exploringjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens grouppackage.exploringjavafx to javafx.fxml;
    exports grouppackage.exploringjavafx;
}