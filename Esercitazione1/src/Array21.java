import java.util.Scanner;
public class Array21{
  public static void main (String[]args){
int [] array = new int [10];
Scanner tastiera = new Scanner (System.in);
System.out.println("Scegli 10 numeri interi");
int indice = 0;
while(indice < 10){
  array[indice] = tastiera.nextInt();
  indice++;
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
System.out.println("Pari e dispari uguali");
else
System.out.println("Pari e dispari diversi");

}
}
