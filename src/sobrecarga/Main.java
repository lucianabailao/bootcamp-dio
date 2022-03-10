package sobrecarga;

public class Main {

	public static void main(String[] args) {
		//Sobrecarga de método
		
		System.out.println("Exercício sobrecarga do método");
		System.out.println("");
		
		System.out.println("Quadrado");
		SobrecargaDeMetodo.area(4);
		System.out.println("");
		
		System.out.println("Retângulo");
		SobrecargaDeMetodo.area(4, 8);
		System.out.println("");
		
		System.out.println("Trapézio");
		SobrecargaDeMetodo.area(10, 5,3);
		System.out.println("");
		
		System.out.println("Losango");
		SobrecargaDeMetodo.area(5f, 5f);
	}

}
