import java.util.Iterator;
import java.util.LinkedList;

public class Classe {

	
	
	public static LinkedList<Integer>creaRandom(int n,int max){
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
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
	LinkedList lista = creaRandom(20,10);
	
	Iterator<Integer> i = lista.iterator();
	stampa(i);
	
}




}
