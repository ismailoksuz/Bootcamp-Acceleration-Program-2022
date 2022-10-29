import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int yil;
		Scanner scan=new Scanner(System.in);
		System.out.print("Yıl girin:");
		yil=scan.nextInt();
		if((yil%100==0 && yil%400==0)||(yil%4==0 && yil%100!=0)){
		    System.out.print(yil+ " bir artık yıldır.");
		    System.exit(0);
		}
		System.out.print(yil+" bir artık yıl değildir.");
	}
	
}            