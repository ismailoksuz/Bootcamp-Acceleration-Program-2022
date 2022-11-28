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
		System.out.print("Bir sayı giriniz: ");
		int inp=scan.nextInt();
		System.out.println(inp+" "+isPerfect(inp));
		
	}
	public static String isPerfect(int num){
	    String yes="Mükemmel sayıdır.";
	    String no="Mükemmel sayı değildir";
	    int sum=0;
	    if(num==1){
	        return no;
	    }
	    for(int i=1;i<num;i++){
	        if(num%i==0){
	            sum+=i;
	        }
	    }
	    if(sum==num){
	        return yes;
	    }
	    else{
	        return no;
	    }
	}
}

