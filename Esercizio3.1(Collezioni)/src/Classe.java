import java.util.LinkedList;

public class Classe {

	
	
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
		System.out.println("Risultato primo metodo : ");
		for(int i = 0;i<lista.size();i++)
			System.out.print("<" + lista.get(i)+ ">" + " ");
	return lista;}


public static LinkedList<Integer>parseString(LinkedList<String>a){
	LinkedList<Integer> lista = new LinkedList<Integer>();
	int b = 0;
	for(int i = 0;i<a.size();i++) {
		 b = Integer.parseInt(a.get(i));
	lista.add(b);}
	System.out.println("\n" + "Risultato secondo metodo : " );
	for(int j = 0;j<lista.size();j++)
		System.out.print("<"+ lista.get(j) + ">" + " ");
	return lista;}



public static void provaEx2() {
	int n = 10;
	creaRandomCrescente(10);
	
LinkedList<String> a = new LinkedList();
a.add("11");
a.add("21");
a.add("32");
a.add("43");
a.add("54");
a.add("65");
a.add("75");
a.add("98");
a.add("107");
parseString(a);

}



}
