import java.util.Scanner;
public class Question {

	Scanner tastiera = new Scanner(System.in);
	
	private String domanda;
	private String rispostaCorretta;
	private int punteggio;
	
	
	public String getDomanda() {
		return domanda;
	}
	public void setDomanda(String domanda) {
		this.domanda = domanda;
	}
	public String getRispostaCorretta() {
		return rispostaCorretta;
	}
	public void setRispostaCorretta(String rispostaCorretta) {
		this.rispostaCorretta = rispostaCorretta;
	}
	public int getPunteggio() {
		return punteggio;
	}
	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}
	
	public Question(String domanda,String rispostaCorretta,int punteggio) {
		this.domanda = domanda;
		this.rispostaCorretta = rispostaCorretta;
		this.punteggio = punteggio;
	}
	
	public int ask() {
		System.out.println(domanda);
		System.out.println("Inserisci la risposta");
		String risposta = tastiera.nextLine();
		if(risposta.equalsIgnoreCase(rispostaCorretta))
			return 1 ;
		else
			return 0;
		
	}

}
