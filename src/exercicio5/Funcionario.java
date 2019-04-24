package exercicio5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Funcionario {
	public String nome;
	public int codigoFuncional;
	
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
	
	Funcionario(String nome, int codigoFuncional) {
		this.nome = nome;
		this.codigoFuncional = codigoFuncional;
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
		Funcionario funcionario = new Funcionario(this.getNome(), this.getCodigoFuncional());
		return funcionario;
	}
}
