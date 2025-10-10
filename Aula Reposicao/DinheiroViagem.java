package aulaRepo;
import java.util.Scanner;
public class DinheiroViagem {
public static void main (String args[]) {
	Scanner ler = new Scanner (System.in);
	double dinheiro, reais, euro, dolar, peso_argentino;
	String viagem = "nacional, europeia, norte americana, sul americana";
	
	System.out.println("Digite a quantidade de dinheiro que sera levada: ");
	dinheiro = ler.nextDouble();
	
	System.out.println("Digite o local da viagem: ");
	viagem = ler.next();
	
	reais = dinheiro + 0;
	euro = dinheiro * 0.16;
	dolar = dinheiro * 0.18;
	peso_argentino = dinheiro * 243.82;
	
	if (viagem.equalsIgnoreCase("nacional")) {
		dinheiro = reais;
		System.out.println("O valor convertido para essa região foi: " + dinheiro);
	}
	else if (viagem.equalsIgnoreCase("europeia")) {
		dinheiro = euro;
		System.out.println("O valor convertido para essa regiao foi: " + dinheiro);
	}
	else if (viagem.equalsIgnoreCase("norte americana")) {
		dinheiro = dolar;
		System.out.println("O valor convertido para essa região foi: " + dinheiro);
	}
	else if (viagem.equalsIgnoreCase("sul americana")) {
		dinheiro = peso_argentino;
		System.out.println("O valor convertido para essa região foi: " + dinheiro);
	}
	
}
}
