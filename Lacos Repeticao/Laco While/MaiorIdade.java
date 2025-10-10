package atividades;

import java.util.Scanner;
public class MaiorIdade {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int idade,maior=0,menor=0,i=1;
	
	while(i<=5) {
		System.out.println("Digite a idade da " +i+ " pessoa: ");
		idade = ler.nextInt();
		
		if(idade<18) {
			menor = menor + 1;
		}
		else if(idade>=18) {
			maior = maior + 1;
		}
		i = i+1;
	} System.out.println("Tem " +menor+ " pessoas que são menor de idade e " +maior+ " que são maior de idade");
}
}
