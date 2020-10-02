import java.util.Scanner;
public class Stringa4 {
public static void main (String[]args) {
Scanner tastiera = new Scanner(System.in);

System.out.println("Inserisci una sequenza di stringhe,  per terminare scrivi vuota");
String stringa;
stringa = "ciao";
int somma = 0;

while(!stringa.equals("vuota")){
  stringa = tastiera.next();
 
  int contatore = 0;
  for(int i = 0; i< stringa.length();i++){
  if(stringa.charAt(i) == ',')
  contatore++;}
  
  int indice ;
  indice = 0;
  int [] posizione = new int[contatore+1];

  for(int j = 0;j<stringa.length();j++){
  if(stringa.charAt(j) == ','){
  posizione[indice] = j;
  indice++;}

  }
  posizione[posizione.length-1] = stringa.length();
  
  int l;
  l = 0;

  for(int k = 0;k<stringa.length();k++){
	  if(Character.isUpperCase(stringa.charAt(k))==true){
	  int posizioneVirgola;
	  posizioneVirgola = posizione[l];
	  String nuova ;
	  nuova = stringa.substring(k,posizione[l]);
	  somma = somma + nuova.length();
	  /*int o = 0;
	  array[o] = nuova;
	  System.out.println(array[o]);
	  o++;*/

	  }
	  if(stringa.charAt(k) == ',')
	  l++;}

}

if(somma!= 0)
	System.out.println(somma);}}