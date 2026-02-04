import java.util.Scanner;

public class decimaltoanybase {
    
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

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();
        System.out.println(dectoabase(number, base));
        scn.close();
    }
}