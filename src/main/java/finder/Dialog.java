package finder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputControl;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Dialog extends Application{
    private Button cancel = new Button("取消");
    private Button confirm = new Button("打开");
    public Button submit;


    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("/fxml/dialog.fxml"));
        root.getStylesheets().add(getClass().getResource("/css/dialog.css").toString());

        Scene scene = new Scene(root,900,600);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String... args){
        launch(args);
    }

    public void HandleClick(){
        System.out.println("you clicked the submit button!!!");
        submit.setText("Stop touching me...");
    }
}
