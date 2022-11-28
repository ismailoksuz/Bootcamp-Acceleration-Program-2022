/**
Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		int inp1=scan.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int inp2=scan.nextInt();
		int big=findMax(inp1,inp2);
		int sml=findMin(inp1,inp2);
		System.out.println("EBOB("+inp1+","+inp2+") = "+findEbob(big,sml));
		System.out.println("EKOK("+inp1+","+inp2+") = "+findEkok(big,sml));
	}
	public static int findMax(int i, int j){
	    if(i>j){
	        return i;
	    }
	    return j;
	}
	public static int findMin(int i, int j){
	    if(i<j){
	        return i;
	    }
	    return j;
	}
	public static int findEbob(int big,int sml){
	    if(big==sml){
	        return sml;
	    }
	    int ebob=1;
	    int i=1;
	    while(i<=sml){
	        if(sml%i==0 && big%i==0){
	            ebob=i;
	        }
	        i+=1;
	    }
	    return ebob;
	}
	public static int findEkok(int big,int sml){
	    if(big==sml){
	        return big;
	    }
	    int ekok=big;
	    while(ekok%big!=0 || ekok%sml!=0){
	        ekok+=1;
	    }
	    return ekok;
	}
	
}

