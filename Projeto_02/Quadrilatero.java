
public class Quadrilatero {

	public static void area(double lado) {

		System.out.println("Area do Quadrado: " + lado * lado);

	}

	public static void area(double lado1, double lado2) {

		System.out.println("Area do Retangulo " + lado1 * lado2);
	}

	public static void area(double baseMaior, double baseMenor, double altura) {

		System.out.println("Area do Trap�zio " + ((baseMaior + baseMenor) * altura) / 2);

	}

	public static void area(float diagonal1, float diagonal2) {

		System.out.println("�rea do losango:" + (diagonal1 * diagonal2) / 2);
	}

}
