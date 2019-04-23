package exercicio4;

public class Gerente {
	/*Implemente a classe Funcionario e a classe Gerente.

	a)	crie a classe Assistente, que também é um funcionário, e que possui um número de matrícula (faça o método GET). Sobrescreva o método exibeDados(). 
	b)	sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes Administrativos possuem um turno (dia ou noite) e um adicional noturno, 
	crie as classes Tecnico e Administrativo. 
	*/
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Funcionario1");
		Assistente funcionario2 = new Assistente("Assistente1", 1);
		Tecnico funcionario3 = new Tecnico("AssistenteTecnico1", 1, 2);
		Administrativo funcionario4 = new Administrativo("AssistenteAdministrativo", 1, "Noturno", 2);
		funcionario1.exibeDados();
		funcionario2.exibeDados();
		funcionario3.exibeDados();
		funcionario4.exibeDados();
	}
}
