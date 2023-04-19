package PacoteJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Collection1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();
		
		
		for(int i=0; i<5;i++) {
			System.out.println("\nDigite a cor de número "+(i+1)+" :");
			String cor = ler.nextLine();
			cores.add(cor);
		}
		
		Iterator<String> iterator = cores.iterator();
		
		System.out.println("\nListar todas as cores: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		Collections.sort(cores);
		System.out.println("\nCores Ordenadas");
		System.out.println("\n"+cores);
	}

}
