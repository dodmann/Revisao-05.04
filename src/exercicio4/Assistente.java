package exercicio4;

public class Assistente extends Funcionario {
	int numMatricula;
	
	Assistente(String nome, int numMatricula) {
		super(nome);
		this.numMatricula = numMatricula;
	}
	
	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public void exibeDados(){
		System.out.println("O nome do funcionario e: " + this.getNome());
		System.out.println("O numero de matricula do funcionario e: " + this.getNumMatricula());
	}

}
