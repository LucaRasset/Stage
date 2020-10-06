import java.util.Scanner;
public class TestVehicles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 4 è un valore casuale , giusto per verificare la correttezza
		
Scanner tastiera = new Scanner(System.in);		
	
Vehicle [] array = new Vehicle[4];
/*	
Vehicle veicolo1 = new Motocycle("AY61834","Honda","x6z",false,678);
Vehicle veicolo2 = new Motocycle("AA42886","Suzuki","o6z",false,876);
Vehicle veicolo3 = new Car("DZ005AH","Ford","Focus",false,"SUV");
Vehicle veicolo4 = new Car("DZ005GY","Renault","Clio",false,"utilitaria");*/

System.out.println("Inserisci 4 veicoli");	

int contatore = 0;

String risposta = "";

while(contatore<4) {
	
	System.out.println("Vuoi inserire una macchina o una moto ?");
	risposta = tastiera.next();
	
	    String targa;
		String marca;
		String modello;
		boolean guasta;
		int cilindrata ;
		String tipologia ;
		Vehicle veicolo;
		
		if(risposta.equalsIgnoreCase("macchina")) {
	    System.out.println("Inserisci la targa ");
		targa = tastiera.next();
	    System.out.println("Inserisci la marca ");
        marca = tastiera.next();
	    System.out.println("Inserisci il modello");
        modello = tastiera.next();
        System.out.println("Inserisci la tipologia ");
        tipologia = tastiera.nextLine();
        tipologia= tastiera.nextLine();
	    System.out.println("Inserisci se l'auto è guasta (in caso positivo inserire true)s");
        guasta = tastiera.nextBoolean();
	    veicolo = new Car(targa,marca,modello,guasta,tipologia);
        array[contatore] = veicolo;
        contatore++;
        }
		else if(risposta.equalsIgnoreCase("moto")){
		System.out.println("Inserisci la targa");
		targa = tastiera.next();
	    System.out.println("Inserisci la marca");
        marca = tastiera.next();
	    System.out.println("Inserisci il modello");
        modello = tastiera.next();
	    System.out.println("Inserisci se la moto è guasta");
        guasta = tastiera.nextBoolean();
	    System.out.println("Inserisci la cilindrata");
        cilindrata = tastiera.nextInt();
        veicolo = new Motocycle(targa,marca,modello,guasta,cilindrata);
        array[contatore] = veicolo;
        contatore++;
        }	
		
	}
	

System.out.println("I veicoli guasti sono : ");
	for(int i = 0;i<4;i++)
		if(array[i].isGuasta()==true)
			System.out.print(array[i].getTarga()+ " ");}

}
