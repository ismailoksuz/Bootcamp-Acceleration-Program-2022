/**
Java ile klavyeden girilen N tane sayma sayısından en büyük ve
en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz: ");
		int inp=scan.nextInt();
		int min=0;
		int max=0;
		int temp=0;
		for(int i=1;i<=inp;i++){
		    System.out.print(i+". Sayıyı giriniz: ");
		    temp=scan.nextInt();
		    if(i==1){
		        min=temp;
		        max=temp;
		    }
		    if(temp<min){
		        min=temp;
		    }
		    if(temp>max){
		        max=temp;
		    }
		}
		System.out.println("En büyük sayı: "+max);
		System.out.println("En küçük sayı: "+min);
	}
}

