import java.util.ArrayList;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) throws BevandaNonValida, CreditoInsufficiente, BevandaEsaurita {
		// TODO Auto-generated method stub

		Scanner tastiera = new Scanner(System.in);
		Distributore distributore = new Distributore();
		
		Bevanda bevanda1 = new Bevanda('A',"acqua",1.00);
		Bevanda bevanda2 = new Bevanda('B',"Coca",2.00);
		Bevanda bevanda3 = new Bevanda('C',"Birra",3.50);

		distributore.aggiungiBevanda(bevanda1);
        distributore.aggiungiBevanda(bevanda2);
		distributore.aggiungiBevanda(bevanda3);
		
		distributore.aggiornaColonna(1, "acqua", 5);
		distributore.aggiornaColonna(2, "Coca", 0);
		distributore.aggiornaColonna(3, "Birra", 10);
		distributore.aggiornaColonna(4, "Coca", 20);
		
		Tessera tessera1 = new Tessera(12,5.5);
		Tessera tessera2 = new Tessera(21,10.0);
		Tessera tessera3 = new Tessera(99,0.75);

		
		distributore.aggiungiTessera(tessera1);
		distributore.aggiungiTessera(tessera2);
		distributore.aggiungiTessera(tessera3);


		
		
		
		distributore.eroga();
		
		
		
	}

}
