package exercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Graduacao extends EnsinoMedio {
	String escolaSuperior;
	
	public String getEscolaSuperior() {
		return escolaSuperior;
	}

	public void setEscolaSuperior(String escolaSuperior) {
		this.escolaSuperior = escolaSuperior;
	}

	Graduacao(String nome, int codigoFuncional, String escolaBasico, String escolaMedio, String escolaSuperior) {
		super(nome, codigoFuncional, escolaBasico, escolaMedio);
		this.escolaSuperior = escolaSuperior;
	}
	
	Graduacao() {}
	
	public Graduacao createFuncionario() {
//		System.out.println("Entrei na classe graduacao");
		EnsinoMedio ensinoMedio = super.createFuncionario();
//		System.out.println("Funcionario criado:" + ensinoMedio);
		BufferedReader nomeEscolaSuperior = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite o nome da Escola de Ensino Superior: ");
		try {
			this.setEscolaSuperior(nomeEscolaSuperior.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		Graduacao graduacao = new Graduacao(ensinoMedio.nome, ensinoMedio.codigoFuncional, ensinoMedio.escolaBasico, ensinoMedio.escolaMedio, this.getEscolaSuperior());
		return graduacao;
	}

}
