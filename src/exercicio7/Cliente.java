package exercicio7;

public class Cliente {
	private String nome;
	private String endereco;
	private int telefone;
	
	Cliente(String nome, String endereco, int telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	Cliente() {}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public String imprimeDados() {
		return "Nome do cliente: " + this.getNome() + ", endereco do cliente: " + this.getEndereco() + ", telefone do cliente: " + this.getTelefone();
	}
}
