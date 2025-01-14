package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class es3 {


	public static void inserimentoCoppia() {
		Map<Integer, String> rubricaTelefonica = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Quanti numeri teelfonici vuoi salvare?");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci il nome");
			String nome = scanner.nextLine();
			System.out.println("Inserisci il numero di telefono ");
			int numeroTelefono = scanner.nextInt();
			scanner.nextLine();
			rubricaTelefonica.put(numeroTelefono, nome);
		}
		System.out.println("Rubrica : " + rubricaTelefonica);

	}
}
