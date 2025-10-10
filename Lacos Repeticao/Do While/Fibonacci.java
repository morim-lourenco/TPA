package atividades;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i=1,numero,atual,antes,proximo;
	atual = 1;
	antes = 1; //iniciando os dois valores pra conta dar certo
	
	System.out.println("Digite o numero de termos: ");
	numero = ler.nextInt();
	System.out.print(+i+","+i);
	do {
		proximo = atual + antes; // o calculo do proximo trem
		System.out.print(","+proximo);
		antes = atual;
		atual = proximo; //essas 2 partes atualizam os valores
		
		i++;
	} while(i<=numero);
}
}
