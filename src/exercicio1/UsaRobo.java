package exercicio1;

public class UsaRobo {
	//	1. Crie uma interface chamada Controle que especifique os m�todos �andar�, 
	//	�virar� e �falar� Crie uma classe chamada Robo que implemente esses m�todos. 
	//	Dentro de cada m�todo imprima uma mensagem em tela contendo a a��o correspondente. 
	//	Para testar, elabore uma terceira classe chamada UsaRobo.	
	public static void main(String[] args) {
		Robo robo = new Robo();
		robo.andar();
		robo.virar();
		robo.falar();
	}
}
