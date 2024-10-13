module com.aadhesh.bankingapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.commons;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;

    opens com.aadhesh.bankingapplication to javafx.fxml;
    exports com.aadhesh.bankingapplication;
    exports com.aadhesh.bankingapplication.Controllers;
    exports com.aadhesh.bankingapplication.Controllers.Admin;
    exports com.aadhesh.bankingapplication.Controllers.Client;
    exports com.aadhesh.bankingapplication.Models;
    exports com.aadhesh.bankingapplication.Views;
}