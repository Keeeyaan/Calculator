package calculator;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Kean
 */
public class Calculator extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("/fxml/calculator.fxml"));
        Scene scene = new Scene(parent);
        Image image = new Image("/images/calculator.png");

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(image);
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
