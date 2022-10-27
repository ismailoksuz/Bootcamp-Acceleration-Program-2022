import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double armutkg=2.14;
	    double elmakg=3.67;
	    double domateskg=1.11;
	    double muzkg=0.95;
	    double patlicankg=5;
	    double armut,elma,domates,muz,patlican;
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Hangi meyveden ne kadar aldığınızı kilogram cinsinden giriniz: (Almadıysanız 0 yazın)");
	    System.out.print("Armut- ");
	    armut=scan.nextDouble();
	    System.out.print("Elma- ");
	    elma=scan.nextDouble();
	    System.out.print("Domates- ");
	    domates=scan.nextDouble();
	    System.out.print("Muz- ");
	    muz=scan.nextDouble();
	    System.out.print("Patlıcan- ");
	    patlican=scan.nextDouble();
	    System.out.println(armut+ " kg armut: "+(armut*armutkg+" TL"));
	    System.out.println(elma+ " kg elma: "+(elma*elmakg+" TL"));
	    System.out.println(domates+ " kg domates: "+(domates*domateskg+" TL"));
	    System.out.println(muz+ " kg muz: "+(muz*muzkg+" TL"));
	    System.out.println(patlican+ " kg patlıcan: "+(patlican*patlicankg+" TL"));
	    double toplam=armut*armutkg+elma*elmakg+domates*domateskg+muz*muzkg+patlican*patlicankg;
	    System.out.println("Toplam ödemeniz gereken tutar: "+toplam+" TL'dir.");
	}
	
}