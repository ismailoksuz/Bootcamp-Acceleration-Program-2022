/**
Java döngüler ile fibonacci serisi bulan program yazıyoruz.
Fibonacci serisinin eleman sayısını kullanıcıdan alın.

Fibonacci Serisi Nedir ?
Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı
dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın
oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana
gittikçe yaklaşan bir dizi elde edilir. Fibonacci dizisi, 0'dan başlar ve sonsuza kadar.
Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır.
Fibonacci dizisinin ilk on sayısı şu şekildedir:
9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
**/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Eleman sayısını giriniz: ");
	    int inp=scan.nextInt();
	    if(inp<0){
	        System.out.print("Geçersiz değer girdiniz.");
	        System.exit(0);
	    }
	    if(inp==0){
	        System.exit(0);
	    }
	    int sum=0;
	    int num=1;
	    int tmp=0;
	    for(int i=0;i<inp;i++){
	        tmp=sum;
	        sum+=num;
	        num=tmp;
	        System.out.println(num+" + "+sum+" = "+(sum+num));
	    }
	    
	}
}

