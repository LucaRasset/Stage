import java.util.Scanner;
public class Prova  {
	public static void main(String[]args) {
		Operazione operazione;

	Scanner tastiera = new Scanner (System.in);
	double operando1;
	double operando2;
	
	System.out.println("Inserisci il primo operando");
	operando1 = tastiera.nextDouble();
	System.out.println("Inserisci il secondo operando");
	operando2 = tastiera.nextDouble();
	
	
System.out.println("Che operazione vuoi svolgere ?");
String risposta = tastiera.nextLine();
risposta = tastiera.nextLine();
		
	if(risposta.equalsIgnoreCase("moltiplicazione")) {
	operazione = new Mul();
	double risultato;
	risultato = operazione.svolgiOperazione(operando1, operando2);
	 System.out.println(risultato);
	}
	else if(risposta.equalsIgnoreCase("divisione"))	{
		operazione = new Div();
		double risultato;
		risultato = operazione.svolgiOperazione(operando1, operando2);
		System.out.println(risultato);
		
	}
	else
		operazione = new Sub();
		System.out.println(operazione.svolgiOperazione(operando1, operando2));}
	

}
