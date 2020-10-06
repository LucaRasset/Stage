import java.util.Scanner;
import java.util.Date;
public class Applicazione {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisci i dati di una persona");
		System.out.println("Inserisci un cognome");
		String cognome;
		cognome = tastiera.next();
		System.out.println("Inserisci un nome");
		String nome;
		nome = tastiera.next();
		System.out.println("Inserisci il codice fiscale");
		String codiceFiscale;
		codiceFiscale = tastiera.next();
		System.out.println("Inserisci la città di nascita");
		String città;
		città = tastiera.next();
Person persona = new Person(cognome,nome,codiceFiscale,città);
System.out.println("Nome " + persona.getName() + " Cognome " + 
persona.getSurname() + " Anno di nascita " + persona.bornYear(codiceFiscale));
	
	int numero;
	numero = 1;
Stagista[] array = new Stagista[3];
System.out.println("Inizializza 3 stagisti");
for(int i = 0; i<3;i++) {
	System.out.println("Inserisci i dati del " + numero + " stagista");
	numero++;
	System.out.println("Inserisci un cognome");
	String cognomeStagista;
	cognomeStagista = tastiera.next();
	System.out.println("Inserisci un nome");
	String nomeStagista;
	nomeStagista = tastiera.next();
	System.out.println("Inserisci il codice fiscale");
	String codiceFiscaleStagista;
	codiceFiscaleStagista = tastiera.next();
	System.out.println("Inserisci la città di nascita");
	String cittàStagista;
	cittàStagista = tastiera.next();
	System.out.println("Inserisci il numero di ore di presenza");
	int ore = tastiera.nextInt();
	System.out.println("Inserisci l'ID dello stagista");
	int id = tastiera.nextInt();
	Stagista stagista = new Stagista(cognomeStagista,nomeStagista,codiceFiscaleStagista,cittàStagista,ore,id);
	array[i] = stagista;
}
Date oggi = new Date();
int giovane;
giovane = array[0].getIdNumber();
int minimo;
minimo = oggi.getYear() - array[0].bornYear(array[0].getTaxCode());
for(int i = 1; i<3; i++) {
	if((oggi.getYear()-array[i].bornYear(array[i].getTaxCode())) > minimo) {
		minimo = oggi.getYear() - array[i].bornYear(array[i].getTaxCode());
	giovane = array[i].getIdNumber();}}
System.out.println("ID stagista più giovane " + giovane);
}
	
	}


