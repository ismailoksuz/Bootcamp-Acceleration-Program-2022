import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int toplam=notGir();
		double ort=ortalamaHesapla(toplam);
		String durum=gectiKaldi(ort);
		System.out.print("Not ortalamanız "+ort+" olduğu için "+durum);
	}
	
	public static int notGir(){
	    int mat,fiz,kim,tur,tar,muz,toplam;
		Scanner scan=new Scanner(System.in);
		System.out.print("Matematik notunuzu giriniz:");
		mat=scan.nextInt();
		System.out.print("Fizik notunuzu giriniz:");
		fiz=scan.nextInt();
		System.out.print("Kimya notunuzu giriniz:");
		kim=scan.nextInt();
		System.out.print("Türkçe notunuzu giriniz:");
		tur=scan.nextInt();
		System.out.print("Tarih notunuzu giriniz:");
		tar=scan.nextInt();
		System.out.print("Müzik notunuzu giriniz:");
		muz=scan.nextInt();
		toplam=(mat+fiz+kim+tur+tar+muz);
		return toplam;
	}
	public static double ortalamaHesapla(int toplam){
	    double ort=toplam/6;
	    return ort;
	}
	public static String gectiKaldi(double ortalama){
	    boolean sonuc = ortalama >= 60;
        String mesaj= (sonuc ? "sınıfı geçtiniz." : "sınıfta kaldınız.");
        return mesaj;
	}
	
}