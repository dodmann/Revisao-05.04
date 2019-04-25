package exercicio6;

import java.util.ArrayList;
import java.util.Scanner;


public class Gerente {
	/*Estenda o modelo implementado no exerc�cio anterior de forma que todo funcion�rio possua uma renda b�sica de R$ 1000,00 e:
	a)	Com a conclus�o do ensino b�sico a renda total � renda b�sica acrescentada em 10%;
	b)	Com a conclus�o do ensino m�dio a renda total � a renda do n�vel anterior acrescentada em 50%;
	c)	Com a conclus�o da gradua��o a renda total � a renda do n�vel anterior acrescentada em 100%;
	d)	Todos os c�lculos s�o efetuados sempre sobre a �ltima renda obtida.
	*/
	public static void main(String[] args) {
		int opcao = 0;
		
		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		while (opcao != 5) {
			System.out.println("*********************************************************************");
			System.out.println("Funcionarios: " + funcionarios.toString());
			System.out.println("*********************************************************************");
			System.out.println("Menu");
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1 . Criar Funcionario");
			System.out.println("2 . Criar Funcionario com Ensino Basico");
			System.out.println("3 . Criar Funcionario com Ensino Medio");
			System.out.println("4 . Criar Funcionario com Graduacao");
			System.out.println("5 . Sair");
			System.out.print("Digite a opcao selecionada: ");
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();			
			
			switch(opcao) {
				case 1: 
					Funcionario funcionario = new Funcionario();
					Funcionario func = funcionario.createFuncionario();
					funcionarios.add(func);
				break;
				
				case 2:
					EnsinoBasico eb = new EnsinoBasico();
					EnsinoBasico funcEb = eb.createFuncionario();
					funcionarios.add(funcEb);
				break;
				
				case 3:
					EnsinoMedio em = new EnsinoMedio();
					EnsinoMedio funcEm = em.createFuncionario();
					funcionarios.add(funcEm);
				break;
				
				case 4: 
					Graduacao gd = new Graduacao();
					Graduacao funcGd = gd.createFuncionario();
					funcionarios.add(funcGd);
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
