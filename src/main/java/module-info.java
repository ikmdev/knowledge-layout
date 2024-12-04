module dev.ikm.layout {

    requires dev.ikm.komet.framework;

    opens dev.ikm.layout to javafx.fxml;
    exports dev.ikm.layout;
    exports dev.ikm.layout.action;
    exports dev.ikm.layout.component;
    exports dev.ikm.layout.component.version.field;
    exports dev.ikm.layout.component.version;
    exports dev.ikm.layout.container;
    exports dev.ikm.layout.context;
    exports dev.ikm.layout.coordinate;
    exports dev.ikm.layout.event;
    exports dev.ikm.layout.orchestration;
    exports dev.ikm.layout.orchestration.process;
    exports dev.ikm.layout.selection;
    exports dev.ikm.layout.selection.element;

    exports dev.ikm.layout.app;
    opens dev.ikm.layout.app to javafx.fxml;
}