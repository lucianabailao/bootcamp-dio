package sobrecarga;

public class SobrecargaDeMetodo {

	public static void area(double lado) {
		System.out.println("A �rea do quadrado �: " + lado * lado);
	}

	public static void area(double lado1, double lado2) {
		System.out.println("A �rea do ret�ngulo �: " + lado1 * lado2);
	}

	public static void area(double baseMaior, double baseMenor, double altura) {
		System.out.println("A �rea do trap�zio �: " + ((baseMaior + baseMenor) * altura / 2));
	}
}