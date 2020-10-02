import java.util.Scanner;
public class Cicli1{
  public static void main(String[]args){
Scanner tastiera = new Scanner(System.in);
    int numeroInserito;

boolean risultato = false;
System.out.println("Inserisci una sequenza di numeri, per terminare inserisci 1998");
int contatore;
contatore = 0;
numeroInserito = tastiera.nextInt();
    while (numeroInserito != 1998){

      if(numeroInserito > 0 && numeroInserito%2 == 0)
      risultato = true;
      else{
      risultato = false;
      contatore++;}
    numeroInserito = tastiera.nextInt();

    }
    if(risultato == true && contatore == 0)
    System.out.println("Tutti positivi e pari");
    else
    System.out.println("No");
  }
}
