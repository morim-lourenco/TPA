package aulaRepo;
import java.util.Scanner;
public class Pesqueiro {
public static void main (String args[]) {
	Scanner ler = new Scanner(System.in);
	double peso, preco;
	
	System.out.println("Digite o peso do peixe: ");
	peso = ler.nextDouble();
	
	if (peso <= 3) {
		preco = 12.00;
		System.out.println("O preco do peixe é: " + preco);
	} 
	else if (peso > 3 && peso <=5) {
		preco = 14.00;
		System.out.println("O preco do peixe é: " + preco);
	}
	else if (peso > 5 && peso <= 10) {
		preco = 15.00;
		System.out.println("O preco do peixe é: " + preco);
	}
	else {
		preco = 17.00 + 8.00;
		System.out.println("O preco do peixe é: " + preco);
	}
	ler.close();
	
}
}
