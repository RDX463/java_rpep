import java.util.Scanner;

public class anybasetodecimal {

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
    
    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int base = scn.nextInt();
        System.out.println(todec(number, base));
        scn.close();
    }
}