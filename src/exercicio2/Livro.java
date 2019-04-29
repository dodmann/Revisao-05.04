package exercicio2;

public class Livro extends Produto {
	private String autor;
	
	Livro(String nome, double preco, String autor){
		super(nome, preco);
			this.autor = autor;
	}

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
