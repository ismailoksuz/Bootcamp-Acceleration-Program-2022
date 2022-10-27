import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Boyunuzu metre cinsinden giriniz: ");
	    double boy=scan.nextDouble();
	    System.out.print("Kilonuzu kilogram cinsinden giriniz: ");
	    double kg=scan.nextDouble();
	    double vki=kg/(boy*boy);
	    System.out.print("Vücuc Kitle İndeksiniz: "+vki);
	}
	
}
