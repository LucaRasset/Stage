import java.util.Scanner;
public class Cicli2{
  public static void main(String[]args){
    System.out.println("Inserisci una sequenza di  interi, per terminare usa 1998");
    Scanner tastiera = new Scanner(System.in);
    int numero;
    numero = tastiera.nextInt();
    int somma = 0;
    int contatore = 0;
    while(numero != 1998){
      if(numero%3 == 0){
        somma = somma + numero;
        contatore++;
      }
      numero = tastiera.nextInt();
    }
  System.out.println("La media dei numeri inseriti divisibili per 3 è " + (somma/contatore));
}
}
