import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Classe {

	
public static LinkedList<Integer>mergeOrdinato(Iterator<Integer>a,Iterator<Integer>b){
	
	LinkedList<Integer> nuova = new LinkedList<Integer>();
	
	int contatore1 = 0;
	
	while(a.hasNext() == true) {
		nuova.add(contatore1,a.next());
		contatore1++;
		if(a.hasNext()==false) {
			while(b.hasNext() == true) {
				nuova.add(contatore1,b.next());
				contatore1++;}}
	}
	Collections.sort(nuova);
	return nuova;
		
}
	

public static void provaEx3() {
	LinkedList<Integer> lista1 = new LinkedList<Integer>();
	LinkedList<Integer> lista2 = new LinkedList<Integer>();

	lista1 = creaRandomCrescente(5);
	lista2 = creaRandomCrescente(5);
	System.out.println("Lista 1 : ");
	System.out.println("\n");

	for (int i = 0;i<lista1.size();i++)
		System.out.print(lista1.get(i) + " ");
	
	System.out.println("\n");
   System.out.println("Lista 2 : ");
	System.out.println("\n");

	for (int i = 0;i<lista2.size();i++)
		System.out.print(lista2.get(i) + " ");
	
	Iterator<Integer> a = lista1.iterator();
	Iterator<Integer> b = lista2.iterator();
	
LinkedList<Integer> ordinata =mergeOrdinato(a,b);
	
	
	System.out.println("\n");
	   System.out.println("Lista concatenata ordinata : ");
		System.out.println("\n");

		for (int i = 0;i<ordinata.size();i++)
			System.out.print(ordinata.get(i) + " ");
		
	
}

public static LinkedList<Integer>creaRandomCrescente(int n){
	
	LinkedList<Integer> lista = new LinkedList<Integer>();
	int c = 0;
	int contatore = 0;
	while(contatore<n) {
		int d = (int)(Math.random() * 100);
		 c = c + d;
		 lista.add(c);
		 contatore++;
		
		
	}
	return lista;}

}
