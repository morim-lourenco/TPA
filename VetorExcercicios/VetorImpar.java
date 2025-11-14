package exercicios;

import java.util.Scanner;

public class VetorImpar {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAM = 20;
	int a[],b[],i,par = 0, impar = TAM-1;
	
	a = new int[TAM];
	b = new int[TAM];
	
	for(i=0; i<TAM; i++) {
		System.out.println("Digite o " +(i+1)+ "° valor do vetor A: ");
		a[i] = ler.nextInt();
		
		if(a[i] %2 == 0) {
			b[par] = a[i]; // essa parte garante que o proximo espaço no vetor fique vazio e nao com valor 0
			par++; // essa variavel serve de contador para os numeros pares
		}
		else {
			b[impar] = a[i];
			impar--; // a mesma coisa mas para numeros impares
		}
	}
	
	System.out.print("B = [ ");
	for(i=0; i<TAM; i++) {
		System.out.print(b[i] + " ");
	}
	System.out.print("]");
	
	ler.close();
}
}
