package exercicios;

import java.util.Scanner;

public class VetorIntersecao {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 10;
	int a[], b[], c[], i, j, um = 0;
	
	a = new int[TAM];
	b = new int[TAM];
	c = new int[TAM];
	
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
	}
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor B: ");
		b[i] = ler.nextInt();
	}
	
	for(i=0; i<TAM; i++) {
		for(j=0; j<TAM; j++) {
			if(a[i] == b[j]) {  // calculo da intersacao entre A e B
				c[um] = a[i];
				um++;
			}
		}
	}
	
	// apresentacao do vetor A
	System.out.print("\n A = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(a[i] + " ");
	}
	System.out.print("]");
	
	// apresentacao do vetor B
	System.out.print("\n B = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(b[i] + " ");
	}
	System.out.print("]");
	
	// apresentacao do vetor C
	System.out.print("\n C = [ ");
	for(i=0; i<um; i++) {
		System.out.print(c[i] + " ");
	}
	System.out.print("]");
	
	ler.close();
}
}
