import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i1,i2,i3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Karşılaştırmak istediğiniz 3 sayıyı girin:");
		i1=scan.nextInt();
		i2=scan.nextInt();
		i3=scan.nextInt();
		if(i1==i2||i1==i3||i2==i3){
		    System.out.print("Girdiğiniz sayılardan en az 2 tanesi eşit olduğu için program sonlandırıldı.");
		    System.exit(0);
		}
		if(i1>i2&&i1>i3){
		    if(i2>i3)System.out.print(i3+"<"+i2+"<"+i1);
		    else System.out.print(i2+"<"+i3+"<"+i1);
		}
		else if(i2>i1&&i2>i3){
		    if(i1>i3)System.out.print(i3+"<"+i1+"<"+i2);
		    else System.out.print(i1+"<"+i3+"<"+i2);
		}
		else{
		    if(i1>i2)System.out.print(i2+"<"+i1+"<"+i3);
		    else System.out.print(i1+"<"+i2+"<"+i3);
		}
	}
	
}            