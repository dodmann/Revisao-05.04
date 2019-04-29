package exercicio6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funcionario {
	private String nome;
	private int codigoFuncional;
	private double rendaBasica = 1000;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigoFuncional() {
		return codigoFuncional;
	}
	
	public void setCodigoFuncional(int codigoFuncional) {
		this.codigoFuncional = codigoFuncional;
	}
	
	public double getRendaBasica() {
		return rendaBasica;
	}

	public void setRendaBasica(double rendaBasica) {
		this.rendaBasica = rendaBasica;
	}

	Funcionario(String nome, int codigoFuncional, double rendaBasica) {
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
		this.rendaBasica = rendaBasica;
	}
	
	Funcionario(){}
	
	public Funcionario createFuncionario() {
//		System.out.println("Entrei na classe funcionario");
		BufferedReader nomeEnt = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Digite o nome do funcionario: ");
		try {
			this.setNome(nomeEnt.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("Digite o codigo funcional do funcionario: ");
		try {
			this.setCodigoFuncional(Integer.parseInt(nomeEnt.readLine()));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Funcionario funcionario = new Funcionario(this.getNome(), this.getCodigoFuncional(), this.getRendaBasica());
		return funcionario;
	}
	
	public String toString() {
		return "Nome do funcionario: " + this.getNome() + ", " + "codigo funcional: " + this.getCodigoFuncional() + ", renda basica: " + this.getRendaBasica();
	}
}
