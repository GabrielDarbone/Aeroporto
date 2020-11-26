package boundary;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/*
Tela -
	Cliente - 
		Tela Compra
		Tela Compras anteriores
		Tela Alteração de cadastro
		Tela Passagem
	
	Admin -
		Tela Cadastro de destinos
		Tela Cadastro de viagens
		Tela Cadastro avião

DAO - 
	Dao Destinos
	Dao Viagens
	Dao Avião 
	Dao Cliente 
	
Entidades - 
	Cliente
	Passagem
	Avião
	Tipo_Viagem
	Destino
	Classe
	Compra
 
*/

public class TelaPrincipal extends Application{

	private TelaControle tControl = new TelaControle();
	
	private static BorderPane telaPrincipal = new BorderPane();

	@Override
	public void start(Stage stage) {
		Scene scn = new Scene(telaPrincipal, 1150, 600);

		tControl.trocarTela("TelaLogin");
		
		Image icon = new Image("cachorro-viajando-de-aviao.png");
		stage.getIcons().add(icon);
		
		stage.setScene(scn);
		stage.setTitle("ATOG - Airplane Travelling With Dogs");
		stage.show();
	}
	
	public static void setTelaPrincipal(BorderPane novaTela) {
		telaPrincipal.setCenter(novaTela);
	}
	
	public static void main(String[] args) {
		Application.launch(TelaPrincipal.class, args);
	}
	
}
