import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    String errormsg="Hatalı Veri Girdiniz !";
	    Scanner scan=new Scanner(System.in);
	    int distance,age,type;
	    System.out.print("Mesafeyi km türünden giriniz :");
	    distance=scan.nextInt();
	    System.out.print("Yaşınızı giriniz :");
	    age=scan.nextInt();
	    System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
	    type=scan.nextInt();
	    if(isValid(distance,age,type)==false){
	        System.out.println(errormsg);
	        System.exit(0);
	    }
	    System.out.println("Toplam Tutar: "+calculatePrice(distance,age,type));

	}
	public static boolean isValid (int distance,int age, int type){
	    if(age<0 && distance<0 && (type!=1 || type !=2)){
	        return false;
	    }
	    else{
	        return true;
	    }
	}
	
	public static double calculatePrice (int distance,int age, int type){
	    double baseprice = checkAgeDiscount(age,distance/10);
	    if(type==2){
	        return baseprice*0.8;
	    }
	    return baseprice;
	    
	}
	public static double checkAgeDiscount(int age,double baseprice){
	    if(age<12){
	        return baseprice*0.5;
	    }
	    else if(age>=12 && age <=24){
	        return baseprice*0.9;
	    }
	    else if(age>65){
	        return baseprice*0.7;
	    }
	    else{
	        return baseprice;
	    }
	}
}

