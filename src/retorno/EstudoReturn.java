package retorno;

public class EstudoReturn {

	public static double areaQuadrado(double lado) {
		return lado * lado;
	}

	public static double areaRetangulo(double lado1, double lado2) {
		return lado1 * lado2;
	}

	public static double areaTrapezio(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}

	public static float areaLosango(float diagonal1, float diagonal2) {
		return diagonal1 * diagonal2 / 2;

	}

}
