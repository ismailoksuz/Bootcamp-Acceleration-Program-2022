/**
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
		System.out.print("Basamak sayısını giriniz: ");
		int n=scan.nextInt();
		ucgen(n/2);
		tersucgen(n/2+1);
		
		
	}
	public static void ucgen(int n){
	    for (int i = 0; i <n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
    	}
	}
	public static void tersucgen(int inp){
	    int fls=2*inp-1;
		int bnk=0;
	    for(int i=0;i<inp;i++){
		    for(int j=0;j<bnk;j++){
		        System.out.print(" ");
		    }
		    for(int m=0;m<fls;m++){
		        System.out.print("*");
		    }
		    for(int k=0;k<bnk;k++){
		        System.out.print(" ");
		    }
		    System.out.println();
		    bnk+=1;
		    fls-=2;
		}
	}
}

