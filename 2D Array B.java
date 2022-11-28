/**
Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
**/
public class Main
{
	public static void main(String[] args) {
	    String[][] letter = new String[7][5];
	    for(int i=0;i<letter.length;i++){
	        for(int j=0;j<letter[i].length;j++){
	            if(i%3==0){
	                System.out.print("*");
	            }
	            else{
	                if(j%4==0){
	                    System.out.print("*");
	                }
	                else{
	                    System.out.print(" ");
	                }
	            }
	            
	        }
	        System.out.println("");
	    }
	}
	
}

