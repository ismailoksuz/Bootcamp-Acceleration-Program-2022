/**
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Taban değerini giriniz:");
		int base = scan.nextInt();
		System.out.print("Üs değerini giriniz:");
		int exp = scan.nextInt();
		int res=1;
		for(int i=0;i<exp;i++){
		    res*=base;
		}
		System.out.print(base+" üssü "+exp+" = "+res);
		
	}
}

