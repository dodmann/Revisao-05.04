package exercicio7;

public class PessoaJuridica extends Cliente {
	int cnpj;
	String nomeFantasia;
	
	PessoaJuridica(String nome, String endereco, int telefone, int cnpj, String nomeFantasia) {
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}
	
	PessoaJuridica() {}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	public String imprimeDados() {
		String retorno = super.imprimeDados();
		return retorno + ", cnpj: " + this.getCnpj() + ", nome fantasia: " + this.getNomeFantasia();
	}
}
