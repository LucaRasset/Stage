import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Tessere{
Scanner tastiera = new Scanner(System.in);
	private List<Tessera> tessere;
	
	public Tessere() {
		tessere = new ArrayList<Tessera>();
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

}