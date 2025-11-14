package exercicios;

import java.util.Scanner;

public class Vetor15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 5;
		int a[], b[], c[],i;
		
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
			
			if(a[i] > b[i]) {
				c[i] = 1;
			}
			else if(a[i] == b[i]) {
				c[i] = 0;
			}
			else {
				c[i] = -1;
			}
		}
		
		System.out.print("A = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("]");
		
		System.out.print("\n B = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.print("]");
		
		System.out.print("\n C = [ ");
		for(i=0; i<TAM; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.print("]");
		
		ler.close();
	}
}
