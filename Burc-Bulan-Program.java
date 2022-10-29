import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int ay,gun;
	    String burc="";
	    String hata="Hatalı değer girdiğiniz için program sonlandı.";
		Scanner scan=new Scanner(System.in);
		System.out.print("Doğduğunuz ay:");
		ay=scan.nextInt();
		if(ay>12||ay<0){
		    System.out.print(hata);
		    System.exit(0);
		}
		System.out.print("Doğduğunuz gün:");
		gun=scan.nextInt();
		if(ay==1){
		    if(gun<=21)burc="Oğlak";
		    else if(gun<=31) burc="Kova";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==2){
		    if(gun<=19)burc="Kova";
		    else if(gun<=29) burc="Balık";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==3){
		    if(gun<=20)burc="Balık";
		    else if (gun<=31)burc="Koç";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==4){
		    if(gun<=20)burc="Koç";
		    else if(gun<=30)burc="Boğa";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==5){
		    if(gun<=21)burc="Boğa";
		    else if (gun<=31) burc="İkizler";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==6){
		    if(gun<=22)burc="İkizler";
		    else if(gun<=30) burc="Yengeç";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==7){
		    if(gun<=22)burc="Yengeç";
		    else if (gun<=31) burc="Aslan";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==8){
		    if(gun<=22)burc="Aslan";
		    else if (gun<=31) burc="Başak";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==9){
		    if(gun<=22)burc="Başak";
		    else if(gun<=30) burc="Terazi";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==10){
		    if(gun<=22)burc="Terazi";
		    else if (gun<=31) burc="Akrep";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==11){
		    if(gun<=21)burc="Akrep";
		    else if(gun<=30) burc="Yay";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		else if(ay==12){
		    if(gun<=21)burc="Yay";
		    else if (gun<=31) burc="Oğlak";
		    else{
		        System.out.print(hata);
		        System.exit(0);
		    }
		}
		System.out.print("Burcunuz "+burc);
	}
	
}            