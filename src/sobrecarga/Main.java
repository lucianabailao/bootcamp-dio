package sobrecarga;

public class Main {

	public static void main(String[] args) {
		//Sobrecarga de m�todo
		
		System.out.println("Exerc�cio sobrecarga do m�todo");
		System.out.println("");
		
		System.out.println("Quadrado");
		SobrecargaDeMetodo.area(4);
		System.out.println("");
		
		System.out.println("Ret�ngulo");
		SobrecargaDeMetodo.area(4, 8);
		System.out.println("");
		
		System.out.println("Trap�zio");
		SobrecargaDeMetodo.area(10, 5,3);
		System.out.println("");
		
		System.out.println("Losango");
		SobrecargaDeMetodo.area(5f, 5f);
	}

}
