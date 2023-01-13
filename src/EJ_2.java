import java.util.Arrays;

public class EJ_2 {

	public static void main(String[] args) {
		int[] numeros = { 1, 4, 9, 7, 3, 2, 5, 11, 0, 9 };
		int numeros2[] = new int[numeros.length];
		int contar = 0;
		for (int i = numeros.length / 2; i < numeros.length; i++) {
			numeros2[contar] = numeros[i];
			contar++;
		}
		for (int i = 0; i < numeros.length / 2; i++) {
			numeros2[contar] = numeros[i];
			contar++;
		}
		System.out.println(Arrays.toString(numeros));
	}
}
