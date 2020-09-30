import java.util.Scanner;
public class Fibonacci{
  public static void main(String[]args){
    int n = 50;
    int [] array = new int[50];
    array[0]= 0;
    array[1]= 1;
    for(int i = 2; i<n;i++){
    array[i] = array[i-1] + array[i-2];}

for(int k =0; k<n;k++){
  System.out.print(array[k] + " ");
}

  }
}
