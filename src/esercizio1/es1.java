package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class es1 {

	public static void funzione() {
		Scanner scanner = new Scanner(System.in);
		Set<String> interi = new HashSet<>();
		Set<String> duplicati = new HashSet<>();

		System.out.println("Inseriesi il numero di elementi da inserire nella lista");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("inserisci la parola " + (i + 1));
			String parola = scanner.nextLine();
			if (!interi.add(parola)) {
				duplicati.add(parola);
			}

		}
		if (duplicati.isEmpty()) {
			System.out.println("nessuna parola duplicata");
		} else {
			System.out.println("parole duplicate" + duplicati);
		}
		;
		System.out.println("numero di parole salvate " + interi.size());
		System.out.println("elenco delle parole salvate " + interi);
	}

}
