import java.util.Scanner;

public class RecMethod{
    public static void beseklecikar(int number, int temp, boolean down){
        
        System.out.print(temp+" ");
        if(temp<=0){
            down=false;
        }
        int nextnumber= down ? temp-5 : temp+5;
        if(nextnumber<=number){
            beseklecikar(number, nextnumber, down);
        }
                      
    }
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int number=scan.nextInt();
        beseklecikar(number,number,true);
        
 
    }
}