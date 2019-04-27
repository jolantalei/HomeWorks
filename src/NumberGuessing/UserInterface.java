package NumberGuessing;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class UserInterface extends Application {

    private Stage window;
    TextField userGuess = new TextField();




    public static void main (String[]args){
            launch(args);
        }

        public void start (Stage primaryStage) throws Exception {
            window = primaryStage;


            Text message = new Text("please enter number");
            Button confirmButton = new Button("confirm");

            VBox vBox = new VBox();
            vBox.getChildren().addAll(message, userGuess, confirmButton);


            Scene scene = new Scene(vBox, 640, 480);
            window.setScene(scene);
            window.show();

            confirmButton.setOnAction(event ->numberGuessing() );

        }

    private void numberGuessing() {

        int userNumber = Integer.parseInt(userGuess.getText());

        double myNumber = Math.random();
        double myNumberInRange = myNumber * 100;
        int roundedNumber = (int) myNumberInRange;// int roundedNumber = (MAth.random() *100) šadi var vienā līnijā

        if (userNumber > roundedNumber) {
            System.out.println("Your guess is to high");
            userGuess.setPromptText("Your guess is to high");
            userGuess.setText("");

        } else if (userNumber == roundedNumber) {
            System.out.println("You guested");
            userGuess.setPromptText("You guested");
            userGuess.setText("");
        } else {
            System.out.println("Your guess is to low");
            userGuess.setPromptText("Your guess is to low");
            userGuess.setText("");
        }
    }
    }