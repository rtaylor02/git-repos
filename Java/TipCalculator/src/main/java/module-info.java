module com.mastermindjava.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mastermindjava.tipcalculator to javafx.fxml;
    exports com.mastermindjava.tipcalculator;
}