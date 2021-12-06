import java.util.Scanner;

public class Main{
    static int exponentiation(int base, int exp){
        if (exp==0)
        return 1;
        else if(base==1)
        return 1;
        else
        return base*exponentiation(base, exp-1);


    }
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base=scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exp=scan.nextInt();

        System.out.println("Sonuç: "+ exponentiation(base, exp));
    }
}