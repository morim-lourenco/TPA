package atividades;

import java.util.Scanner;

public class Potencia {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i=1,base,expo,total;
	total = 1;
	
	System.out.println("Digite um número para o calculo da potencia: ");
	base = ler.nextInt();
	System.out.println("Digite o numero de vezes pro calculo, expoente: ");
	expo = ler.nextInt();
	do {
		total = total * base;
		i++;
	} while(i<=expo);
	
	System.out.println("O resultado é: " +total);
}
}
