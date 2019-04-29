package exercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnsinoBasico extends Funcionario {
	private String escolaBasico;
	
	public String getEscolaBasico() {
		return escolaBasico;
	}

	public void setEscolaBasico(String escolaBasico) {
		this.escolaBasico = escolaBasico;
	}

	EnsinoBasico(String nome, int codigoFuncional, double rendaBasica, String escolaBasico) {
		super(nome, codigoFuncional, rendaBasica);
		this.escolaBasico = escolaBasico;
	}
	
	EnsinoBasico(){}
	
	public EnsinoBasico createFuncionario() {
//		System.out.println("Entrei na classe ensino basico");
		Funcionario funcionario = super.createFuncionario();
//		System.out.println("Funcionario criado:" + funcionario);
		BufferedReader nomeEscola = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite o nome da Escola de Ensino Basico: ");
		try {
			this.setEscolaBasico(nomeEscola.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		double rendaBasica = funcionario.getRendaBasica() + funcionario.getRendaBasica() * 0.1;
		EnsinoBasico ensinoBasico = new EnsinoBasico(funcionario.getNome(), funcionario.getCodigoFuncional(), rendaBasica, this.getEscolaBasico());
		return ensinoBasico;
	}
	
	public String toString() {
		String retorno = super.toString();
		return retorno + ", Escola Basico: " + this.getEscolaBasico();
	}
}
