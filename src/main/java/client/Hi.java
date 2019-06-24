package client;

import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.xml.ws.handler.Handler;

public class Hi extends Application {
    private Button button;

    public static void main(String... args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("This is the main window");
        button = new Button("Click me");
        StackPane layout = new StackPane();
        button.setOnAction(e -> System.out.println("Ooooo, you clicked me, i love u!!"));
        layout.getChildren().add(button);


        Scene scene = new Scene(layout,1200,900);


        scene.getStylesheets().add(getClass().getResource("/css/index.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

//    public void handle(ActionEvent event) {
//        if(event.getSource() == button){
//            System.out.println("Oooooo, you clicked me, i love u!");
//        }
//    }
}
