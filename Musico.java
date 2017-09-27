package solfazendomusica;

public class Musico extends Usuario {
	String instrumentoMusical;
	
	public Musico(String nome, String nickname, String email, String senha, String confirmarSenha){
		//super(nome, nickname, email, senha, confirmarSenha);
	}
	
	public void receber(){
		
	}
	
	public void receber(String nome, String nickname,String email) {
		JOptionPane.showMessageDialog(null, "Seu nome é " + nome + ", seu nickname é" + nickname + " e o seu email é " + email + "." , "Alguns dados.", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void tocar() {
		System.out.printl("Tocando");
	}
}
