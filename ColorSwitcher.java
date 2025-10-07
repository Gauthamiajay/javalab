import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ColorSwitcher extends Application {

    @Override
    public void start(Stage stage) {
        Rectangle rect = new Rectangle(200, 100, Color.RED);

        ToggleButton toggle = new ToggleButton("Switch Color");

        // Model: current color as StringProperty
        StringProperty currentColor = new SimpleStringProperty("RED");
        Label colorLabel = new Label();
        colorLabel.textProperty().bind(currentColor); // bind label to color property

        // Behavior: toggle colors
        toggle.setOnAction(e -> {
            if (rect.getFill().equals(Color.RED)) {
                rect.setFill(Color.BLUE);
                currentColor.set("BLUE");
            } else {
                rect.setFill(Color.RED);
                currentColor.set("RED");
            }
        });

        VBox root = new VBox(10, rect, toggle, colorLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        stage.setScene(new Scene(root));
        stage.setTitle("Color Switcher");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Design Note: Label text is bound to currentColor StringProperty for automatic updates.
