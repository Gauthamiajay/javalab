import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorPickerDemo extends Application {

    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        pane.setPrefSize(300, 200);
        pane.setStyle("-fx-background-color: lightgray;");

        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setLayoutY(220);

        Button resetButton = new Button("Reset");
        resetButton.setLayoutY(260);

        // Listener: colorPicker changes pane background
        colorPicker.setOnAction(e -> {
            Color c = colorPicker.getValue();
            String colorStr = String.format("#%02X%02X%02X",
                    (int)(c.getRed()*255),
                    (int)(c.getGreen()*255),
                    (int)(c.getBlue()*255));
            pane.setStyle("-fx-background-color: " + colorStr + ";");
        });

        resetButton.setOnAction(e -> {
            colorPicker.setValue(Color.LIGHTGRAY);
            pane.setStyle("-fx-background-color: lightgray;");
        });

        Pane root = new Pane(pane, colorPicker, resetButton);
        stage.setScene(new Scene(root, 320, 300));
        stage.setTitle("Color Picker Demo");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

// Note: Pane background updated using listener on ColorPicker, Reset sets default.
