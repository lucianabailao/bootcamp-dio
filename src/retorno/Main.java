package retorno;



public class Main {

	public static void main(String[] args) {
		
		System.out.println("Exerc�cio sobrecarga do m�todo");
		System.out.println("");
		
		
		double areaQuadrado = EstudoReturn.areaQuadrado(4);
		System.out.println("Quadrado " + areaQuadrado);
		System.out.println("");
		
		
		double areaRetangulo = EstudoReturn.areaRetangulo(5, 7);
		System.out.println("Ret�ngulo " + areaRetangulo);
		System.out.println("");
		
		
		double areaTrapezio = EstudoReturn.areaTrapezio(5, 3, 2);
		System.out.println("Trap�zio " + areaTrapezio);
		System.out.println("");
		
		
		float areaLosango = EstudoReturn.areaLosango(8, 10);
		System.out.println("Losango " + areaLosango);
		
		
		
		
	}

}
