package calculadora;

public class Main {

	public static void main(String[] args) {
		
		//Calculadora
		System.out.println("Exercício Calculadora");
		System.out.println("");
		
		Calculadora.soma(60, 75);
		Calculadora.subtracao(35, 15);
		Calculadora.divisao(42, 24);
		Calculadora.multiplicacao(50, 100);
		
		System.out.println("");
		System.out.println("");
		
		//Mensagem
		System.out.println("Exercício Mensagem");
		System.out.println("");
		
		Mensagem.obterMensagem(2);
		Mensagem.obterMensagem(5);
		Mensagem.obterMensagem(22);
		
		System.out.println("");
		System.out.println("");
		//Empréstimo
		
		System.out.println("Exercício Empréstimo");
		System.out.println("");
		
		Emprestimo.calcular(1000, 2);		
		Emprestimo.calcular(1000, 3);
		Emprestimo.calcular(1000, 5);	
		
		
		
	}

}
