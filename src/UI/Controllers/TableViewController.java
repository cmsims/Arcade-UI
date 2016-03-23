package UI.Controllers;

import UI.GameFactory;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TableViewController {
    @FXML
    private TableView<GameFactory> tableView;
    @FXML
    private TextField titleField;
    @FXML
    private TextField developerField;
    @FXML
    private TextField descriptionField;
    @FXML
    private TextField shortDescriptionField;

    @FXML
    protected void addGame(ActionEvent event) {
        ObservableList<GameFactory> data = tableView.getItems();
        data.add(new GameFactory(titleField.getText(),
                developerField.getText(),
                descriptionField.getText(),
                shortDescriptionField.getText()
        ));

        titleField.setText("");
        developerField.setText("");
        descriptionField.setText("");
        shortDescriptionField.setText("");
    }
}