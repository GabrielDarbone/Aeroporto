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
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TelaPrincipal extends Application implements EventHandler<ActionEvent> {

	private BorderPane telaPrincipal = new BorderPane();
	private TextField txtUsuario = new TextField();
	private TextField txtSenha = new TextField();
	private Button btnLogin = new Button("Entrar");
	private Button btnCadastro = new Button("Cadastre-se");

	@Override
	public void start(Stage stage) throws Exception {
		Scene scn = new Scene(telaPrincipal, 1150, 600);
		Image image = new Image("viajar-de-aviao-com-cachorro.png");
		ImageView imgv = new ImageView(image);
		imgv.setFitHeight(600);
		imgv.setFitWidth(800);
		telaPrincipal.setLeft(imgv);
		this.gerarTelaPrincipal();
		stage.setScene(scn);
		stage.setTitle("Aeroporto");
		stage.show();
	}
	
	public void gerarTelaPrincipal() {
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

		Image imagee = new Image("logo poo.png");
		ImageView logo = new ImageView(imagee);

		ColumnConstraints col1 = new ColumnConstraints();
		col1.setHalignment(HPos.CENTER);
		gp.getColumnConstraints().addAll(col1);

		FlowPane fp = new FlowPane();
		fp.getChildren().addAll(logo, gp);
		fp.setVgap(-100);
		fp.setPadding(new Insets(50, 20, 10, 10));
		telaPrincipal.setRight(fp);
	}

	@Override
	public void handle(ActionEvent arg0) {
		SubTela sb = new TelaCadastro();
		telaPrincipal.setRight(sb.gerarTela());
	}
	
	public void trocarTela(String s) {
		System.out.println("antes da func");
			this.gerarTelaPrincipal();
			System.out.println("dps da func");

	}
	
	
	public static void main(String[] args) {
		Application.launch(TelaPrincipal.class, args);
	}

}
