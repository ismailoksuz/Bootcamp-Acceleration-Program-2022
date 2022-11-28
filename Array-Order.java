/**
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
**/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Dizinin eleman sayısını giriniz: ");
	    int cnt=scan.nextInt();
	    int[] indexes=new int[cnt];
	    for(int i=0;i<cnt;i++){
	        System.out.print("Dizinin "+(i+1)+". elemanını giriniz: ");
	        int ind=scan.nextInt();
	        indexes[i]=ind;
	    }
	    System.out.print("Sıralama: "+Arrays.toString(order(indexes)));
	}
	static int[] order(int[]arr){
	    int temp=0;
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length;j++){
	            if(arr[i]<arr[j]){
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	    }
	    return arr;
	}

	    
}

