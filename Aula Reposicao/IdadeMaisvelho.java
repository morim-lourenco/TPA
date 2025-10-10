package aulaRepo;
import java.util.Scanner;
public class IdadeMaisvelho {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int idade1, idade2, maisVelho, maisNovo;
	String nome1, nome2;
	
	System.out.println("Digite sua idade: ");
	idade1 = ler.nextInt();
	System.out.println("Digite seu nome: ");
	nome1 = ler.next();
	
	System.out.println("Digite sua idade: ");
	idade2 = ler.nextInt();
	System.out.println("Digite seu nome: ");
	nome2 = ler.next();
	
	if (idade1 > idade2) {
		maisVelho = idade1;
		maisNovo = idade2;
		
		System.out.println("Esse é o mais velho: " + nome1);
		System.out.println("idade: " + maisVelho);
		
		System.out.println("E esse o mais novo: " + nome2);
		System.out.println("idade: " + maisNovo);
		
	} else if (idade2 > idade1) {
		maisVelho = idade2;
		maisNovo = idade1;
		
		System.out.println("Esse é o mais velho: " + nome2);
		System.out.println("idade: " + maisVelho);
		
		System.out.println("E esse o mais novo: " + nome1);
		System.out.println("idade: " + maisNovo);
	} else {
		System.out.println("Ambos têm a mesma idade");
	}
	ler.close();
}
}
