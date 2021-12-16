module com.example.pr11 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.mirea.gibo01.pr11 to javafx.fxml;
    exports ru.mirea.gibo01.pr11;
}