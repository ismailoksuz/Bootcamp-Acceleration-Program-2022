import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double sonuc=0;
		System.out.println("Yapmak istediğiniz işlemi seçiniz: (A,B,C'ye basarak seçim yapabilirsiniz)");
		System.out.println("A - Hipotenüsü ve bir kenarı verilen üçgenin diğer dik kenarını hesaplamak.");
		System.out.println("B - 2 dik kenarı verilen üçgenin hipotenüs uzunluğunu hesaplamak.");
		System.out.println("C - 3 kenarı verilen üçgenin alanını hesaplamak.");
		char inp=scan.next().charAt(0);
		if(inp=='A')sonuc=kenarBul();
		else if(inp=='B')sonuc=hipotenusBul();
		else if(inp=='C')sonuc=alanHesapla();
		else{
		    System.out.println("Geçersiz değer girdiniz.");
		    System.exit(0);
		}
		System.out.print("Sonuç: "+sonuc);
	}
	public static double hipotenusBul(){
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Kenarların uzunluklarını giriniz:");
	    double kenar1=scan.nextDouble();
	    double kenar2=scan.nextDouble();
	    double hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
	    return hipotenus;
	}
	public static double kenarBul(){
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Dik kenarın uzunluğunu giriniz:");
	    double kenar1=scan.nextDouble();
	    System.out.print("Hipotenüsün uzunluğunu giriniz:");
	    double hipotenus=scan.nextDouble();
	    double kenar2=Math.sqrt((hipotenus*hipotenus)-(kenar1*kenar1));
	    return kenar2;
	}
	public static double alanHesapla(){
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Kenarların uzunluklarını giriniz:");
	    double a=scan.nextDouble();
	    double b=scan.nextDouble();
	    double c=scan.nextDouble();
	    double u=(a+b+c)/2;
	    double sonuc=Math.sqrt(u*(u-a)*(u-b)*(u-c));
	    return sonuc;
	}
	
}
