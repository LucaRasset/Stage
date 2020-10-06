import java.util.Scanner; 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ListaSpesa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tastiera = new Scanner(System.in);
	System.out.println("Inserisci i prodotti della spesa");
 int contatoreAlimentari = 1;
 int contatoreNonAlimentari = 1;
 int indice1 = 0;
 int indice2 = 0;
	Alimentari [] alimentari = new Alimentari [contatoreAlimentari];
	NonAlimentari[] nonAlimentari = new NonAlimentari[contatoreNonAlimentari];
 String risposta = "";
 String risposta1 = "";
 String codiceBarre = "";
 String descrizione = "";
 double prezzo = 0;
 String materiale;
 Date oggi = new Date();
 SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
 String dataScadenza;
 Alimentari prodotto;
 NonAlimentari prodotto1;
 int numeroAlimentari = 0;
 int numeroNonAlimentari = 0;
 

 
	while(!risposta.equalsIgnoreCase("no")) {
	System.out.println("Il prodotto è alimentare ?");
	risposta1 = tastiera.next();
	if(risposta1.equalsIgnoreCase("si")) {
		System.out.println("Inserisci il codice a barre");
		codiceBarre = tastiera.next();
		System.out.println("Inserisci la descrizione");
		descrizione = tastiera.nextLine();
		descrizione = tastiera.nextLine();
		System.out.println("Inserisci il prezzo");
		prezzo = tastiera.nextDouble();
		System.out.println("Inserisci la data di scadenza nel formato YYYY-MM-dd");
        dataScadenza = tastiera.next();
        prodotto = new Alimentari(codiceBarre,descrizione,prezzo,dataScadenza);
        alimentari[indice1] = prodotto;
        numeroAlimentari++;
        indice1++;
        contatoreAlimentari++;
        System.out.println("Vuoi inserire ancora prodotti ?");
        risposta = tastiera.next();}
	else {
		System.out.println("Inserisci il codice a barre");
		codiceBarre = tastiera.next();
		System.out.println("Inserisci la descrizione");
		descrizione = tastiera.nextLine();
		descrizione = tastiera.nextLine();
		System.out.println("Inserisci il prezzo");
		prezzo = tastiera.nextDouble();
		System.out.println("Inserisci il materiale del prodotto");
        materiale = tastiera.next();
        prodotto1 = new NonAlimentari(codiceBarre,descrizione,prezzo,materiale);
        nonAlimentari[indice2] = prodotto1;
        numeroNonAlimentari++;
        indice2++;
        System.out.println("Vuoi inserire ancora prodotti ?");
        risposta = tastiera.next();
        contatoreNonAlimentari++;

		
	}}

	
	double somma1 = 0;
	double somma2 = 0;
	double totale =0;
	
	String cartaFedelta;
	System.out.println("Hai la carta fedeltà ?");
	cartaFedelta = tastiera.next();
	
	if(cartaFedelta.equalsIgnoreCase("si")) {
		if(numeroAlimentari != 0) {
		for(int i = 0;i<alimentari.length;i++) {
			alimentari[i].applicaSconto();
		}}
		if(numeroNonAlimentari != 0) {
	    for(int j = 0;j < nonAlimentari.length;j++) {
	    	nonAlimentari[j].applicaSconto();}}
	    }
	
    if(numeroAlimentari != 0) {
	for(int k = 0 ; k <alimentari.length;k++) {
		somma1 = somma1 + alimentari[k].getPrezzo();
	}}
	
	 
	 if(numeroNonAlimentari != 0) {
	for(int u = 0; u<nonAlimentari.length;u++) {
		somma2 = somma2 + nonAlimentari[u].getPrezzo();
	}}
	
	
	totale = somma1 + somma2;
	System.out.println("Il totale è " + totale);
	
	
	}
	
	
	
	


		
}
