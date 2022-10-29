import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String mesaj;
		Scanner scan=new Scanner(System.in);
		System.out.print("Hava sıcaklığını giriniz:");
		int derece=scan.nextInt();
		if(derece<5)mesaj="Kayak yapabilirsin.";
		else if(derece>=5 && derece <=25){
		    if(derece>15)mesaj="Piknik yapabilirsin.";
		    else if(derece<15)mesaj="Sinemaya gidebilirsin.";
		    else mesaj="Piknik yapabilirsin veya sinemaya gidebilirsin.";
		}
		else mesaj="Yüzebilirsin.";
		System.out.print(mesaj);
	}
	
}            