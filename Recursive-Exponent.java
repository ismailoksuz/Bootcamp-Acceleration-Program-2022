import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: ");
        int base=scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exp=scan.nextInt();
        int res=1;
        System.out.print("Sonuç: "+calculate(base,exp,res));
    }
    static int calculate (int base,int exp,int res){
        if(exp==0 && res==1){
            return 1;
        }
        res*=base;
        exp-=1;
        if(exp>0){
            return calculate(base,exp,res);
        }
        else return res;
        
    }
    
}
