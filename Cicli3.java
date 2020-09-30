import java.util.Scanner;
public class Cicli3{
  public static void main (String[]args){
   for(int i =0; i<5; i++){
    Scanner tastiera = new Scanner(System.in);
    System.out.println("Quanti caratteri vuoi inserire ?");
    int dimensione ;
    dimensione = tastiera.nextInt();
    int indice = 1;
    System.out.println("Inserisci i caratteri");
    String c;
  c = "";
  String b;
  b = "";
  char k = ' ';
do{
  c = tastiera.next();
  k = c.charAt(0);
  b = b + "" + k;
    System.out.println(b);
    indice++;
}  while(indice <= dimensione);



  }
}
}
