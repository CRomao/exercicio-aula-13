module br.edu.fapce.formulario {
    requires javafx.controls;
    requires javafx.fxml;

    opens br.edu.fapce.formulario to javafx.fxml;
    exports br.edu.fapce.formulario;
    exports br.edu.fapce.model;
}