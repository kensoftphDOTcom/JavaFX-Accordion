module com.kensoftph.accordion {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.accordion to javafx.fxml;
    exports com.kensoftph.accordion;
}