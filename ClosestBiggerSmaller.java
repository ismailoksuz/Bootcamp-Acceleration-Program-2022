/**
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük
en yakın sayıyı bulan programı yazınız.
**/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int[] indexes={15,12,788,1,-1,-778,2,0};
	    System.out.print("Sayı giriniz: ");
	    int num=scan.nextInt();
	    int bigdif=Integer.MIN_VALUE;
	    int smldif=Integer.MAX_VALUE;
	    int sml=num;
	    int big=num;
	    int i=0;
	    while(i<indexes.length){
	        if(num>indexes[i] && num-indexes[i]<smldif){
	            smldif=num-indexes[i];
	            sml=indexes[i];
	        }
	        if(num<indexes[i] && num-indexes[i]>bigdif){
	            bigdif=num-indexes[i];
	            big=indexes[i];
	        }
	        i+=1;
	    }
	    System.out.println("Girilen sayıdan küçük en yakın sayı: "+sml+"\nGirilen sayıdan büyük en yakın sayı "+big);
	}
	
}

