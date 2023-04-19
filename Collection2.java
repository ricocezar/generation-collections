package PacoteJava;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Collection2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int n = ler.nextInt();
		
		boolean validacao;
		validacao = numeros.contains(n);
		
		if(validacao == true) {
			System.out.println("\nO número "+n+" foi encontrado!!!");
		}else {
			System.out.println("\nO número "+n+" não foi encontrado!!!");
		}

	}

}
