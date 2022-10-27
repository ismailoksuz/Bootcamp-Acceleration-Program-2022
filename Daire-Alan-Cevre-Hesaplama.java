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
		if(islem==1)sonuc=2*pi*r;
		else if(islem==2)sonuc=pi*r*r;
		else if(islem==3){
		    System.out.print("Merkez açının derecesini giriniz:");
		    aci=scan.nextDouble();
		    sonuc=(2*pi*r*aci)/360;
		}
		else{
		    System.out.print("Merkez açının derecesini giriniz:");
		    aci=scan.nextDouble();
		    sonuc=(pi*r*r*aci)/360;
		}
		System.out.print("Sonuç: "+sonuc);
		
		
	}
	
}
