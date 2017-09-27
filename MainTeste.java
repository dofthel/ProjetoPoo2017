package solfazendomusica;

import javax.swing.JOptionPane;

public class MainTeste {
	public static void main(String[] args) {
		int x;
		x = JOptionPane.showConfirmDialog(null, "Você Deseja iniciar o Cadastro?", "Cadastro",
				JOptionPane.INFORMATION_MESSAGE);
		if (x == 0) {
			Usuario user = new Usuario();
			user.cadastrarUsuario();
		} else {
			JOptionPane.showMessageDialog(null, "Cadastro Cancelado.");
		}
	}
}
