package exercicios;

import java.util.Scanner;

public class VetorPotencia {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 10;
	int a[], i, potencia = 1;
	
	a = new int[TAM];
	
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
	}
	
	for(i=0; i<TAM; i++) {
		a[i] = potencia;
		potencia = potencia * 2;
	}
	
	System.out.print("VAlor final dos elemento A = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.print("]");
	
	ler.close();
}
}
