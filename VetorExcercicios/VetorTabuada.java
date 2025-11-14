package exercicios;

import java.util.Scanner;

public class VetorTabuada {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 5;
	int a[],b[],i;
	
	a = new int[TAM];
	b = new int[TAM];
	
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
		
		b[i] = a[i] * a[i];
	}
	
	System.out.print("B = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(b[i] + " ");
	}
	System.out.print("]");
	
	ler.close();
}
}
