import java.util.Scanner;
public class Trasposta{
  public static void main(String[]args){
    int [][] matrice = new int [3][3];
    for(int i = 0; i<3 ; i++){
      for(int j = 0; j<3 ;j++)
      matrice[i][j]=  (int) (Math.random() * 10);
    }

    for(int i = 0; i<3 ; i++){
      for(int j = 0; j<3 ;j++){
      System.out.print("\t" + matrice[i][j] );}
      System.out.println();}

      int [][] trasposta = new int[3][3];
  for(int i = 0; i<3 ;i++){
for(int j = 0; j<3 ;j++)
trasposta[i][j]= matrice[j][i];


  }
  System.out.println("La matrice trasposta è");

  for(int i = 0; i<3 ; i++){
    for(int j = 0; j<3 ;j++){
    System.out.print("\t" + trasposta[i][j] );}
    System.out.println();}
}
}
