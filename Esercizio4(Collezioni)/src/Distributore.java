import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Distributore {
	
	Scanner tastiera = new Scanner(System.in);
	
	private List<Bevanda> distributore;
	private Map<Integer,Colonna> colonne;
	private ArrayList<Tessera> tessere;
	
	public Distributore() {
		
		tessere = new ArrayList<Tessera>();
		colonne = new HashMap<Integer,Colonna>();
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
	for(int i = 0;i<distributore.size();i++) {
		if(distributore.get(i).getCodice() == codice) {
			presente = true;
	     prezzo=distributore.get(i).getPrezzo();}
	}	
	if(presente == false)
		throw new BevandaNonValida("Il codice della bevanda non esiste");
return prezzo;}

public String getName(char codice) throws BevandaNonValida {
	String nome = "";
	
	boolean presente = false;
	for(int i = 0;i<distributore.size();i++) {
		if(distributore.get(i).getCodice() == codice) {
			presente = true;
	     nome  = distributore.get(i).getNome();}
	}	
	
	if(presente == false)
		throw new BevandaNonValida("Il codice della bevanda non esiste");
return nome;}



public void aggiornaColonna(int numeroColonna,String tipoBevanda,int numeroLattine) {
	Colonna colonna = new Colonna(tipoBevanda,numeroLattine);
	colonne.put(numeroColonna,colonna);
}


public int lattineDisponibili(char codice) throws BevandaNonValida {
	String tipo = getName(codice);
	int numeroLattine = 0;
	for(int i = 1;i<colonne.size()+1;i++) {
		if(colonne.get(i).getTipo().equalsIgnoreCase(tipo))
			numeroLattine = numeroLattine + colonne.get(i).getNumeroLattine();}
	
	
	
	return numeroLattine;
	
}



public double leggiCredito(int codice) throws TesseraNonValida {
double credito = 0;
boolean presente = false;
for(int i = 0;i<tessere.size();i++) {
	if(tessere.get(i).getCodice() == codice) {
		presente = true;
		credito = tessere.get(i).getCredito();
		System.out.println("Il tuo credito è " + credito);}
}
if(presente == false )
	throw new TesseraNonValida("Codice non esistente");
return credito;}


public void aggiungiTessera(Tessera tessera) {
	tessere.add(tessera);
}


public void caricaTessere() {
	System.out.println("Inserisci il codice della tessera che vuoi ricaricare");
	int codice = tastiera.nextInt();
	System.out.println("Di quanto vuoi ricaricare la tessera ?");
	int ricarica  = tastiera.nextInt();
	double residuo = 0;
	
	for(int i = 0;i<tessere.size();i++) {
		if(tessere.get(i).getCodice() == codice) {
			residuo = tessere.get(i).getCredito();
			tessere.get(i).setCredito(residuo + ricarica);
			System.out.println("Il nuovo credito è " + tessere.get(i).getCredito());}}

}


public int eroga() throws  CreditoInsufficiente, BevandaEsaurita, BevandaNonValida {
	
	System.out.println("Inserisci il codice della bevanda ");
	String codiceString = tastiera.next();
	String maiuscolo = codiceString.toUpperCase();
	char codice = maiuscolo.charAt(0);
	
	System.out.println("Inserisci il numero della tessera con la quale si desidera pagare");
	int numero = tastiera.nextInt();
	
	double prezzo = 0 ;
	
	for(int i = 0;i<distributore.size();i++) {
		if(distributore.get(i).getCodice() == codice)
			prezzo = distributore.get(i).getPrezzo();}
	
double credito = 0;


for(int i = 0;i<tessere.size();i++) {
	if(tessere.get(i).getCodice() == numero)
		credito = tessere.get(i).getCredito();}

String nome = ""  ;
for(int i = 0;i<distributore.size();i++) {
	if(distributore.get(i).getCodice() == codice)
		nome = distributore.get(i).getNome();
}


int numeroLattine = lattineDisponibili(codice);




if(credito < prezzo)
	throw new CreditoInsufficiente("Il credito non è sufficiente");

if(numeroLattine == 0)
	throw new BevandaEsaurita("La bevanda è esaurita");

int chiave  = 0;

if(numeroLattine > 0 && credito > prezzo) {
	numeroLattine = numeroLattine - 1;
credito = credito - prezzo;}

System.out.println("Il tuo nuovo credito è " + credito);
System.out.println("Il numero di lattine ora disponibili è " + numeroLattine);
	

int contatore = 1;

	for(int i = 1;i<colonne.size()+1;i++) {
	if(colonne.get(i).getTipo().equalsIgnoreCase(nome)) {
		if(colonne.get(i).getNumeroLattine() > 0)
		chiave = contatore;	
	}


contatore++;}

System.out.println("La bevanda è stata erogata dalla colonna numero " + chiave);

return chiave;

}





}




