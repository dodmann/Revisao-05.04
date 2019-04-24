package exercicio5;

import java.util.Scanner;

public class Gerente {
	/*Uma empresa quer manter o registro da vida acadêmica de todos os funcionários, o modelo deve contemplar o registro das seguintes informações, de forma incremental:
		a)	Para o funcionário que não estudou, apenas o nome e o código funcional;
		b)	Para o funcionário que concluiu o ensino básico, a escola;
		c)	Para o funcionário que concluiu o ensino médio, a escola;
		d)	Para o funcionário que concluiu a graduação, a Universidade;
	*/
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		EnsinoBasico eb = new EnsinoBasico();
		EnsinoMedio em = new EnsinoMedio();
		Graduacao gd = new Graduacao();
		
		int opcao = 0;
		
		while (opcao != 5) {
			System.out.println("Menu");
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1 . Criar Funcionario");
			System.out.println("2 . Criar Funcionario com Ensino Basico");
			System.out.println("3 . Criar Funcionario com Ensino Medio");
			System.out.println("4 . Criar Funcionario com Graduacao");
			System.out.println("5 . Sair");
			System.out.print("Digite a opcao selecionada: ");
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1: Funcionario teste1 = funcionario.createFuncionario();
				System.out.println(teste1);
				break;
				
				case 2: eb.createFuncionario();
				break;
				
				case 3: em.createFuncionario();
				break;
				
				case 4: gd.createFuncionario();
				break;
				
				case 5:
				return;
				
				default: System.out.println("Opcao invalida."); 
				break;
			}			
		}
		// Testes		
		/*Funcionario teste = funcionario.createFuncionario();
		System.out.println(teste.nome + " " + teste.codigoFuncional);
		
		EnsinoBasico teste2 = eb.createFuncionario();
		System.out.println(teste2.nome + " " + teste2.codigoFuncional + " " + teste2.escolaBasico);
		
		EnsinoMedio teste3 = em.createFuncionario();
		System.out.println(teste3.nome + " " + teste3.codigoFuncional + " " + teste3.escolaBasico + " " + teste3.escolaMedio);
		
		Graduacao teste4 = gd.createFuncionario();
		System.out.println(teste4.nome + " " + teste4.codigoFuncional + " " + teste4.escolaBasico + " " + teste4.escolaMedio + " " + teste4.escolaSuperior);*/
	}
}
