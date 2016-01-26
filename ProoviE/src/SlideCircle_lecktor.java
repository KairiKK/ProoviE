import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * @author lecktor
 */
public class SlideCircle_lecktor extends Application {

        int paneWidth = 500;
        int paneHeight = 500;


        @Override
        public void start(Stage primaryStage) throws Exception
        {
            GridPane container = new GridPane();
            container.setStyle("-fx-background-color: #cccccc;");
            container.setPrefWidth(paneHeight + 100);

            GraphicsContext gc = this.addCanvas(container);
            this.addSlider(container, gc);

            Scene scene = new Scene(container, paneWidth + 60, paneHeight+8);

            primaryStage.setScene(scene);
            primaryStage.setOnCloseRequest(event -> System.exit(0));
            primaryStage.show();
        }

    private GraphicsContext addCanvas(GridPane container)
    {
        StackPane holder = new StackPane();
        holder.setStyle("-fx-background-color: cornflowerblue;-fx-border-color: #000000;-fx-border-width: 4px;");

        Canvas canvas = new Canvas(paneWidth, paneHeight);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        holder.getChildren().add(canvas);
        container.add(holder, 0, 0);

        return gc;
    }

    private void addSlider(GridPane container, GraphicsContext gc)
    {
        StackPane holder = new StackPane();
        holder.setStyle("-fx-background-color: ivory;-fx-padding: 5px;");

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(this.paneHeight/2);
        slider.setShowTickMarks(true);
        slider.setShowTickLabels(true);
        slider.setMajorTickUnit(10);
        slider.setBlockIncrement(10);
        slider.setOrientation(Orientation.VERTICAL);

        slider.valueProperty().addListener((arg0, arg1, arg2) -> {
            try {
                drawRing(gc, slider.getValue());
            } catch (Exception ex) {
                ex.printStackTrace();
                throw ex;
            }
        });

        holder.getChildren().add(slider);
        container.add(holder, 1, 0);
    }

    private void drawRing(GraphicsContext gc, double radius)
    {
        gc.clearRect(0, 0, this.paneWidth, this.paneHeight);

        double centerX = paneWidth / 2;
        double centerY = paneHeight / 2;
        int initRadius = (int)radius;

        gc.fillOval(centerX - initRadius, centerY - initRadius, 2 * initRadius, 2 * initRadius);
        gc.setFill(Color.BLACK) ;
    }

    }

