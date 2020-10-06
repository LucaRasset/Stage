import java.util.Scanner;
public class DadoMoneta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner tastiera = new Scanner(System.in);
	
	String[]moneta = new String [2];
	int[]dado = new int [6];
	
	moneta[0]= "Testa";
	moneta[1] = "Croce";
	int indice= 0;
	for(int i = 1;i<dado.length +1;i++) {
		
		dado[indice] = i;
		indice++;
	}
	
	System.out.println("Vuoi lanciare un dado o una moneta ?");
	String risposta = tastiera.next();
	int a = (int) (Math.random()*2);
	
	if(risposta.equalsIgnoreCase("Moneta")){
	System.out.println("E' uscito " + moneta[a]);	}	
	
	int b = (int) (Math.random()*6);
	if(risposta.equalsIgnoreCase("dado")) {
		System.out.println("E' uscito " + dado[b]);
	}
	
	

}
}