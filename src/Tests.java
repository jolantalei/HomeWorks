//import javafx.application.Application;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//import java.awt.*;
//
//public class Tests extends Application {
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        TextField tf = new TextField();
//        BorderPane root = new BorderPane();
//        GridPane gp = new GridPane();
//        Button btn;
//        root.setTop(tf);
//
//        RowConstraints rc = new RowConstraints();
//        rc.setVgrow(Priority.ALWAYS);
//        rc.setFillHeight(true);
//        gp.getRowConstraints().addAll(rc,rc,rc,rc);
//        ColumnConstraints cc = new ColumnConstraints();
//        cc.setHgrow(Priority.ALWAYS);
//        cc.setFillWidth(true);
//        gp.getColumnConstraints().addAll(cc,cc,cc,cc);
//
//
//        gp.add(btn = new Button("7"), 0, 0);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("8"), 1, 0);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("9"), 2, 0);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("/"), 3, 0);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//
//        gp.add(btn = new Button("4"), 0, 1);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("5"), 1, 1);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("6"), 2, 1);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("*"), 3, 1);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//
//        gp.add(btn = new Button("1"), 0, 2);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("2"), 1, 2);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("3"), 2, 2);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("-"), 3, 2);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//
//        gp.add(btn = new Button("0"), 0, 3);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("."), 1, 3);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("="), 2, 3);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//        gp.add(btn = new Button("+"), 3, 3);
//        btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
//
//
//        root.setCenter(gp);
//
//        primaryStage.setScene(new Scene(root, 300, 250));
//        primaryStage.show();
//    }
//
//}
