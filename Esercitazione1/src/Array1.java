import java.util.Scanner;
public class Array1{
  public static void main (String[]args){
    System.out.println("Inserisci 10 interi");
    Scanner tastiera = new Scanner (System.in);
    int indice = 0;
    int posizione = 0;
    int [] array = new int [10];
    while(indice < 10){
      array [posizione] = tastiera.nextInt();
      posizione++;
      indice++;
    }
    int i = 0;
    int j = 9;
  while(i < 5 && j > 4){
    System.out.print(array[i] + "" + array[j]);
    i++;
    j--;
  }

}
}
