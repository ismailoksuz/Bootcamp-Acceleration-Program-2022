/**
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir
program yazıyoruz. Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa
o kelime "Palindromik Kelime'dir".
Örnek : abba , asa , kavak, kayak
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    String yes="bir palindromik kelimedir.";
	    String no="bir Palindromik kelime değildir..";
	    System.out.print("Kelimeyi giriniz: ");
	    String str=scan.nextLine();
	    System.out.print(str +" " + (isPalindrome(str) ? yes : no));
        
	}
	public static boolean isPalindrome(String str){
	    String rev=reverseString(str);
	    for (int i = 0; i < str.length()/2+1; i++) {
            if(str.charAt(i)!=rev.charAt(i)){
                return false;
            }
        }
        return true;
	}
	public static String reverseString(String str){
	    char ch;
	    String rev="";
	    for (int i=0; i<str.length(); i++){
            ch= str.charAt(i);
            rev= ch+rev;
        }
        return rev;
	}
}

