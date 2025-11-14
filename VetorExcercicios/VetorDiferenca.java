package exercicios;

import java.util.Scanner;

public class VetorDiferenca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[], b[], c[], i, j, num = 0;
		boolean igual;
		
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
			igual = false;
			
			for(j=0; j<TAM; j++) {
				if(a[i] == b[j]) {
					igual = true;
				}
			}
			if(igual == false) {
				c[num] = a[i];
				num++;
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
		for(i=0; i<num; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
		
		ler.close();
	}
}
