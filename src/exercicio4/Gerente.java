package exercicio4;

public class Gerente {
	/*Implemente a classe Funcionario e a classe Gerente.

	a)	crie a classe Assistente, que tamb�m � um funcion�rio, e que possui um n�mero de matr�cula (fa�a o m�todo GET). Sobrescreva o m�todo exibeDados(). 
	b)	sabendo que os Assistentes T�cnicos possuem um b�nus salarial e que os Assistentes Administrativos possuem um turno (dia ou noite) e um adicional noturno, 
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
