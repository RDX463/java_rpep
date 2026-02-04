import java.util.Scanner;

public class anybasetoanybase {
    

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int d = abtoab(number,b1,b2);
        System.out.println(d);
        scn.close();
    }
    
    public static int abtoab(int number,int b1,int b2){
        int dec = todec(number,b1);
        int dn = dectoabase(dec, b2);
        return dn;
    }
    
    public static int dectoabase(int number,int base){
        int rv = 0;
        int p = 1;
        while(number>0){
            int dig = number % base;
            number = number /base;
            rv += dig * p;
            p *=10;
        }
        return rv;
    }
    
    public static int todec(int number, int base){
        int rv = 0;
        int p = 1;
        while(number>0){
            int digi = number % 10;
            number = number /10;
            rv += digi * p;
            p = p *base;
        }
        return rv;
    }
}