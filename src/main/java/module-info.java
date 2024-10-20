module dev.ikm.layout {

    requires dev.ikm.komet.framework;

    opens dev.ikm.layout to javafx.fxml;
    exports dev.ikm.layout;
    exports dev.ikm.layout.app;
    opens dev.ikm.layout.app to javafx.fxml;
}