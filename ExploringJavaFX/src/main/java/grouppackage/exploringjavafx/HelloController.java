package grouppackage.exploringjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    @FXML
    private TextField tfTitle;

    @FXML
    void btnClickedOk(ActionEvent event) {
      Stage mainWindow = (Stage) tfTitle.getScene().getWindow();
      String title = tfTitle.getText();
      mainWindow.setTitle(title);
    }

}
