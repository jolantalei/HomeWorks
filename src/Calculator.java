import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.awt.*;

public class Calculator extends Application {
    private Stage window;


    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Button buttonEnter = new Button("Enter");
        buttonEnter.setId("button-enter");

        GridPane gridPane = new GridPane();
        Button button = new Button("0");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Button button3 = new Button("3");
        Button button4 = new Button("4");
        Button button5 = new Button("5");
        Button button6 = new Button("6");
        Button button7 = new Button("7");
        Button button8 = new Button("8");
        Button button9 = new Button("9");
        Button buttonDot = new Button(".");
        Button buttonDivided = new Button("/");
        Button buttonMultip = new Button("*");
        Button buttonSubtraction = new Button("-");
        Button buttonAdding = new Button("+");
        Button buttonEQU = new Button("=");
        TextField result = new TextField();

        gridPane.add(button, 0, 3);
        gridPane.add(button1 , 0, 2);
        gridPane.add(button2 , 1, 2);
        gridPane.add(button3 , 2, 2);
        gridPane.add(button4 , 0, 1);
        gridPane.add(button5 , 1, 1);
        gridPane.add(button6 , 2, 1);
        gridPane.add(button7 , 0, 0);
        gridPane.add(button8 , 1, 0);
        gridPane.add(button9 , 2, 0);
        gridPane.add(buttonDivided, 3, 0);
        gridPane.add(buttonMultip, 3, 1);
        gridPane.add(buttonSubtraction, 3, 2);
        gridPane.add(buttonDot, 1, 3);
        gridPane.add(buttonEQU, 2, 3);
        gridPane.add(buttonAdding, 3, 3);
        gridPane.add(buttonEnter,0,3,5,5);
        gridPane.add(result, 0, 4, 5,5);

        Scene scene = new Scene(gridPane, 200, 300);
        scene.getStylesheets().add("CalculatorStyle.css");
        window.setScene(scene);
        window.show();


    }
}