/**
 * Sample Skeleton for 'testJDBC.fxml' Controller Class
 */

package org.alsoftware.testJDBC;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class testJDBCController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtEdit"
    private TextField txtEdit; // Value injected by FXMLLoader

    @FXML // fx:id="btn01"
    private Button btn01; // Value injected by FXMLLoader

    @FXML // fx:id="memo1"
    private TextArea memo1; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtEdit != null : "fx:id=\"txtEdit\" was not injected: check your FXML file 'testJDBC.fxml'.";
        assert btn01 != null : "fx:id=\"btn01\" was not injected: check your FXML file 'testJDBC.fxml'.";
        assert memo1 != null : "fx:id=\"memo1\" was not injected: check your FXML file 'testJDBC.fxml'.";

    }
}
