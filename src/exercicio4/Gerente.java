package exercicio4;

public class Gerente {
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
