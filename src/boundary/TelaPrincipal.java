package boundary;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
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

public class TelaPrincipal extends Application implements EventHandler<ActionEvent> {

	private SubTela telaCadastro = new TelaCadastro();
	
	private StackPane sp = new StackPane();
	
	FlowPane fp = new FlowPane();
	
	private BorderPane telaPrincipal = new BorderPane();
	private TextField txtUsuario = new TextField();
	private TextField txtSenha = new TextField();
	private Button btnLogin = new Button("Entrar");
	private Button btnCadastro = new Button("Cadastre-se");
	private Button btnVoltar = new Button("Voltar");

	@Override
	public void start(Stage stage) {
		Scene scn = new Scene(telaPrincipal, 1150, 600);
		
		Image image = new Image("viajar-de-aviao-com-cachorro.png");
		ImageView imgv = new ImageView(image);
		imgv.setFitHeight(600);
		imgv.setFitWidth(800);
		
		
		telaPrincipal.setLeft(imgv);
		this.gerarTelaPrincipal();
	//	telaPrincipal.setRight(fp);
		
		sp.getChildren().addAll(imgv);
		
		telaPrincipal.setLeft(sp);
		
		btnVoltar.setOnAction(this);
		trocarTela("Login");
		
		Image icon = new Image("cachorro-viajando-de-aviao.png");
		stage.getIcons().add(icon);
		stage.setScene(scn);
		stage.setTitle("ATOG - Airplane Travelling With Dogs");
		stage.show();
	}
	
	public void gerarTelaPrincipal() {
	
		fp.setVgap(-100);
		fp.setPadding(new Insets(50, 20, 10, 10));
		
		Image imagee = new Image("logo poo.png");
		ImageView logo = new ImageView(imagee);
		
		GridPane gp = new GridPane();
		gp.setPadding(new Insets(220, 105, 10, 70));
		gp.setVgap(10);
		gp.setHgap(5);
		
		gp.add(new Label("Usuario"), 0, 0);
		gp.add(txtUsuario, 0, 1);
		gp.add(new Label("Senha"), 0, 2);
		gp.add(txtSenha, 0, 3);
		
		btnLogin.setPrefSize(200, 0);
		btnLogin.setFont(new Font("Arial", 12));
		gp.add(btnLogin, 0, 4);

		btnCadastro.setPrefSize(200, 0);
		btnCadastro.setFont(new Font("Arial", 12));
		btnCadastro.setOnAction(this);
		gp.add(btnCadastro, 0, 5);

		ColumnConstraints col1 = new ColumnConstraints();
		col1.setHalignment(HPos.CENTER);
		gp.getColumnConstraints().addAll(col1);
		
		fp.getChildren().addAll(logo, gp);
	
	}
	
	private void gerarVoltar() {
		btnVoltar.setPrefSize(100, 50);
		
		BorderPane bpa = new BorderPane();
		bpa.setBottom(btnVoltar);
		bpa.setPadding(new Insets(20, 20, 20, 20));
		
		sp.getChildren().addAll(bpa);
	}

	@Override
	public void handle(ActionEvent e) {
		if(e.getTarget() == btnCadastro) {
			trocarTela("Cadastro");
			gerarVoltar();
		}else if (e.getTarget() == btnVoltar){
			trocarTela("Login");
			sp.getChildren().remove(1);
		}
		
	}
	
	public void trocarTela(String s) {
		if (s.equals("Cadastro")) {
			telaPrincipal.setRight(telaCadastro.gerarTela());
		}else if (s.equals("Login")) {
			telaPrincipal.setRight(fp);
		}
	}
	
	
	public static void main(String[] args) {
		Application.launch(TelaPrincipal.class, args);
	}
	
}
