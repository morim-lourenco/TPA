package atividades;

import java.util.Scanner;

public class Idade25 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int i,idade,idade50,idade20,velha,nova;
	double peso,altura,somaAltura,mediaAltura,peso40,porcentagem;
	
	idade50 = 0;
	idade20 = 0;
	somaAltura = 0;
	peso40 = 0;
	velha = 0;
	nova = 0;
	mediaAltura = 0;
	porcentagem = 0;
	
	for (i=1; i<=25; i++) {
		System.out.println("Digite a idade da " +i+ " pessoa: ");
		 idade = ler.nextInt();
		System.out.println("Digite o peso da " +i+ " pessoa: ");
		 peso = ler.nextDouble();
		System.out.println("Digite a altura da " +i+ " pessoa: ");
		 altura = ler.nextDouble();
		 
		 if (i==1) {
			 velha = idade;
			 nova = idade;
		 } else {
			 if (idade>velha) {
				 velha = idade;
			 }
			 else if (idade<nova) {
				 nova = idade;
			 }
		 }
		 
		 if (idade>=50) {
			 idade50 = idade50 + 1;
		 }
		 
		 if (idade>=10 && idade<=20) {
			 idade20 = idade20 + 1;
			 somaAltura = somaAltura + altura;
		 }
		 
		 if (peso<40.00) {
			 peso40 = peso40 + 1;
		 }
	}

	if (idade20 > 0) {
		 mediaAltura = somaAltura / idade20;
	} else {
		System.out.println("Não tem ninguem de 10 a 20 anos");
	}

	 porcentagem = (peso40 / 25) * 100;
	 
	// esses calculos so estao fora pq senao o codigo refaz o calculo sempre outro dado e inserido
	 
	 
	System.out.println("Tem " +idade50+ " pessoas maiores de 50 anos");
	System.out.println("A media da altura entre 10 e 20 anos é: " +mediaAltura);
	System.out.println("A porcentagem de pessoas com menos de 40 quilos: " +porcentagem);
	System.out.println("A pessoa mais velha " +velha+ " e a mais nova: " +nova);
	
	ler.close();
}
}
