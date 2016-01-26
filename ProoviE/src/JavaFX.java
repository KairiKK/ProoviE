/**
 * Created by Kairi on 25.01.2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Loo Label, mille sisu saab kasutaja TextFieldi kaudu muuta.
 */
public class JavaFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label = new Label("Sisesta uus tekst");
        TextField textField = new TextField();
        VBox vbox = new VBox();
        vbox.setPrefSize(200, 200);

        vbox.getChildren().addAll(label, textField);

        textField.setOnAction(event -> {
            String newText = textField.getText();
            label.setText(newText);

        });

        Scene scene = new Scene(vbox);  // võib ka Scene scene = new Scene(vbox, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}