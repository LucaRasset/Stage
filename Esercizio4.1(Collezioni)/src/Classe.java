import java.util.LinkedList;

public class Classe {

	
	
		
		
		
	public static LinkedList<LinkedList<Integer>>insiemeDiInsiemi(int n){
		
		int b = 0;
		int c = 0;
		LinkedList<LinkedList<Integer>> nuova = new LinkedList<LinkedList<Integer>>();
		
		
		for(int i = 0; i<n;i++) {
			LinkedList<Integer> a = new LinkedList<Integer>();

			for(int j = 0; j<5;j++) {
			c = (int)(Math.random()* (b+1));
				a.add(c) ;
				
			}
			
		b++;
		
		nuova.add(a);}
	return nuova;}
	
	
	public static void stampa(LinkedList<LinkedList<Integer>> a) {
		int n = 1;

		for(int i = 0;i<a.size();i++) {
	
			
			LinkedList<Integer> c = a.get(i);
			System.out.println(n + " Lista : ");
			n++;
			for(int j = 0;j<c.size();j++) {
				System.out.println(c.get(j));}
		}
	}
	
	
	
	
}
