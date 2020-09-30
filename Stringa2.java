import java.util.Scanner;
public class Stringa2{
  public static void main (String [] args){
    String stringa;
    System.out.println("Inserisci una stringa");
    Scanner tastiera = new Scanner (System.in);
    stringa = tastiera.nextLine();
String vocali;
vocali = "";
    for(int i = 0 ; i < stringa.length(); i++ ){
      if(stringa.charAt(i) == 'a' || stringa.charAt(i) == 'e' || stringa.charAt(i) == 'i' || stringa.charAt(i) == 'o' || stringa.charAt(i) == 'u'||
      stringa.charAt(i) == 'A' || stringa.charAt(i) == 'E' || stringa.charAt(i) == 'I' || stringa.charAt(i) == 'O' || stringa.charAt(i) == 'U')
      vocali = vocali + "" + stringa.charAt(i);    }
  System.out.println(vocali);}
}
