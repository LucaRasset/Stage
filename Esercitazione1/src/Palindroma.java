import java.util.Scanner;
public class Palindroma{
  public static void main (String[]args){
    Scanner tastiera = new Scanner(System.in);
    String stringa;
    System.out.println("Inserisci una stringa");
    stringa = tastiera.next();
    boolean risultato;
    risultato = false;

    for(int i = 0; i<stringa.length()/2;i++){
      for(int j = stringa.length()-1;j>stringa.length()/2;j--)
      if(stringa.charAt(i) == stringa.charAt(j))
      risultato = true;
  }
if(stringa.length() < 2)
risultato = true;
else if(stringa.length() % 2 != 0)
risultato = false;

System.out.println(risultato);
}
}
