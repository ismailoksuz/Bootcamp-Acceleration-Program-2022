import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    double pi=3.14;
		Scanner scan=new Scanner(System.in);
		System.out.println("Yapmak istediğiniz işlemi seçiniz: (1,2,3,4)");
		System.out.println("1- Dairenin çevresini hesaplamak.");
		System.out.println("2- Dairenin alanını hesaplamak.");
		System.out.println("3- Daire parçasının çevresini hesaplamak.");
		System.out.println("4- Daire parçasının alanını hesaplamak.");
		int islem=scan.nextInt();
		if(islem>4 || islem<1){
		    System.out.print("Hatalı değer girdiniz.");
		    System.exit(0);
		}
		System.out.print("Yarıçapı giriniz:");
		double r=scan.nextDouble();
		double sonuc=0;
		double aci;
		if(islem==1)sonuc=CevreHesapla(r,pi);
		else if(islem==2)sonuc=AlanHesapla(r,pi);
		else if(islem==3){
		    System.out.print("Merkez açının derecesini giriniz:");
		    aci=scan.nextDouble();
		    if(aci>360 || aci<0){
		        System.out.print("Geçersiz değer girdiniz");
		        System.exit(0);
		    }
		    sonuc=CevreParcaHesapla(r,pi,aci);
		}
		else{
		    System.out.print("Merkez açının derecesini giriniz:");
		    aci=scan.nextDouble();
		    if(aci>360 || aci<0){
		        System.out.print("Geçersiz değer girdiniz");
		        System.exit(0);
		    }
		    sonuc=AlanParcaHesapla(r,pi,aci);
		}
		System.out.print("Sonuç: "+sonuc);
		
		
	}
	public static double AlanHesapla (double r,double pi){
	    return pi*r*r;
	}
	public static double CevreHesapla (double r,double pi){
	    return 2*pi*r;
	}
	public static double AlanParcaHesapla (double r,double pi,double aci){
	    return (pi*r*r*aci)/360;
	}
	public static double CevreParcaHesapla (double r,double pi,double aci){
	    return (2*pi*r*aci)/360;
	}
	
}
