import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int s1,s2,islem,sonuc=0;
		double sonuc2=0;
		String isaret="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Yapmak istediğiniz işlemi seçiniz: (1,2,3,4)");
		System.out.println("1- Toplama");
		System.out.println("2- Çıkarma");
		System.out.println("3- Çarpma");
		System.out.println("4- Bölme");
		islem=scan.nextInt();
		if(islem<1 || islem>4){
		    System.out.println("Geçersiz değer girdiniz!");
		    System.exit(0);
		}
		System.out.print("Değerleri giriniz:");
		s1=scan.nextInt();
		s2=scan.nextInt();
		switch(islem){
		    case 1:
		        sonuc=toplama(s1,s2);
		        isaret="+";
		        break;
		    case 2:
		        sonuc=cikarma(s1,s2);
		        isaret="-";
		        break;
		    case 3:
		        sonuc=carpma(s1,s2);
		        isaret="*";
		        break;
		    case 4:
		        sonuc2=bolme(s1,s2);
		        System.out.println(s1+" / "+s2+" = "+sonuc2);
		        System.exit(0);
		       
		}
		System.out.println(s1+" "+isaret+" "+s2+" = "+sonuc);
	}
	public static int toplama(int s1,int s2){
	    return s1+s2;
	}
	public static int cikarma(int s1,int s2){
	    return s1-s2;
	}
	public static int carpma(int s1,int s2){
	    return s1*s2;
	}
	public static double bolme(int s1,int s2){
	    double sonuc=0;
	    double d1=s1;
	    double d2=s2;
	    Scanner scan=new Scanner(System.in);
	    if(s2==0){
	        System.out.println("Bir sayı 0'a bölünemez!");
	        System.exit(0);
	    }
	    else{
	        sonuc=d1/d2;
	    }
	    return sonuc;
	}
	
}
