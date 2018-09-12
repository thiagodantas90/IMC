package imc;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class FXMLController implements Initializable {

    @FXML
    private JFXTextField peso;
    @FXML
    private JFXTextField altura;
    @FXML
    private JFXButton btncalc;
    @FXML
    private JFXTextField resultado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    
    
}
