package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class es3 {
	private static Map<String, String> rubricaTelefonica = new HashMap<>();

	public static void inserimentoCoppia() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Quanti numeri teelfonici vuoi salvare?");
		int n = scanner.nextInt();
		scanner.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Inserisci il nome");
			String nome = scanner.nextLine();
			System.out.println("Inserisci il numero di telefono ");
			String numeroTelefono = scanner.nextLine();

			rubricaTelefonica.put(nome, numeroTelefono);
		}
		System.out.println("Rubrica : " + rubricaTelefonica);

	}

	public static void rimuovi(String nome){
		 rubricaTelefonica.remove(nome);
	}

	public static void trovaPErsonaByTelefono(String telefono){
		for(String nome:rubricaTelefonica.keySet()){
			if(telefono.equals(rubricaTelefonica.get(nome))){
				System.out.println("telefono trovato per " + nome);
				return;
			}
		}
	}

	public static void trovaTelefonoByPerona(String nome){
		String telefono=rubricaTelefonica.get(nome);

		if(telefono!=null){
			System.out.println(telefono);
		}else{
			System.out.println("persona non presente");
		}
	}
	public static void stampa(){
		for(String nome: rubricaTelefonica.keySet()){
			System.out.println("nome" + nome + ", telefono: " + rubricaTelefonica.get(nome));
		}
	}

}
