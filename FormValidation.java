import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class FormValidation extends Application {

    @Override
    public void start(Stage stage) {
        TextField emailField = new TextField();
        emailField.setPromptText("Enter email");

        Button submitButton = new Button("Submit");
        Label statusLabel = new Label();

        submitButton.setOnAction(e -> {
            String email = emailField.getText();
            if(email.contains("@") && email.contains(".")) {
                statusLabel.setText("Valid");
                statusLabel.setTextFill(Color.GREEN);
            } else {
                statusLabel.setText("Invalid");
                statusLabel.setTextFill(Color.RED);
            }
        });

        VBox root = new VBox(10, emailField, submitButton, statusLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Mini Form Validation");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
