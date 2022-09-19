/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class FXMLClientOffrelController implements Initializable {

    @FXML
    private VBox chosenoffrecard;
    @FXML
    private Label offreName;
    @FXML
    private Label offrePrix;
    @FXML
    private ImageView offreImage;
    @FXML
    private Text descoffre;
    @FXML
    private ScrollPane scrol;
    @FXML
    private GridPane grid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
