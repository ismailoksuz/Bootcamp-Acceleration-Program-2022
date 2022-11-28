/**
Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten
bir program yazarak GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.
**/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Dizinin eleman sayısını giriniz: ");
	    int cnt=scan.nextInt();
	    int[] arr=getArray(cnt);
	    int[] evens=createEvenList(arr);
	    int[] woutdup=removeDuplicates(evens);
	    System.out.println("Oluşan dizi: "+Arrays.toString(arr));
	    System.out.print("Tekrar eden çift sayılar: ");
	    for(int val : woutdup){
	        if(val!=0){
	            System.out.print(val+" ");
	        }
	    }
	}
	static int[] getArray(int cnt){
	    int[] indexes=new int[cnt];
	    for(int i=0;i<indexes.length;i++){
	        indexes[i]=(int)(Math.random() * (10));
	    }
	    return indexes;
	}
	static int findEvenNo(int[] arr){
	    int res=0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]%2==0){
	            res+=1;
	        }
	    }
	    return res;
	}
	static int[] createEvenList(int[] arr){
	    int noe=findEvenNo(arr);
	    int[] evens=new int[noe];
	    int j=0;
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]%2==0){
	            evens[j]=arr[i];
	            j+=1;
	        }
	    }
	    return evens;
	}
	static int[] removeDuplicates(int []evens){
	    int[] duplicate=new int[evens.length];
	    int si=0;
	    for(int i=0;i<evens.length;i++){
	        for(int j=0;j<evens.length;j++){
	            if((i!=j) && (evens[i]==evens[j])){
	                if(!isFind(duplicate, evens[i])){
	                    duplicate[si++]=evens[i];
	                }
	                break;
	            }
	        }   
	    }
	    return duplicate;
	}
	static boolean isFind(int[] arr, int val){
	    for(int i : arr){
	        if(i==val){
	            return true;
	        }
	    }
	    return false;
	}
	    
}

