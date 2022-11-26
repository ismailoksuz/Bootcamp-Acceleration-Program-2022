/**
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve 
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        int num=0;
        int sum=0;
        while(num%2!=1){
            num=getNum();
            sum+=isOk(num);
        }
        System.out.print("Çift ve 4'ün katları olarak girdiğiniz sayıların toplamı: "+sum);
		
	}
	public static int getNum(){
	    Scanner scan = new Scanner(System.in);
		System.out.print("Sayıyı giriniz:");
		return scan.nextInt();
	}
	public static int isOk (int i){
	    if(i%2==0 && i%4==0){
	        return i;
	    }
	    else{
	        return 0;
	    }
	}
}

