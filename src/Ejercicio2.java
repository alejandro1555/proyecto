
public class Ejercicio2 {

	public static void main(String[] args) {
		double maximo = maximo(1,2,3);
		Imprimir_pantalla(maximo);
	}

	private static void Imprimir_pantalla(double maximo) {
		System.out.println("El maximo es: "+maximo);
	}

	public static double maximo (double... num) {
		double mayor = num[0];
		for (int i = 0; i < num.length; i++) {
			if (num[i] > mayor) {
				mayor = num[i];
			}
		}
		return mayor;
	}
}
