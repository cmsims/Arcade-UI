package UI;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class UIMain extends Application {

    private Pane BrowseGamesPane, MainMenuPane, SettingsPane, KioskModePane;
    private Scene BrowseGamesScene, KioskModeScene, SettingsScene;

    @Override
    public void start(Stage primaryStage) throws Exception {


        //BrowseGamesScene=new Scene(BrowseGamesPane, 800, 600);


        primaryStage.setFullScreen(true);
        primaryStage.setTitle("Mocs Arcade Cabinet");
        //this builds the browse games screen below, this needs to be called when the browsegames button is pushed
        //can set it up here, but set the scene when the button is pushed\
        Pane MainMenuPane=(Pane) FXMLLoader.load(getClass().getResource("Views/MainMenuView.fxml"));

        //Pane BrowseGamesPane = (Pane) FXMLLoader.load(getClass().getResource("Views/TableView.fxml"));
        //Pane SettingsPane = (Pane) FXMLLoader.load(getClass().getResource("Views/SettingsView.fxml"));
        //Pane KioskModePane = (Pane) FXMLLoader.load(getClass().getResource("Views/KioskModeView.fxml"));
        Scene myScene = new Scene(MainMenuPane);
        primaryStage.setScene(myScene);
        myScene.getStylesheets().add(UIMain.class.getResource("Css/MainMenuView.css").toExternalForm());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
