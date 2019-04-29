package exercicio4;

public class Administrativo extends Assistente {
	private String turno;
	private int adicionalNoturno;
	
	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public int getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(int adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}

	Administrativo(String nome, int numMatricula, String turno, int adicionalNoturno) {
		super(nome, numMatricula);
		this.turno = turno;
		this.adicionalNoturno = adicionalNoturno;
	}
	
	public void exibeDados(){
		System.out.println("O nome do funcionario e: " + this.getNome());
		System.out.println("O numero de matricula do funcionario e: " + this.getNumMatricula());
		System.out.println("O turno do funcionario e: " + this.getTurno());
		System.out.println("O adicional noturno do funcionario e: " + this.getAdicionalNoturno());
	}

}
