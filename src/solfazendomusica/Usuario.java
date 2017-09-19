package solfazendomusica;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {
	int id;
	String nome;
	String nickname;
	String email;
	String senha;
	String confirmarSenha;
	
	/*public Usuario(String nome, String nickname, String email, String senha, String confirmarSenha){
		this.nome = nome;
		this.nickname = nickname;
		this.email = email;
		this.senha = senha;
		this.confirmarSenha = confirmarSenha;
		
	}*/
		
	ArrayList<Video> videos = new ArrayList();
	public void adicionarVideo (Video video){
		videos.add(video);
	}
	
	ArrayList<Musico> instrumentos = new ArrayList();
	public void adicionarIntrumento (Musico instrumento){
		instrumentos.add(instrumento);
	}
	
	public void tocar() {
		
	}
	public void cadastrarUsuario(){
		//JOptionPane.showMessageDialog(null,"Comece o cadastro da sua conta.","",JOptionPane.INFORMATION_MESSAGE);
		
		this.nome = JOptionPane.showInputDialog("Insira seu nome:");
		System.out.println(this.nome);
		this.nickname = JOptionPane.showInputDialog("Insira seu nickname:");
		System.out.println(this.nickname);
		this.email = JOptionPane.showInputDialog("Insira seu email:");
		System.out.println(this.email);
		this.senha = JOptionPane.showInputDialog("Insira sua senha:");
		this.confirmarSenha = JOptionPane.showInputDialog("Repita sua senha:");
		if(this.senha.equals(this.confirmarSenha)){
			JOptionPane.showMessageDialog(null, "OK!", "Ok", JOptionPane.INFORMATION_MESSAGE);
			}else{
				for(int i =0;i <= 3; i++) {
					JOptionPane.showMessageDialog(null, "As senhas não estão iguais, favor redigitá-las!", "Erro.", JOptionPane.ERROR_MESSAGE);
					this.senha = JOptionPane.showInputDialog("Insira sua senha:");
					this.confirmarSenha = JOptionPane.showInputDialog("Repita sua senha:");
					if((i == 0 ||i == 1 || i == 2)){
						if(this.senha.equals(this.confirmarSenha)){
							JOptionPane.showMessageDialog(null, "OK!", "Ok", JOptionPane.INFORMATION_MESSAGE);
							break;
						}else {
							JOptionPane.showMessageDialog(null, "Repita o procedimento", "Ok", JOptionPane.INFORMATION_MESSAGE);
							
						}
						}
					else {
						JOptionPane.showMessageDialog(null, "Você errou 3 vezes a senha, favor reiniciar o processo", "Falha no cadastro", JOptionPane.WARNING_MESSAGE);
						this.cadastrarUsuario();
						}
					}
							System.out.println(this.nome);
		System.out.println(this.nickname);
		System.out.println(this.email);
		System.out.println(this.senha);
		System.out.println(this.confirmarSenha);
	}
	
	
}
}
