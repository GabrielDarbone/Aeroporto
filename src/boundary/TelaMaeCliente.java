package boundary;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class TelaMaeCliente {


    public Pane gerarTelaEsq() {

        VBox vb = new VBox ();

        Image imagee = new Image("logo poo.png");
        ImageView logo = new ImageView(imagee);
        logo.setFitHeight(50);
        logo.setFitWidth(150);

        vb.getChildren().add(logo);
        vb.setPadding(new Insets(30, 10, 0, 0));
        vb.getChildren().add(new Label("Voos"));
        vb.getChildren().add(new Label("Destinos"));

        return vb;
    }

}