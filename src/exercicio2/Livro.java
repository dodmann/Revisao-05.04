package exercicio2;

public class Livro extends Produto {
	
	Livro(String nome, double preco, String autor){
		super(nome, preco);
			this.autor = autor;
	}
	
	private String autor;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String toString(){
		return this.getNome() + " " + this.getPreco() + " " + this.getAutor();		
	}
}
