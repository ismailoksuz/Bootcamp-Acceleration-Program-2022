import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Gittiğiniz mesafeyi KM cinsinden giriniz:");
		int mesafe=scan.nextInt();
		double tutar=(mesafe*2.2)+10;
		tutar=(tutar<20) ? 20 : tutar;
		System.out.print("Ödemeniz gereken ücret: "+tutar+" TL'dir.");
	}
}