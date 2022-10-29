import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		double ort=notGir();
		String durum=gectiKaldi(ort);
		System.out.print("Not ortalamanız "+ort+" olduğu için "+durum);
	}
	
	public static double notGir(){
	    int mat,fiz,kim,tur,muz;
	    int toplam=0;
	    int gecerli=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Matematik notunuzu giriniz:");
		mat=scan.nextInt();
		if(mat>=0&&mat<=100){
		    toplam+=mat;
		    gecerli+=1;
		}
		System.out.print("Fizik notunuzu giriniz:");
		fiz=scan.nextInt();
		if(fiz>=0&&fiz<=100){
		    toplam+=fiz;
		    gecerli+=1;
		}
		System.out.print("Kimya notunuzu giriniz:");
		kim=scan.nextInt();
		if(kim>=0&&kim<=100){
		    toplam+=kim;
		    gecerli+=1;
		}
		System.out.print("Türkçe notunuzu giriniz:");
		tur=scan.nextInt();
		if(tur>=0&&tur<=100){
		    toplam+=tur;
		    gecerli+=1;
		}
		System.out.print("Müzik notunuzu giriniz:");
		muz=scan.nextInt();
		if(muz>=0&&muz<=100){
		    toplam+=muz;
		    gecerli+=1;
		}
		double ort=ortalamaHesapla(toplam,gecerli);
		return ort;
	}
	public static double ortalamaHesapla(int toplam,int gecerli){
	    double ort=toplam/gecerli;
	    return ort;
	}
	public static String gectiKaldi(double ortalama){
	    boolean sonuc = ortalama >= 55;
        String mesaj= (sonuc ? "sınıfı geçtiniz." : "sınıfta kaldınız.");
        return mesaj;
	}
	
}            