import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;

        Button loginButton = new Button("Login");
        loginButton.setId("login-button");

        VBox vBox = new VBox();
        vBox.getChildren().addAll(loginButton);

        Scene firstScene = new Scene(vBox, 640, 480);
        firstScene.getStylesheets().add("Style.css");

        Text labelOne = new Text("You are logged in");
        Button logout = new Button("Logged out");
        HBox horizontalLayout = new HBox();
        horizontalLayout.getChildren().addAll(labelOne,logout);//get children iedod visu kas ietiplst šajā layoutā
        Scene otherScene = new Scene(horizontalLayout, 320, 240);

        loginButton.setOnAction(event -> {
            window.setScene(otherScene);
        });

        logout.setOnAction(event -> {
            window.setScene(firstScene);
        });

        window.setScene(firstScene);
        primaryStage.show();
    }


}
