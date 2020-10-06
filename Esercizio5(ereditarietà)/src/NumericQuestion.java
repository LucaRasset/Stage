import java.util.Scanner;
public class NumericQuestion extends Question{
	
	Scanner tastiera = new Scanner(System.in);
	
	public NumericQuestion(String domanda, String rispostaCorretta, int punteggio) {
		super(domanda, rispostaCorretta, punteggio);
		// TODO Auto-generated constructor stub
	}


	
	@Override
	public int ask() {
		System.out.println(super.getDomanda());
		String rispostaCorretta = super.getRispostaCorretta();
		System.out.println("Inserisci la risposta");
		System.out.println("Può essere solo una risposta numerica");
		double risposta = tastiera.nextDouble();
		
	 
	int rispostaNumero = Integer.parseInt(rispostaCorretta);
	
	if(risposta == rispostaNumero)
		return 1;
	else
		return 0;
		
		
	}
	
	
	

}
