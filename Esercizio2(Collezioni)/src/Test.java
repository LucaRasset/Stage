import java.util.Scanner;

public class Test  {
public static void main (String[]args) throws TesseraNonValida {
	Scanner tastiera = new Scanner(System.in);
	Tessere tessere =  new Tessere();
	
	Tessera tessera1 = new Tessera(12,5.5);
	Tessera tessera2 = new Tessera(21,10.0);
	Tessera tessera3 = new Tessera(99,0.75);

	
	tessere.aggiungiTessera(tessera1);
	tessere.aggiungiTessera(tessera2);
	tessere.aggiungiTessera(tessera3);

	System.out.println("Inserisci il codice della tessera per sapere il credito");
	int codice = tastiera.nextInt();
	
 tessere.leggiCredito(codice);
	
	
	
	System.out.println("Vuoi ricaricare la tua tessera ?");
	String risposta = tastiera.next();
	
	if(risposta.equalsIgnoreCase("si"))
		tessere.caricaTessere();
	





}
}
