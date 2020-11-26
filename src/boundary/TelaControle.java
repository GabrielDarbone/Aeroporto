package boundary;

import javafx.scene.layout.BorderPane;

public class TelaControle {
	
	public BorderPane telaPrincipal = new BorderPane();
	
	//Telas Secundarias
	private TelaMenuCliente tMenuCliente = new TelaMenuCliente();
	private TelaCadastro tCadastro = new TelaCadastro();
	private TelaLogin tLogin = new TelaLogin();

	public void trocarTela(String cmd) {
		if (cmd.equals("TelaCadastro")) {
			telaPrincipal =  (BorderPane) tCadastro.gerarTela();
		}else if (cmd.equals("TelaLogin")) {
			telaPrincipal =  (BorderPane) tLogin.gerarTela();
		}else if(cmd.equals("TelaMenuCliente")) {
			telaPrincipal = (BorderPane) tMenuCliente.gerarTela();
		}
		TelaPrincipal.setTelaPrincipal(telaPrincipal);
	}

	public BorderPane getTelaPrincipal() {
		return telaPrincipal;
	}
	
}
