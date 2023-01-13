import java.util.Scanner;

public class EJ_3 {

	public static void casoDePrueba(Scanner in) {

		int daysMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("dia:");
		int day = in.nextInt();
		System.out.println("mes:");
		int month = in.nextInt();
		int total = 0;

		total = daysMonth[month - 1] - day;
		System.out.println("Dias faltantes: " + total);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("NUMERO DE CASOS : ");
		int numCasos = Integer.parseInt(in.nextLine());
		for (int i = 0; i < numCasos; i++) {
			casoDePrueba(in);
		}
	}

}
	



