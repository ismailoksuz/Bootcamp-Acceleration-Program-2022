/**
Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Sayıyı giriniz:");
		int inp = scan.nextInt();
		int res=0;
		while(inp>=10){
		    res+=inp%10;
		    inp/=10;
		}
		res+=inp;
		System.out.print(res);
		
	}
}

