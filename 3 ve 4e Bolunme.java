/**
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 
3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.print("Sayıyı giriniz:");
		int inp = scan.nextInt();
		int sum,cnt;
		sum=cnt=0;
		for(int i=1;i<=inp;i++){
		    if(i%3==0 && i%4==0){
		        sum+=i;
		        cnt+=1;
		        System.out.println("Şartı sağlayan "+cnt+". sayı= "+i);
		    }
		}
		System.out.println("\nToplam "+cnt+" sayı şartı sağlamıştır.\nŞartı sağlayan sayıların toplamı: "+sum);
		System.out.print("Bu sayıların ortalaması ("+sum+"/"+cnt+") = "+(sum/cnt));
		
	}
}

