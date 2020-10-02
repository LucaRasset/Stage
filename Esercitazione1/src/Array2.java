import java.util.Scanner;
public class Array2{
  public static void main (String[]args){
int [] array = new int [10];
for(int i =0; i<10; i++){
  array[i] = (int) (Math.random() * 100);
}
for(int i =0; i<10; i++){
System.out.print(array[i] + " ");
}
int sommaPari;
int sommaDispari;
sommaPari= 0;
sommaDispari = 0;
for(int i = 0; i<10; i = i+2){
  sommaPari = sommaPari + array[i];
}
for(int j = 1; j<10; j = j+2){
  sommaDispari = sommaDispari + array[j];
}
if(sommaPari == sommaDispari)
System.out.println("\n" + "Pari e dispari uguali");
else
System.out.println("\n" + "Pari e dispari diversi");

}
}
