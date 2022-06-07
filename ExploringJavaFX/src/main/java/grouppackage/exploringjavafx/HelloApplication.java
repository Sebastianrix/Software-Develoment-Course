package grouppackage.exploringjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

public Button FirstBtn;
public Button moreBtn;
public BorderPane newWindow;
public Group myGroup;


    @Override
    public void start(Stage stage) throws IOException {
        CreateContent();
        CreateContentTest();

        myGroup = new Group(FirstBtn,moreBtn);



    //   FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
     // Scene scene = new Scene(fxmlLoader.load(), 520, 540);
        Scene homeMadeScene = new Scene(myGroup, 1000, 700);
        stage.setTitle("Hello!");
        //stage.setScene(scene);
        stage.setScene(homeMadeScene);
        stage.show();

    }
public void CreateContent(){

    System.out.println("Maria er sej");
    newWindow = new BorderPane();
    FirstBtn = new Button ("New Button nice");
    FirstBtn.setText("Click this pls");
    FirstBtn.setTranslateX(300);
    FirstBtn.setTranslateY(60);
    FirstBtn.setOnAction(e-> System.out.println("click"));

}
public void CreateContentTest(){

       moreBtn = new Button("ok");
       moreBtn.setTranslateY(50);


       //  System.out.println(i);

}
    public static void main(String[] args) {
        launch();
    }
}