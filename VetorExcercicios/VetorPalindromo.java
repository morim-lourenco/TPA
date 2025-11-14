package exercicios;

import java.util.Scanner;

public class VetorPalindromo {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 5;
	int a[], i, j;
	boolean palind = false;
	
	a = new int[TAM];
	
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
		//leitura do vetor A
	}
	
	for(i=0; i<TAM; i++) {
		j = TAM -1;
		
		if(a[i] == a[j]) {
			palind = true;
		}
		else {
			palind = false;
		}
		j--;
	}
	
	System.out.print("A = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.print("]");
	
	if(palind == true) {
		System.out.println("\n É um palindromo" );
	}
	else {
		System.out.println("\n Não é um palindromo");
	}
	
}
}
