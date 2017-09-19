package solfazendomusica;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int x;
		x = JOptionPane.showConfirmDialog(null, "Você Deseja se cadastrar no nosso APP?", "Cadastro", JOptionPane.INFORMATION_MESSAGE );
		if (x == 0){
			Usuario user = new Usuario();
			user.cadastrarUsuario();
	}else{
		JOptionPane.showMessageDialog(null,"Cadastro Cancelado.");
	}
}
}