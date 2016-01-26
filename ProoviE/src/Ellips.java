import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Created by Kairi on 25.01.2016.
 */
public class Ellips extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Ellipse ellipse = new Ellipse(250, 250, 100, 100);
        ColorPicker colorPicker = new ColorPicker();

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        pane.getChildren().addAll(ellipse, colorPicker);

       // Color c = new Color();
     colorPicker.setOnAction(event -> {
         ellipse.setFill(colorPicker.getValue());
               });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
