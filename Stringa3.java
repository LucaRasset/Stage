import java.util.Scanner;
public class Stringa3{
  public static void main (String[]args){
    Scanner tastiera = new Scanner(System.in);
    System.out.println("Inserisci una sequenza di stringhe , per terminare scrivi vuota");
  String stringa;
  stringa = "ciao";
  int contatore;
  contatore = 1;
  int indice = 0;
  int somma = 0;

  while(!stringa.equals("vuota")){
String [] array = new String [contatore];
    stringa = tastiera.next();
    array[indice]= stringa;
    indice++;
    contatore++;
    if(Character.isUpperCase(stringa.charAt(0))==true)
    somma = somma + stringa.length();

  }
  if(somma != 0)
System.out.println(somma);

  }
}
