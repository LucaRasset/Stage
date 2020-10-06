import java.util.Scanner;
public class DadoMoneta2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner tastiera = new Scanner(System.in);
	
	System.out.println("Vuoi lanciare un dado o una moneta ");
	String risposta = tastiera.next();
	
	if(risposta.equalsIgnoreCase("dado")) {
		Dado dado = new Dado();
		dado.LancioDado();
	}
	else {
		Moneta moneta = new Moneta();
		moneta.LancioMoneta();
	}
	}

}
