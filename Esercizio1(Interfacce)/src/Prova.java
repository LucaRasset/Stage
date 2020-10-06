import java.util.Scanner;
public class Prova {
public static void main(String[]args) {
	Scanner tastiera = new Scanner(System.in);
	System.out.println("Inserisci un intero ");
	int n = tastiera.nextInt();
	
	OggettoQuadrato oggetto = new OggettoQuadrato(n);
	System.out.println(oggetto.nuvoOggetto());
	
	OggettoCubo oggetto1 = new OggettoCubo(n);

	System.out.println(oggetto1.nuvoOggetto());
}
}
