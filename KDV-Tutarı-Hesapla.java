import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double tutar=tutarGir();
		double kdvlitutar=0;
		double kdv=0.18;
		if(tutar>1000){
		    kdvlitutar=pahali(tutar);
		    kdv=0.08;
		}
		else if(tutar>=0)kdvlitutar=ucuz(tutar);
		else{
		    System.out.print("Hatalı tutar girdiniz");
		    System.exit(0);
		}
		System.out.println("KDV'siz tutar: "+tutar);
		System.out.println("Uygulanan KDV oranı: "+kdv);
		System.out.println("KDV tutarı: "+(kdvlitutar-tutar));
		System.out.println("Toplam tutar: "+kdvlitutar);
	}
	
	public static double tutarGir(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Ücret tutarını giriniz:");
		double tutar=scan.nextDouble();
		return tutar;
	}
	public static double pahali(double tutar){
	    double kdv=0.08;
	    return tutar+tutar*kdv;
	}
	public static double ucuz(double tutar){
	    double kdv=0.18;
	    return tutar+tutar*kdv;
	}
	
}
