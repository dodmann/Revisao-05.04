package exercicio8;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/*
		Um sistema de cadastro de clientes de uma empresa guarda informa��es sobre nomes, endere�os e telefones. 
		Al�m disso, caso o cliente seja uma pessoa f�sica, seu n�mero de CPF � armazenado e, caso o cliente seja uma pessoa jur�dica, 
		seu CNPJ e nome de fantasia da empresa devem ser guardados. A qualquer momento deve ser poss�vel imprimir todos dados de um determinado cliente. 
		Altere a modelagem a seguir e implemente as classes necess�rias em Java utilizando os conceitos de polimorfismo e classes abstratas 
		(n�o � necess�rio implementar o cadastro completo de clientes). 
	*/
	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		//Criando clientes estaticamente
		Cliente cliente1 = new Cliente("Cliente 1", "Rua 1", 12345);
		Cliente cliente2 = new Cliente("Cliente 2", "Rua 2", 23456);
		PessoaFisica cliente3 = new PessoaFisica("Cliente 3", "Rua 3", 34567, 456789);
		PessoaFisica cliente4 = new PessoaFisica("Cliente 4", "Rua 4", 45678, 567890);
		PessoaJuridica cliente5 = new PessoaJuridica("Cliente 5", "Rua 5", 56789, 678901, "Nome Fantasia 1"); 
		PessoaJuridica cliente6 = new PessoaJuridica("Cliente 6", "Rua 6", 67890, 789012, "Nome Fantasia 2");
		
		pessoas.add(cliente1);
		pessoas.add(cliente2);
		pessoas.add(cliente3);
		pessoas.add(cliente4);
		pessoas.add(cliente5);
		pessoas.add(cliente6);
		
		Scanner entrada = new Scanner(System.in);
		
		int index = 0;
		System.out.println("*******************************");
		System.out.println("Clientes");
		System.out.println("*******************************");
		for(Pessoa pessoa: pessoas) {
			System.out.println(String.valueOf(index++) + " - " + pessoa.getNome() );
		}
		System.out.print("Digite o n�mero do cliente desejado: ");
		int indexPesquisar = entrada.nextInt();
		System.out.println("*******************************");
		System.out.println("Nome:" + pessoas.get(indexPesquisar).getNome() + ", telefone: " + pessoas.get(indexPesquisar).getTelefone()  + ", endereco: " + pessoas.get(indexPesquisar).getEndereco());
		System.out.println("*******************************");
		
		entrada.close();
	}
}