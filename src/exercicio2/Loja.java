package exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	/*
	 *  Crie uma hierarquia de classes de dom�nio para uma loja que venda livros, CDs e DVDs. Sobrescreva o m�todo toString() para que imprima:
	-	Para livros: nome, pre�o e autor;
	-	Para CDs: nome, pre�o e n�mero de faixas;
	-	Para DVDs: nome, pre�o e dura��o.

	Em seguida, crie uma classe Loja com o m�todo main() que adicione 5 produtos diferentes (a sua escolha) a um vetor e, por fim, imprima o conte�do do vetor. 
	*/
	public static void main(String[] args) {
		Livro livro1 = new Livro("Harry Potter", 10.99, "J. K. Rowling");
		Livro livro2 = new Livro("Engenharia de Software", 100.99, "PRESSMAN");
		CD cd1 = new CD("Reputation", 45, 15);
		CD cd2 = new CD("1989", 45, 13);
		DVD dvd1 = new DVD("Tinker Bell", 36, 120.2);
		
		List<Produto> lista = new ArrayList<>();
		lista.add(livro1);
		lista.add(livro2);
		lista.add(cd1);
		lista.add(cd2);
		lista.add(dvd1);
		System.out.println(lista.toString());
	}
}
