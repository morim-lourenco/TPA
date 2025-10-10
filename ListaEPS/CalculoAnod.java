
public class CalculoAnod {
	public static void main(String args[]) {
		int dias, anos, meses;
		
		dias = 189;
		meses = dias/30;
		anos = dias/(meses*12);
		
		System.out.println("Meses = " + meses);
		System.out.println("Anos = " + anos);
	}
}
