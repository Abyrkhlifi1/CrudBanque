/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vieu;

import bankcrud.BankCrud;
import bankcrud.MyListener;
import bankcrud.offre;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class ItemController  {

    @FXML
    private Label name;
    @FXML
    private Label prix;
    @FXML
    private ImageView img;
    @FXML
    private Text Desco;

   
    @FXML
    private void click(MouseEvent mouseEvent) {
        myListener.onClickListener(offre);
    }

    private offre offre;
    private MyListener myListener;

    public void setData(offre offre) {
        this.offre = offre;
        
        name.setText(offre.getNomOffre());
        prix.setText(BankCrud.CURRENCY + offre.getPrix());
        Image image = new Image(getClass().getResourceAsStream(offre.getImgoffre()));
        img.setImage(image);
    }
     
    
}
