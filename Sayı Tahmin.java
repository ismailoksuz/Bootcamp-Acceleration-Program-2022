/**
Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin
etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.
**/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String msg1="Hatalı bir değer girdiniz. ";
	    String msg2="Bir daha hatalı girişinizde hakkınızdan düşülecektir. ";
	    String msg3="Kalan hakkınız: ";
	    String msg4="Lütfen 0-100 arasında bir değer giriniz. ";
	    String msg5="Tahmininizi giriniz: ";
	    String msg6=" sayısı, gizli sayıdan büyüktür. ";
	    String msg7=" sayısı, gizli sayıdan küçüktür. ";
	    String msg8="Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : ";
	    String msg9="Kaybettiniz! ";
	    int[] wrong = new int[5];
	    Scanner scan=new Scanner(System.in);
	    int num = (int) (Math.random() * 100);
	    System.out.print(num+"\n");
		System.out.print(msg5);
		int guess=scan.nextInt();
		if(guess!=num){
		    int right=5;
		    if(guess>=100 || guess<0){
		        System.out.println(msg4+msg2);
		    }
		    else{
		        wrong[5-right] = guess;
		        right-=1;
		        System.out.println(msg1);
		        if(guess>num){
		            System.out.println(guess+msg6);
		        }
		        if(guess<num){
		            System.out.println(guess+msg7);
		        }
		        System.out.println(msg3+right);
		        
		    }
		    while(guess!=num && right>0){
		        System.out.print(msg5);
		        guess=scan.nextInt();
		        if(guess>num){
		            wrong[5-right] = guess;
		            right-=1;
		            System.out.println(guess+msg6);
		            System.out.println(msg3+right);
		        }
		        else if(guess<num){
		            wrong[5-right] = guess;
		            right-=1;
		            System.out.println(guess+msg7);
		            System.out.println(msg3+right);
		        }
		        else{
		            System.out.println(msg8+num);
		        }
		        
		    }
		    if(right<=0){
		        System.out.println(msg9+"\nTahminleriniz: "+Arrays.toString(wrong));
		    }
		}
		else{
		    System.out.println(msg8+num);
		}
		
	}
}

