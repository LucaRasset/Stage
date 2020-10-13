import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Distributore {
	Scanner tastiera = new Scanner (System.in);
	private List<Bevanda> distributore;
	
	public Distributore() {
		
		
		distributore = new ArrayList<Bevanda>();
	}


	public List<Bevanda> getDistributore() {
		return distributore;
	}

	public void setDistributore(ArrayList<Bevanda> distributore) {
		this.distributore = distributore;
	}


public void aggiungiBevanda(Bevanda bevanda) {
	
	distributore.add(bevanda);
	
}
public double getPrice(char codice) throws BevandaNonValida{
	boolean presente = false;
	double prezzo = 0;

	String codiceStringa;
	String codiceMaiuscolo;
	boolean codiceValido = false;
	while(codiceValido == false) {
	try{
		for(int i = 0;i<distributore.size();i++) {
	if(distributore.get(i).getCodice() == codice) {
	     prezzo=distributore.get(i).getPrezzo();
	 	codiceValido = true;}
	 if(codiceValido == false)
	    	throw new BevandaNonValida(); }

		}catch(Exception exc) {
			System.out.println("Il codice della bevanda non esiste");
			System.out.println("I codici delle bevande sono");
			for(int k = 0;k<distributore.size();k++)
				System.out.println(distributore.get(k).getCodice() + " " + distributore.get(k).getNome());
		System.out.println("Inserisci di nuovo il codice della bevanda");
		codiceStringa = tastiera.next();
		codiceMaiuscolo = codiceStringa.toUpperCase();
		codice = codiceMaiuscolo.charAt(0);
		
		}
	}
	
return prezzo;}

public String getName(char codice) throws BevandaNonValida {
	String nome = "";
	String codiceStringa;
	String codiceMaiuscolo;
boolean codiceValido= false;
	while(codiceValido == false) {
	try {
	
		for(int i = 0;i<distributore.size();i++) {
		if(distributore.get(i).getCodice() == codice) {
			
			 codiceValido = true;
			 nome  = distributore.get(i).getNome();}
	}	
		if(codiceValido == false)
			throw new BevandaNonValida();
	
	
	}catch(Exception exc) {
		System.out.println("Il codice della bevanda non esiste");
		System.out.println("I codici delle bevande sono");
		for(int k = 0;k<distributore.size();k++)
			System.out.println(distributore.get(k).getCodice() + " " + distributore.get(k).getNome());
	System.out.println("Inserisci di nuovo il codice della bevanda");
	codiceStringa = tastiera.next();
	codiceMaiuscolo = codiceStringa.toUpperCase();
	codice = codiceMaiuscolo.charAt(0);
		
	}
}
	
return nome;}


}
