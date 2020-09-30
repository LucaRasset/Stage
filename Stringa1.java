import java.util.Scanner;
public class Stringa1{
  public static void main (String[]args){

    String stringa;
    System.out.println("Inserisci una stringa");
    Scanner tastiera = new Scanner(System.in);
    stringa = tastiera.nextLine();
String inversa = "";
    for(int i = stringa.length()-1; i >= 0; i--)
  inversa = inversa + "" + stringa.charAt(i);

  System.out.println(inversa);}
}
