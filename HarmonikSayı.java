import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Sayıyı giriniz:");
		int inp = scan.nextInt();
		double res=0;
		for(int i=1;i<=inp;i++){
		    res+=1.0/i;
		}
		System.out.print(res);
		
	}
}

