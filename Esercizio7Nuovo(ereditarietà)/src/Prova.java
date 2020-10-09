import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tastiera = new Scanner (System.in);

RegistrazioneAudio registro = new RegistrazioneAudio("",1,1);
Filmato supporto = new Filmato("",2,3,4);


ElementoMultimediale [] elementi = new ElementoMultimediale[5];
String titolo = "Ciao";
int durata = 0;
int luminosity = 0;
int indice =0;
int volume = 0;
int contatore = 1;
for(int i = 0; i< elementi.length;i++) {
	System.out.println("Inserisci il " + contatore + " file multimediale");
	contatore++;
	System.out.println("Inserisci una durata, 0 per le immagini");
	durata = tastiera.nextInt();
	System.out.println("Inserisci un titolo");
	titolo = tastiera.nextLine();
	titolo = tastiera.nextLine();
	
	if(durata == 0) {
		System.out.println("Inserisci la luminosità ");
		luminosity = tastiera.nextInt();
		Immagine immagine = new Immagine(titolo,durata,luminosity);
		elementi[indice]= immagine;
		indice++;
	}
	else if(durata != 0) {
		System.out.println("Vuoi inserire un audio o un filmato");
		String risposta;
		risposta = tastiera.next();
		if(risposta.equalsIgnoreCase("audio")){
			System.out.println("Inserisci il volume");
			volume = tastiera.nextInt();
			RegistrazioneAudio registrazione = new RegistrazioneAudio(titolo,durata,volume);
		elementi[indice]= registrazione;
		indice++;
		}
		else {
			System.out.println("Inserisci la luminosità");
			luminosity = tastiera.nextInt();
			System.out.println("Inserisci il volume");
			volume = tastiera.nextInt();
			Filmato filmato = new Filmato(titolo,durata,volume,luminosity);
		elementi[indice]= filmato;
		indice++;}
		}
	}
	
	

	int numero;
	System.out.println("Inserisci un numero da 1 a 5 , 0 per terminare");
	numero = tastiera.nextInt();
	
	while(numero != 0) {
	
		
		
		if(elementi[numero-1].getDurata() == 0) {
			Immagine immagine = (Immagine)elementi[numero-1];
			immagine.show();
			System.out.println("Vuoi regolare la luminosità");
			String risposta ;
			risposta = tastiera.next();
			if(risposta.equalsIgnoreCase("SI")) {
				System.out.println("Vuoi alzarla o abbassarla ?");
				String risposta2;
				risposta2 = tastiera.next();
				if(risposta2.equalsIgnoreCase("alzarla"))
					immagine.brighter();
				else
					immagine.darker();
			}
				
					
		}
		else if(elementi[numero -1].getClass() == registro.getClass()) {
			RegistrazioneAudio registro1 = (RegistrazioneAudio) elementi[numero-1];
		registro1.play();
		System.out.println("Vuoi regolare il volume ?");
		String risposta ;
		risposta = tastiera.next();
		if(risposta.equalsIgnoreCase("SI")) {
			System.out.println("Vuoi alzarlo o abbassarlo ?");
			String risposta2;
			risposta2 = tastiera.next();
			if(risposta2.equalsIgnoreCase("alzarlo"))
				registro1.louder();
			else
				registro1.weaker();
		}
		
		}
			
		
		else   {
	Filmato filmato1 = (Filmato) elementi[numero-1];
	filmato1.play();
	System.out.println("Vuoi regolare il volume ?");
	String risposta ;
	risposta = tastiera.next();
	if(risposta.equalsIgnoreCase("SI")) {
		System.out.println("Vuoi alzarlo o abbassarlo ?");
		String risposta2;
		risposta2 = tastiera.next();
		if(risposta2.equalsIgnoreCase("alzarlo"))
			filmato1.louder();
		else
			filmato1.weaker();
		
		
		}
	System.out.println("Vuoi regolare la luminosità ?");
	String risposta3 ;
	risposta3 = tastiera.next();
	if(risposta3.equalsIgnoreCase("SI")) {
		System.out.println("Vuoi alzarla o abbassarla ?");
		String risposta4;
		risposta4 = tastiera.next();
		if(risposta4.equalsIgnoreCase("alzarla"))
			filmato1.brighter();
		else
			filmato1.darker();
		
		
		}
	}
System.out.println("Inserisci un altro numero tra 1 e 5 per continuare o 0 per terminare");
numero = tastiera.nextInt();
}
}}