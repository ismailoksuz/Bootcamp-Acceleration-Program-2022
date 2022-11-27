import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int inp=scan.nextInt();
        int start=2;
        System.out.print(inp+" "+(isPrime(inp,start) ? "asal sayıdır." : "asal değildir."));
    }
    static boolean isPrime (int x,int y){
        if(x<2){
            return false;
        }
        if(y<(x/2)+1){
            if(x%y==0){
                return false;
            }
            else{
                return isPrime(x,y+1);
            }
        }
        return true;
        
    }
    
}
