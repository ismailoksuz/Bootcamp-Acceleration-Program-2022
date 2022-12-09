import java.util.*; 
import java.io.*;

class Main {

  public static String LetterCapitalize(String str) {
    String[] seperated=str.split(" ");
    String res="";
    for(int i=0;i<seperated.length;i++){
      res+=seperated[i].substring(0,1).toUpperCase()+seperated[i].substring(1);
      if(i!=seperated.length-1){
        res+=" ";
      }
    }
    return res;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }

}
