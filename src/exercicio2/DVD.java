package exercicio2;

public class DVD extends Produto {
	private double duracao;
	
	DVD(String nome, double preco, double duracao){
		super(nome, preco);
			this.duracao = duracao;
	}
	
	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public String toString(){
		return this.getNome() + " " + this.getPreco() + " " +this.getDuracao();		
	}
}
