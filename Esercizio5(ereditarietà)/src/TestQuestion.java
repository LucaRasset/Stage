import java.util.Scanner;

public class TestQuestion {
	public static void main(String[]args) {
Scanner tastiera = new Scanner(System.in);
Question [] quesiti = new Question [5];
NumericQuestion[]domande = new NumericQuestion[2];

Question quesito1 = new Question("Capitale dItalia","Roma",1);
Question quesito2 = new NumericQuestion("2x2","4",1);
Question quesito3 = new QuestionYesNo("Roma è in italia","Si",1);
Question quesito4 = new NumericQuestion("5*5","25",1);
Question quesito5 = new MultipleQuestion("6*6","36",1,domande);




domande[0] = (NumericQuestion) quesito2;
domande[1]= (NumericQuestion) quesito4;

quesiti[0] = quesito1;
quesiti[1] = quesito2;
quesiti[2] = quesito3;
quesiti[3] = quesito4;
quesiti[4] = quesito5;


String risposta = "si";
int risultato = 0;
while(risposta.equalsIgnoreCase("si")) {
	int n = (int) (Math.random() * 5);
	

risultato = risultato + quesiti[n].ask();
System.out.println("Vuoi continuare ?");
risposta = tastiera.next();

}

System.out.println("Il punteggio è " + risultato);

	
	}
}