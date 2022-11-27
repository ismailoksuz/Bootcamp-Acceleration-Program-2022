import java.util.Scanner;
    public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayıyı giriniz:  ");
        int inp = scan.nextInt();
        System.out.println(fibonacci(inp));
    }
    static int fibonacci(int x) {
        if (x==1 || x==2) {
            return 1;
        }
        return fibonacci(x-1)+fibonacci(x-2); 
    }
}
