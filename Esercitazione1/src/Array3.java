import java.util.Scanner;
public class Array3{
  public static void main(String[]args){
    Scanner tastiera = new Scanner (System.in);
    int [] array = new int [10];
    int indice = 0;
    /* Ho riempito l'array manualmente perchè riempiendolo
    casualmente con (Math.random) è difficile che ci siano 3 valori consecutivi
    uguali e quindi era difficile testare la condizione */ 
    System.out.println("Inserisci 10 valori");
    while(indice < 10){
      array[indice] = tastiera.nextInt();
      indice++;
    }
    boolean risultato = false;
for(int i = 0 ; i<8; i++){
  int a = i;
  int b = i+1;
  int c = i+2;
  if(array[a] == array[b] && array[b] == array[c])
  risultato = true ;

}
if(risultato == true)
System.out.println("Tre valori consecutivi uguali");
else
System.out.println("No");
  }
}
