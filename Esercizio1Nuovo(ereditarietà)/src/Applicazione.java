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
	int ore = 0;
	int id = 0;
	String cognomeStagista;
	String nomeStagista;
	String codiceFiscaleStagista;
	String cittàStagista;


Stagista[] array = new Stagista[3];
System.out.println("Inizializza 3 stagisti");
System.out.println("\n");
System.out.println("Inizializza il primo");
System.out.println("Inserisci il cognome");
cognomeStagista = tastiera.nextLine();
cognomeStagista = tastiera.nextLine();
System.out.println("Inserisci il nome ");
nomeStagista = tastiera.nextLine();
System.out.println("Inserisci il codice fiscale");
codiceFiscaleStagista = tastiera.next();
System.out.println("Inseisci la città ");
cittàStagista = tastiera.nextLine();
cittàStagista = tastiera.nextLine();
System.out.println("Inserisci il numero di ore di presenza");
ore = tastiera.nextInt();
System.out.println("Inserisci l'id dello stagista");
id = tastiera.nextInt();

Stagista stagista = new Stagista (cognomeStagista,nomeStagista,codiceFiscaleStagista,cittàStagista,ore,id);
array[0] = stagista;


System.out.println("Inizializza il secondo");
System.out.println("Inserisci il cognome");
cognomeStagista = tastiera.nextLine();
cognomeStagista = tastiera.nextLine();
System.out.println("Inserisci il nome ");
nomeStagista = tastiera.nextLine();
System.out.println("Inserisci il codice fiscale");
codiceFiscaleStagista = tastiera.next();
System.out.println("Inseisci la città ");
cittàStagista = tastiera.nextLine();
cittàStagista = tastiera.nextLine();
System.out.println("Inserisci il numero di ore di presenza");
ore = tastiera.nextInt();
System.out.println("Inserisci l'id dello stagista");
id = tastiera.nextInt();

Stagista stagista2 = new Stagista (cognomeStagista,nomeStagista,codiceFiscaleStagista,cittàStagista,ore,id);
array[1] = stagista2;

System.out.println("Inizializza il terzo");
System.out.println("Inserisci il cognome");
cognomeStagista = tastiera.nextLine();
cognomeStagista = tastiera.nextLine();
System.out.println("Inserisci il nome ");
nomeStagista = tastiera.nextLine();
System.out.println("Inserisci il codice fiscale");
codiceFiscaleStagista = tastiera.next();
System.out.println("Inseisci la città ");
cittàStagista = tastiera.nextLine();
cittàStagista = tastiera.nextLine();
System.out.println("Inserisci il numero di ore di presenza");
ore = tastiera.nextInt();
System.out.println("Inserisci l'id dello stagista");
id = tastiera.nextInt();

Stagista stagista3 = new Stagista (cognomeStagista,nomeStagista,codiceFiscaleStagista,cittàStagista,ore,id);
array[2] = stagista3;


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


