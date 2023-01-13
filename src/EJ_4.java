import java.util.Arrays;
import java.util.Scanner;

public class EJ_4 {

	public static boolean casoDePrueba(Scanner in) {
		// Variable que controla si el caso hay que analizarlo o finaliar
		boolean continuar = true;
		// Se lee la candidad de piezas o el caso especial que es 0
		System.out.println("Num piezas: ");
		int cantidad = in.nextInt();
		// Si es el caso especial, no se ejecuta nada y continuar = false
		if (cantidad == 0)
			continuar = false;
		else {
			// Declaración del array (tiene una pieza menos)
			int[] puzzle = new int[cantidad - 1];
			// Lectura de las piezas del puzzle
			for (int i = 0; i < puzzle.length; i++) {
				puzzle[i] = in.nextInt();
			}
			// Ordeno el Array
			Arrays.sort(puzzle);
			// Proceso -> Busco la pieza perdida
			int pieza = 0;
			// Puede ser la primera la que falta (si es diferente de 1)
			// Puede ser la última la que falte (si es diferente de la cantidad)
			// También puede falta una del medio
			// Salida

			while (continuar) {
				if (puzzle[0] != 1) {
					continuar = false;
					pieza = 1;
				} else if (puzzle[puzzle.length - 1] != cantidad) {
					pieza = cantidad;
					continuar = false;
				} else {
					for (int i = 1; i < puzzle.length; i++) {
						if (puzzle[i] - puzzle[i - 1] > 1) {
							pieza = puzzle[i] - 1;
							continuar = false;
						}
					}
				}

			}
			System.out.println(pieza);
		}
		return continuar;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Casos de prueba limitado por un caso especial
		while (casoDePrueba(in));
	}

}