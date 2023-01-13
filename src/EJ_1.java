import java.util.Scanner;

public class EJ_1 {
	int[] notas;
	Scanner sc;

	public void pedirNotas(int cantidad) {
		sc = new Scanner(System.in);
		notas = new int[cantidad];
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Introduzca la nota del alumno %d: ", i + 1);
			notas[i] = sc.nextInt();
		}
	}
	//Programa este método para que calcule la diferencia entre la nota mas alta y la mas baja
	public void calcularDiferencia() {

		for (int x = 0; x < notas.length; x++) {
			for (int i = 0; i < notas.length - x - 1; i++) {
				if (notas[i] > notas[i + 1]) {
					int tmp = notas[i + 1];
					notas[i + 1] = notas[i];
					notas[i] = tmp;
				}
			}
		}
		int diferencia = notas[notas.length - 1] - notas[0];
		System.out.println("La diferencia es: " + diferencia);
	}

	public static void main(String[] args) {
		EJ_1 ejemplo = new EJ_1();
		int elementos = Integer.parseInt(args[0]);
		// Para introducir un numero debemos hacer botón derecho sobre la carpeta,
		// properties, pulsar el debug y meternos en el proyecto, pulsamos arguments y
		// ponemos un numero.
		ejemplo.pedirNotas(elementos);
		ejemplo.calcularDiferencia();
	}
}