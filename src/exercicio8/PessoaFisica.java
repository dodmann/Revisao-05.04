package exercicio8;

public class PessoaFisica extends Pessoa {
	int cpf;

	PessoaFisica(String nome, String endereco, int telefone, int cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
}
