import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tastiera = new Scanner(System.in);
	
    String area;
	String altezza;
	
	
	
	
	System.out.println("Inserisci l'area ");
	area = tastiera.next();
	
	
	



   double area1 = 0 ;
	boolean risultato = false;
	
while(risultato == false) {
	try {
		double  valore = Double.parseDouble(area);
		area1 = Double.parseDouble(area);
		risultato = true;
	}catch(Exception e) {
		System.out.println("Hai inserito un valore non valido");
		System.out.println("Reinserisci l'area come valore numerico");
		 area= tastiera.next();
		 
	}}


		
	

	System.out.println("Inserisci l'altezza ");
	altezza = tastiera.next();
	
	boolean risultato1 = false;
	double altezza2 = 0;
	while(risultato1 == false) {
	try {
		double valore = Double.parseDouble(altezza);
		altezza2 = Double.parseDouble(altezza);
		risultato1 = true;
	}catch(Exception e) {
		System.out.println("Hai inserito un valore non valido");
		System.out.println("Reinserisci l'altezza come valore numerico");
		altezza = tastiera.next();
	}}
	
	
Solidi solido = new Solidi(area1,altezza2);
	
System.out.println(solido.toString());
	}

}
