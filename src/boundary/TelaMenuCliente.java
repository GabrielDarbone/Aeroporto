package boundary;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class TelaMenuCliente extends TelaMaeCliente
					implements SubTela, EventHandler<ActionEvent> {


	@Override
	public Pane gerarTela() {
		
		BorderPane telaPrincipal = new BorderPane();
		
		telaPrincipal.setLeft(super.gerarTelaEsq());
		return telaPrincipal;
	}

	@Override
	public Pane criarTela() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void handle(ActionEvent event) {
		
	}

}
