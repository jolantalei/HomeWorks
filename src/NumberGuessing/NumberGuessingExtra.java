package NumberGuessing;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NumberGuessingExtra extends Application {

    private Stage window;
    TextField userGuess = new TextField();
    int counter = 0;
    int numberToGuess = -1;


    public static void main (String[]args){
        launch(args);
    }

    public void start (Stage primaryStage) throws Exception {
        window = primaryStage;

        Text message = new Text("please enter number");
        Button confirmButton = new Button("confirm");
        Button buttonClose = new Button("Close");


        VBox vBox = new VBox();
        vBox.getChildren().addAll(message, userGuess, confirmButton,buttonClose);

        Scene scene = new Scene(vBox, 640, 480);
        window.setScene(scene);
        window.show();

        confirmButton.setOnAction(event ->
                numberGuessing() );

        buttonClose.setOnAction(event ->
                Platform.exit());

//        buttonPlayAgain.setOnAction(event ->
//                );
    }


    private void numberGuessing() {
        int userNumber = Integer.parseInt(userGuess.getText());
        counter = 0;

        double myNumber = Math.random();
        double myNumberInRange = myNumber * 10;
        int roundedNumber = (int) myNumberInRange;// int roundedNumber = (MAth.random() *100) šadi var vienā līnijā

        if (counter==2){
            System.out.println("Game over");
            userGuess.setPromptText("Game over");
            userGuess.setText("");
        }else {

            if (userNumber > roundedNumber) {
                System.out.println("Your guess is to high");
                userGuess.setPromptText("Your guess is to high");
                userGuess.setText("");
                counter++;

            } else if (userNumber == roundedNumber) {
                System.out.println("You guested");
                userGuess.setPromptText("You guested");
                userGuess.setText("");
            } else {
                System.out.println("Your guess is to low");
                userGuess.setPromptText("Your guess is to low");
                userGuess.setText("");
                counter++;
            }
        }
    }



}
