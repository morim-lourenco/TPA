package exercicios;

import java.util.Scanner;

public class VetorPrimo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[],i,h;
		boolean primo = true;
		
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
			primo = true;
			
			if(a[i] <= 1) {
				primo = false;
			}
			
			if(primo) {
				for(h=2; h*h <= a[i]; h++) {
					if(a[i] %h == 0) {
						primo = false;
						break;
					}
				}	
			}
			
			if(primo == true) {
				System.out.println(a[i]+ " Esse é primo");
			}
			else {
				System.out.println(a[i]+ " Não é primo");
			}
		}
		
		
		ler.close();
}
}