/**
Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
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
	        indexes[i]=(int)(Math.random() * (10));
	    }
	    System.out.println("Oluşturulan dizi: "+Arrays.toString(indexes));
	    int[] repeat=new int[cnt];
	    repeat=findFreq(indexes);
	    for(int j=0;j<indexes.length;j++){
	        if(repeat[j]!=0){
	            System.out.println(indexes[j]+" sayısı "+(repeat[j]+1)+" kere tekrar edildi.");
	        }
	    }
	    
	}
	static int[] findFreq(int[]arr){
	    int[] repetation=new int[arr.length];
	    for(int i=0;i<arr.length;i++){
	        int count=0;
	        for(var j=i+1;j<arr.length;j++){
	            if(arr[i]!=0 && arr[i]==arr[j]){
	                count+=1;
	                arr[j]=0;
	            }
	        }
	        repetation[i]=count;
	    }
	    return repetation;
	}
}

