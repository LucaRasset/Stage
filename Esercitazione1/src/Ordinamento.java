import java.util.Scanner;
public class Ordinamento{
  public static void main (String []args){
    int [] array = new int [10];
    System.out.println("Inserisci 10 interi per popolare l'array");
    int contatore = 0;
    Scanner tastiera = new Scanner(System.in);
    while(contatore<10){
      int numero;
      numero = tastiera.nextInt();
      array[contatore] = numero;
      contatore++;
      }
for(int i =0;i<array.length-1;i++){
  int min;
  min = i;
  for(int j= i+1;j<array.length;j++){
  if(array[j]< array[min]){
  min = j;}}
  if(min != i){
    int nuovo = array[min];
    array[min] = array[i];
    array[i] = nuovo;}
  }


 for(int i =0;i<array.length;i++){
   System.out.print(array[i] + " ");}
}
}
