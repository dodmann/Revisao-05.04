package exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	/* 
	 * Crie a seguinte hierarquia de classes:
		-	Uma interface para representar qualquer forma geométrica, definindo métodos para cálculo do perímetro e cálculo da área da forma;
		-	Uma classe abstrata para representar quadriláteros. Seu construtor deve receber os tamanhos dos 4 lados e o método de cálculo do perímetro já pode ser implementado;
		-	Classes para representar retângulos e quadrados. A primeira deve receber o tamanho da base e da altura no construtor, enquanto a segunda deve receber apenas o 
			tamanho do lado;
		-	Uma classe para representar um círculo. Seu construtor deve receber o tamanho do raio.

		No programa principal, pergunte ao usuário quantas formas ele deseja criar. Em seguida, para cada forma, pergunte se deseja criar um quadrado, um retângulos ou um 
		círculo, solicitando os dados necessários para criar a forma. Todas as formas criadas devem ser armazenadas em um vetor. Finalmente, imprima: 

		a)	os dados (lados ou raio); 
		b)	os perímetros; e 
		c)	as áreas de todas as formas
	*/
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("*******************************");
		System.out.println("Menu");
		System.out.println("*******************************");
		System.out.print("Digite a quantidade de formas que voce deseja criar: ");
		int qtdFormas = entrada.nextInt();
		ArrayList<FormaGeometrica> objetos = new ArrayList<FormaGeometrica>();
		System.out.println(" ");
		for(int i = 1; i <= qtdFormas; i++) {
			Scanner entradaFor = new Scanner(System.in);
			System.out.print("Digite 1 para criar um retangulo 2 para criar um quadrado e 3 para criar um circulo: ");
			int numForma = entradaFor.nextInt();
			int pos;
			int n = 2;
			double lados[] = new double[n];
			switch(numForma) {
				/*
				 * Retangulo
				 */
				case 1:
					Scanner ladoRet = new Scanner(System.in);
					System.out.println("\n*******************************");
					System.out.println("Retangulo");
					System.out.println("*******************************");
					for(pos = 1; pos <= n; pos++ ) {
						System.out.print("Digite o valor do lado "+pos+": ");
						lados[pos-1] = ladoRet.nextInt();
					}
					System.out.println("*******************************\n");
					Retangulo retangulo = new Retangulo(lados[0], lados[1], lados[0], lados[1], lados[0], lados[1]);
					objetos.add(retangulo);
				break;
				/*
				 * Quadrado
				 */
				case 2:
					Scanner ladoQuad = new Scanner(System.in);
					System.out.println("\n*******************************");
					System.out.println("Quadrado");
					System.out.println("*******************************");
					System.out.print("Digite o valor do lado: ");
					double lado = ladoQuad.nextDouble();
					System.out.println("\n*******************************\n");
					Quadrado quadrado = new Quadrado(lado, lado, lado ,lado, lado);
					objetos.add(quadrado);
				break;
				/*
				 * Circulo
				 */
				case 3:
					Scanner raioCirc = new Scanner(System.in);
					System.out.println("\n*******************************");
					System.out.println("Circulo");
					System.out.println("*******************************");
					System.out.print("Digite o valor do raio: ");
					double raioCirculo = raioCirc.nextDouble();
					System.out.println("*******************************\n");
					Circulo circulo = new Circulo(raioCirculo);
					objetos.add(circulo);
				break;
				/*
				 * Default
				 */
				default:
					System.out.println("*******************************");
					System.out.println("Opcao invalida.");
					System.out.println("*******************************");
					//Fazer com que a opcao invalida nao impacte na quantidade de formas criadas
					i--;
				break;
			}
			entradaFor.close();
		}
		int i = 1;
		System.out.println("Resultados");
		System.out.println("*******************************");
		for(FormaGeometrica objeto: objetos) {
			if(objeto.getClass().getSimpleName().toLowerCase().equals("quadrado")){
				System.out.print("Lados do quadrado: "+ i + ": \n");
				for (int n = 1; n < 5; n++)
					System.out.println(n + ": " + ((Quadrado) objeto).getL());
				
			}
			if(objeto.getClass().getSimpleName().toLowerCase().equals("retangulo")){
				System.out.print("Lados do retangulo: "+ i + ": \n");
				for (int n = 1; n < 3; n++) {
					System.out.println(n + ": " + ((Retangulo) objeto).getB());
					System.out.println(n + ": " + ((Retangulo) objeto).getH());
				}			
			}
			if(objeto.getClass().getSimpleName().toLowerCase().equals("circulo")){
				System.out.println("Raio do circulo: "+ i + ": " + ((Circulo) objeto).getRaio());
			}
			System.out.println("Area do " + objeto.getClass().getSimpleName().toLowerCase() + " "+  i + ": " + objeto.calcularArea());
			System.out.println("Perimetro do " + objeto.getClass().getSimpleName().toLowerCase() + " "+  i + ": " + objeto.calcularPerimetro());
			System.out.println("*******************************");
			i++;
		}
		entrada.close();
	}
}
