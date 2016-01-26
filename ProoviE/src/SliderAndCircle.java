import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Kairi on 25.01.2016.
 */
public class SliderAndCircle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(250, 150, 20);                   //circle.setRadius(20);
                                                                    // võib ka kohe = new Circle (30)
        circle.setFill(Color.TOMATO);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(500);
        slider.setTranslateY(450);
        slider.setMajorTickUnit(50);
        slider.setShowTickMarks(true);

        Pane pane = new Pane();
        Scene scene = new Scene(pane, 500, 500);

        pane.getChildren().addAll(slider, circle);

        slider.valueProperty().addListener((observable, vanaVaartus, uusVaartus) -> {
            circle.setRadius(uusVaartus.intValue());
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
