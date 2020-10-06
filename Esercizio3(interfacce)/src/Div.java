import java.util.Scanner;
public class Div implements Operazione {
	
	
	
	Scanner tastiera = new Scanner(System.in);
	
	
	public double svolgiOperazione(double operando1,double operando2) {
		if(operando2 == 0) {
			System.out.println("La divisione per 0 non è consentita");
		double operando3 ;
		operando3 = tastiera.nextDouble();
		return operando1/operando3;}
		else
			return operando1/operando2;
	}



	


}
