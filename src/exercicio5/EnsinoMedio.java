package exercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnsinoMedio extends EnsinoBasico {
	String escolaMedio;
	
	public String getEscolaMedio() {
		return escolaMedio;
	}

	public void setEscolaMedio(String escolaMedio) {
		this.escolaMedio = escolaMedio;
	}

	EnsinoMedio(String nome, int codigoFuncional, String escolaBasico, String escolaMedio) {
		super(nome, codigoFuncional, escolaBasico);
		this.escolaMedio = escolaMedio;
	}
	
	EnsinoMedio() {}

	public EnsinoMedio createFuncionario() {
//		System.out.println("Entrei na classe ensino medio");
		EnsinoBasico ensinoBasico = super.createFuncionario();
//		System.out.println("Funcionario criado:" + ensinoBasico);
		BufferedReader nomeEscolaMedio = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite o nome da Escola de Ensino Medio: ");
		try {
			this.setEscolaMedio(nomeEscolaMedio.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		EnsinoMedio ensinoMedio = new EnsinoMedio(ensinoBasico.nome, ensinoBasico.codigoFuncional, ensinoBasico.escolaBasico, this.getEscolaMedio());
		return ensinoMedio;
	}
	
	public String toString() {
		String retorno = super.toString();
		return retorno + ", " + this.getEscolaMedio();
	}

}
