import java.util.Scanner;
public class Array4{
  public static void main (String []args){
Scanner tastiera = new Scanner (System.in);
    System.out.println("Inserisci una sequenza di 5 stringhe");
    String [] array = new String [5];
int n = 0;
    while(n<5){
      array[n] = tastiera.next();
      n++;
    }
int k = 0;
System.out.println("Inserisci un'altra sequenza di 5 stringhe");
String [] array2 = new String [5];
while(k<5){
  array2[k] = tastiera.next();
  k++;
}

int contatore = 0;
boolean risultato = false;
for(int i = 0; i< 5 ; i++){
  for(int j =0; j<5; j++){
  if(array[i].equals(array2[j])){
  risultato = true;
  contatore++;}
  if (contatore >= 2)
  break;}}

if (risultato == true )
System.out.println("OK");
else
System.out.println("KO");

}

  }
