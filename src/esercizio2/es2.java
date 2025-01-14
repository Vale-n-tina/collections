package esercizio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.random;

public class es2 {

	public static void nRandom() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		List<Integer> numeriCasuali = new ArrayList<Integer>();
		System.out.println("inserisci quanti numeri casuali vuoi inserire nella lista");
		int qn = scanner.nextInt();
		for (int i = 0; i < qn; i++) {
			numeriCasuali.add(random.nextInt(101));
		}
		System.out.println(numeriCasuali);
		inverte(numeriCasuali);
		boolean pd = false;
		pariEdispari(numeriCasuali, pd);
	}

	public static void inverte(List<Integer> numeriCasuali) {
		List<Integer> listaInvertita = new ArrayList<>();
		for (int i = numeriCasuali.size() - 1; i >= 0; i--) {
			listaInvertita.add(numeriCasuali.get(i));
		}
		System.out.println(listaInvertita);
	}

	public static void pariEdispari(List<Integer> numeriCasuali, boolean pd) {
		if (pd) {
			for (int i = 0; i < numeriCasuali.size(); i++) {
				if (i % 2 == 0) {
					System.out.println("ecco i numeri pari " + numeriCasuali.get(i));
				}
			}
		}
		if (!pd) {
			for (int i = 0; i < numeriCasuali.size(); i++) {
				if (i % 2 != 0) {
					System.out.println("ecco i numeri dispari " + numeriCasuali.get(i));
				}
			}
		}

	}
}


