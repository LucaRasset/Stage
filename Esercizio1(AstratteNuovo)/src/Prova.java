import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tastiera = new Scanner(System.in);
	
    String area;
	String altezza;
	
	
	
	
	System.out.println("Inserisci l'area ");
	area = tastiera.next();
	
	
	
	double area2 = 0;
	try {
		double valore = Double.parseDouble(area);
		area2 = Double.parseDouble(area);
	}catch(Exception e) {
		System.out.println("Hai inserito un valore non valido");
		System.out.println("Reinserisci l'area come valore numerico");
		area2 = tastiera.nextDouble();
	}


		
	

	System.out.println("Inserisci l'altezza ");
	altezza = tastiera.next();
	double altezza2 = 0;
	try {
		double valore = Double.parseDouble(altezza);
		altezza2 = Double.parseDouble(altezza);
	}catch(Exception e) {
		System.out.println("Hai inserito un valore non valido");
		System.out.println("Reinserisci l'altezza come valore numerico");
		altezza2 = tastiera.nextDouble();
	}
	
	
Solidi solido = new Solidi(area2,altezza2);
	
System.out.println(solido.toString());
	}

}
