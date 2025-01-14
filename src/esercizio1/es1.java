package esercizio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class es1 {

	public static void funzione (){
		Scanner scanner=new Scanner(System.in);
		List<String> interi = new ArrayList<String>();
		System.out.println("Inseriesi il numero di elementi da inserire nella lista");
		int n= scanner.nextInt();
		for (int i=0; i<n;i++){
			System.out.println("inserisci parola n "+ (i+1));
			
		}
	}



}
