module com.mastermindjava.helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mastermindjava.helloworldfx to javafx.fxml;
    exports com.mastermindjava.helloworldfx;
}