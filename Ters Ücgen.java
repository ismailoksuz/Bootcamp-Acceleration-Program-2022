/**
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı
ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana
yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
toplamı kendisine eşit olan sayıya mükemmel sayı denir.
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Basamak sayısını giriniz: ");
		int inp=scan.nextInt();
		int fls=2*inp-1;
		int bnk=0;
		for(int i=0;i<inp;i++){
		    for(int j=0;j<bnk;j++){
		        System.out.print(" ");
		    }
		    for(int m=0;m<fls;m++){
		        System.out.print("*");
		    }
		    for(int k=0;k<bnk;k++){
		        System.out.print(" ");
		    }
		    System.out.println();
		    bnk+=1;
		    fls-=2;
		}
		
	}
}

