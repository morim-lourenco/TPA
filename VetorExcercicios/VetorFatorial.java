package exercicios;

import java.util.Scanner;

public class VetorFatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 5;
		int a[],b[], i, h , fatorial, acumula;
		
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
			a[i] = ler.nextInt();
		}
		
		for(i=0; i<TAM; i++) {
			fatorial = a[i];
			acumula = 1;
			
			for(h=1; h<=fatorial; h++) {
				acumula = acumula * h;
				b[i] = acumula;
			}
		}
		
		System.out.print("\n B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		
		ler.close();
	}
}
