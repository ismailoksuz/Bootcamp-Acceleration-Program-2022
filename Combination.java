/**
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. 
N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü = C(n,r) = n! / (r! * (n-r)!)
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.print("C(n,r) için\nn değerini giriniz:");
		int n = scan.nextInt();
		System.out.print("r değerini giriniz:");
		int r = scan.nextInt();
		if(r>n){
		    int temp=r;
		    r=n;
		    n=temp;
		}
		System.out.print("C("+n+","+r+") = "+calculateCombination(n,r));
		
		
	}
	public static double calculateCombination(int n,int r){
	    int nfac=calculateFactorial(n);
		int rfac=calculateFactorial(r);
		int nrfac=calculateFactorial(n-r);
		return(nfac/(rfac*nrfac));
	}
	public static int calculateFactorial(int i){
	    if(i==0){
	        return 1;
	    }
	    int fac=1;
	    while(i>=1){
	        fac*=i;
	        i-=1;
	    }
	    return fac;
	}
	
}

