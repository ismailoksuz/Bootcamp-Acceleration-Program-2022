import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double kenar=0;
		System.out.println("2 Kenarının uzunluğu verilen üçgenin 3. kenarının uzunluğunu bulma programına hoşgeldiniz.");
		System.out.println("Yapmak istediğiniz işlemi seçiniz: (A veya B'ye basarak seçim yapabilirsiniz)");
		System.out.println("A - Hipotenüsü ve bir kenarı verilen üçgenin diğer dik kenarını hesaplamak.");
		System.out.println("B - 2 dik kenarı verilen üçgenin hipotenüs uzunluğunu hesaplamak.");
		char inp=scan.next().charAt(0);
		if(inp=='A')kenar=kenarBul();
		else if(inp=='B')kenar=hipotenusBul();
		else{
		    System.out.println("Geçersiz değer girdiniz.");
		    System.exit(0);
		}
		System.out.print("Sonuç: "+kenar);
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
	
}