package exercicio7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/*
		Um sistema de cadastro de clientes de uma empresa guarda informacoes sobre nomes, endereços e telefones. 
		Alem disso, caso o cliente seja uma pessoa fisica, seu número de CPF e armazenado e, caso o cliente seja uma pessoa juridica, 
		seu CNPJ e nome de fantasia da empresa devem ser guardados. A qualquer momento deve ser possível imprimir todos dados de um 
		determinado cliente. 
	*/
	public static void main(String[] args) {
		int opcao = 0;
		
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		
		while (opcao != 5) {
			BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Menu");
			System.out.println("Escolha uma das opcoes abaixo: ");
			System.out.println("1 . Criar Cliente");
			System.out.println("2 . Criar Cliente(Pessoa Fisica)");
			System.out.println("3 . Criar Cliente(Pessoa Juridica)");
			System.out.println("4 . Pesquisar Cliente");
			System.out.print("Digite a opcao selecionada: ");
			@SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
			opcao = entrada.nextInt();			
			
			switch(opcao) {
				case 1: 
					Cliente cliente = new Cliente();
					System.out.print("Digite o nome: ");
					try {
						cliente.setNome(buffered.readLine()); 
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o endereco: ");
					try {
						cliente.setEndereco(buffered.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o telefone: ");
					try {
						cliente.setTelefone(Integer.parseInt(buffered.readLine()));
					} catch (IOException e) {
						e.printStackTrace();
					}
					clientes.add(cliente);
				break;
				
				case 2:
					PessoaFisica clienteFisico = new PessoaFisica();
					System.out.print("Digite o nome: ");
					try {
						clienteFisico.setNome(buffered.readLine()); 
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o endereco: ");
					try {
						clienteFisico.setEndereco(buffered.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o telefone: ");
					try {
						clienteFisico.setTelefone(Integer.parseInt(buffered.readLine()));
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o cpf: ");
					try {
						clienteFisico.setCpf(Integer.parseInt(buffered.readLine()));
					} catch (IOException e) {
						e.printStackTrace();
					}
					clientes.add(clienteFisico);
				break;
				
				case 3:
					PessoaJuridica clienteJuridico = new PessoaJuridica();
					System.out.print("Digite o nome: ");
					try {
						clienteJuridico.setNome(buffered.readLine()); 
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o endereco: ");
					try {
						clienteJuridico.setEndereco(buffered.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o telefone: ");
					try {
						clienteJuridico.setTelefone(Integer.parseInt(buffered.readLine()));
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o cnpj: ");
					try {
						clienteJuridico.setCnpj(Integer.parseInt(buffered.readLine()));
					} catch (IOException e) {
						e.printStackTrace();
					}
					System.out.print("Digite o nome fantasia: ");
					try {
						clienteJuridico.setNomeFantasia(buffered.readLine());
					} catch (IOException e) {
						e.printStackTrace();
					}
					clientes.add(clienteJuridico);
				break;
				
				case 4:
					int index = 0;
					System.out.println("*******************************");
					System.out.println("Clientes");
					System.out.println("*******************************");
					for(Cliente clienteCliente: clientes) {
						System.out.println(String.valueOf(index++) + " - " + clienteCliente.nome );
					}
					System.out.print("Digite o número do cliente desejado: ");
					int indexPesquisar = entrada.nextInt();
					System.out.println("*******************************");
					System.out.println(clientes.get(indexPesquisar).imprimeDados());
					System.out.println("*******************************");
				break;
			}
		}
	}
}