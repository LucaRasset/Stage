import java.util.Scanner;
public class MultipleQuestion extends NumericQuestion{

	private NumericQuestion [] domande ;
	
	
	
	Scanner tastiera = new Scanner(System.in);


	public MultipleQuestion(String domanda,String rispostaCorretta,int risultato,NumericQuestion[]domande) {
		
      super(domanda,rispostaCorretta,risultato);
      this.domande = domande;
		
		// TODO Auto-generated constructor stub
	}

	public int ask() {
		
		int risultato = super.ask();
		
		for(int i = 0;i<domande.length;i++) {
			System.out.println(domande[i].getDomanda());
			System.out.println("Inserisci la risposta ");
			int risposta = tastiera.nextInt();
			int rispostaCorretta = Integer.parseInt(domande[i].getRispostaCorretta());
			
			if(risposta == rispostaCorretta)
				risultato = risultato +1;
			else
				risultato = risultato +0;
		}
		
	return risultato;}
	
}
