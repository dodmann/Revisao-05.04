package exercicio7;

public class PessoaFisica extends Cliente {
	int cpf;

	PessoaFisica(String nome, String endereco, int telefone, int cpf) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}
	
	PessoaFisica() {}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public String imprimeDados() {
		String retorno = super.imprimeDados();
		return retorno + ", cpf: " + this.getCpf();
	}
}
