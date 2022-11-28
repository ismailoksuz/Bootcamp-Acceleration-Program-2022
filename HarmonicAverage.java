/**
Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
**/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Dizinin eleman sayısını giriniz: ");
	    int cnt=scan.nextInt();
	    int[] indexes=new int[cnt];
	    int sum=0;
	    for(int i=0;i<cnt;i++){
	        System.out.print("Dizinin "+(i+1)+". elemanını giriniz: ");
	        int ind=scan.nextInt();
	        sum+=ind;
	        indexes[i]=ind;
	    }
	    System.out.println("\nOluşan dizi: "+Arrays.toString(indexes));
	    System.out.print("\nOluşan dizinin harmonik ortalaması: \n1/(");
	    printHarmonic(indexes);
	    System.out.print(calculateHarmonic(indexes));
	}
	public static double calculateHarmonic(int[] indexes){
	    double sum=0;
	    for(int i=0;i<indexes.length;i++){
	        sum+=1.0/(double)(indexes[i]);
	    }
	    return (double)(indexes.length)/sum;
	}
	public static void printHarmonic(int[] indexes){
	    for(int i=0;i<indexes.length;i++){
	        System.out.print("1/"+(i+1));
	        if(i==indexes.length-1){
	            System.out.print(") = ");
	        }
	        else{
	            System.out.print(" + ");
	        }
	    }
	}
}

