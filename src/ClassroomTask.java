import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClassroomTask extends Application {
    private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        TextField username = new TextField();
        TextField password = new TextField();
        HBox buttonLayout = new HBox();

        VBox vBox = new VBox();//ir layouts gridpane kas ļauj kastītes lkts vairākās kolonnās un rowos
        vBox.getChildren().addAll(username, password, buttonLayout);//tagad layoutā ir divas poga vien zem otras un hbox  layouts

        Button loginButton = new Button("Login");
        loginButton.setId("login-button");
        Button registerButton = new Button("Register");
        buttonLayout.getChildren().addAll(loginButton, registerButton);//tagad ši lataoutam pievieno pogas


        Scene firstScene = new Scene(vBox, 640, 480);
        firstScene.getStylesheets().add("Style.css");

        Text labelOne = new Text("You are logged in");
        Button logout = new Button("Logged out");
        HBox horizontalLayout = new HBox();
        horizontalLayout.getChildren().addAll(labelOne,logout);//get children iedod visu kas ietiplst šajā layoutā
        Scene otherScene = new Scene(horizontalLayout, 320, 240);

        Button buttonBack = new Button("Back");
        buttonBack.setId("button-enter");

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
        Button buttonEqual = new Button("=");
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
        gridPane.add(buttonEqual, 2, 3);
        gridPane.add(buttonAdding, 3, 3);
        gridPane.add(buttonBack,0,3,5,5);
        gridPane.add(result, 0, 4, 5,5);

        Scene scene = new Scene(gridPane, 200, 300);
        scene.getStylesheets().add("CalculatorStyle.css");



        loginButton.setOnAction(event -> {
            window.setScene(scene);
        });

        buttonBack.setOnAction(event -> {
            window.setScene(otherScene);
        });

        logout.setOnAction(event -> {
            window.setScene(firstScene);
        });

        window.setScene(firstScene);
        primaryStage.show();
    }
}
