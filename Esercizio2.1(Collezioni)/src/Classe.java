import java.util.Iterator;
import java.util.ArrayList;

public class Classe {

	
	
	public static ArrayList<Integer>creaRandom(int n,int max){
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		int contatore =  0;
		while(contatore<n) {
			int numero = (int)(Math.random() * max-1);
			lista.add(numero);
			contatore++;
		}
		
		return lista;
	}


public static void stampa(Iterator<Integer> i) {

	while(i.hasNext()) {
		System.out.print("<" + i.next() + ">" + ",");
		;
	}
}


public static void provaEx1() {
	ArrayList lista = creaRandom(20,10);
	
	Iterator<Integer> i = lista.iterator();
	stampa(i);
	
}




}
