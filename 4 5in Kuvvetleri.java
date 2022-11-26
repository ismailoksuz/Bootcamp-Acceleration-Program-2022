/**
Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.print("Sayıyı giriniz:");
		int inp = scan.nextInt();
		System.out.println("\n"+inp+" sayısına kadar olan 4'ün kuvvetleri: ");
        for(int i=1;i<inp;i*=4){
            System.out.print(i+" ");
            
        }
        System.out.println("\n\n"+inp+" sayısına kadar olan 5'in kuvvetleri: ");
        for(int j=1;j<inp;j*=5){
            System.out.print(j+" ");
            
        }
		
	}
	
}

