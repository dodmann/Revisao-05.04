package exercicio4;

public class Funcionario {
	private String nome;
	
	Funcionario(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibeDados() {
		System.out.println("O nome do funcionário e: " + this.getNome());
	}
	

}
