package exercicios;

import java.util.Scanner;

public class VetorRealacaopar {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 10;
	int a[], i, par;
	
	a = new int[TAM];
	
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
	}
	
	System.out.print("A = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.print("]");
	
	for(i=0; i<TAM; i++) {
		System.out.print("\n " +a[i]+ " e seus pares: ");
		
		for(par=0; par<=a[i]; par++) {
			if(par %2 == 0) {
				System.out.print(par+ " ");
			}
		}
	}
	
	ler.close();
}
}
