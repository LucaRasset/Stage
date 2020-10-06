import java.util.Scanner;
public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tastiera = new Scanner(System.in);
	double area;
	double altezza;
	
	
	System.out.println("Inserisci l'area ");
	area = tastiera.nextDouble();
	
	
	System.out.println("Inserisci l'altezza ");
	altezza = tastiera.nextDouble();
	
	
Solidi solido = new Solidi(area,altezza);
	
System.out.println(solido.toString());
	}

}
