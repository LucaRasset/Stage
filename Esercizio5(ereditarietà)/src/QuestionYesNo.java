
public class QuestionYesNo extends Question {


	public QuestionYesNo(String domanda,String rispostaCorretta,int punteggio) {
		super(domanda,rispostaCorretta,punteggio);
	}
	




public int ask() {
	System.out.println(super.getDomanda());
	System.out.println("Inserisci la risposta");
	String risposta = tastiera.next();

if(!risposta.equalsIgnoreCase("Si") && !risposta.equalsIgnoreCase("No")) {
	System.out.println("La risposta può essere solo si o no, riscrivila");
risposta = tastiera.next();}

if(risposta.equalsIgnoreCase(super.getRispostaCorretta()))
	return 1;
else
	return 0;


}


}
