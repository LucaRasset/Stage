import java.util.ArrayList;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) throws BevandaNonValida {
		// TODO Auto-generated method stub

		Scanner tastiera = new Scanner(System.in);
		Distributore distributore = new Distributore();
		
		Bevanda bevanda1 = new Bevanda('A',"acqua",1.00);
		Bevanda bevanda2 = new Bevanda('B',"Coca",2.00);
		Bevanda bevanda3 = new Bevanda('C',"Birra",3.50);

		distributore.aggiungiBevanda(bevanda1);
        distributore.aggiungiBevanda(bevanda2);
		distributore.aggiungiBevanda(bevanda3);
		
		System.out.println("Inserisci il codice delle bevanda per saperne il prezzo");
		String codiceStringa = tastiera.next();
		
		codiceStringa = codiceStringa.toUpperCase();
		char codice = codiceStringa.charAt(0);

		
		
		System.out.println("Il costo della bevanda è " + distributore.getPrice(codice)+ " euro");
		

		System.out.println("Inserisci il codice delle bevanda per sapere il nome");
		
 codiceStringa = tastiera.next();
		
		codiceStringa = codiceStringa.toUpperCase();
	codice = codiceStringa.charAt(0);
		
		System.out.println("Il nome della bevanda è " + distributore.getName(codice));
		
	}

}
