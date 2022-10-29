import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String kullaniciadi,sifre;
		System.out.print("Kullanıcı Adı:");
		kullaniciadi=scan.nextLine();
		System.out.print("Parolanız:");
		sifre=scan.nextLine();
		if(kullaniciadi.equals("patika") && sifre.equals("java123")){
		    System.out.print("Giriş yaptınız.");
		}
		else if(kullaniciadi.equals("patika")==false){
		    System.out.print("Sistemimizde böyle bir kullanıcı bulunmamaktadır.");
		}
		else if(kullaniciadi.equals("patika") && sifre.equals("java123")==false){
		    System.out.println("Parolanızı hatalı girdiniz.");
		    System.out.println("Parolanızı sıfırlamak ister misiniz? (E,H)");
		    char durum=scan.next().charAt(0);
		    if(durum=='H'){
		        System.exit(0);
		    }
		    else if(durum=='E'){
		        System.out.print("Yeni oluşturacağınız şifre asıl şifrenizle ve hatalı girdiğiniz şifreyle aynı olamaz!");
		        sifre=sifirla("patika",sifre);
		        System.out.println(sifre);
		    }
		    else{
		        System.out.print("Geçersiz değer girdiniz.");
		    }
		}
		
	}
	public static String sifirla(String s1,String s2){
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Yeni oluşturmak istediğiniz şifrenizi giriniz:");
	    String y1=scan.nextLine();
	    if(y1.equals(s1)||y1.equals(s2)){
	        System.out.println("Girdiğiniz şifre asıl şifreniz veya hatalı olarak girdiğiniz şifreyle eşleşmektedir.");
	        System.out.println("Tekrar giriniz");
	        return sifirla(s1,s2);
	    }
	    System.out.print("Tekrar giriniz:");
	    String y2=scan.nextLine();
	    if(y2.equals(s1)||y2.equals(s2)){
	        System.out.println("Girdiğiniz şifre asıl şifreniz veya hatalı olarak girdiğiniz şifreyle eşleşmektedir.");
	        System.out.println("Tekrar giriniz");
	        return sifirla(s1,s2);
	    }
	    else if(y2.equals(y1)==false){
	        System.out.println("Şifreler uyuşmamaktadır.");
	        return sifirla(s1,s2);
	    }
	    else{
	       return "Şifre başarıyla değiştirildi.";
	    }
	}
}
