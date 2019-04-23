package exercicio4;

public class Tecnico extends Assistente{
	int bonusSalarial;
	
	public int getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(int bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}

	Tecnico(String nome, int numMatricula, int bonusSalarial) {
		super(nome, numMatricula);
		this.bonusSalarial = bonusSalarial;
	}
	
	public void exibeDados(){
		System.out.println("O nome do funcionario e: " + this.getNome());
		System.out.println("O numero de matricula do funcionario e: " + this.getNumMatricula());
		System.out.println("O bonus salarial do funcionario e: " + this.getBonusSalarial());
	}

}
