import java.util.Scanner;

public class inverseofnumber {

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int inv = 0;
        int orignal_place = 1;
        while(n!=0){
            int orignal_digit = n %10;
            int inverse_digit = orignal_place;
            int inverse_place = orignal_digit;
            
            // make changes to inv using inverse postion and inverse digit
            inv = inv + inverse_digit*(int)Math.pow(10,inverse_place-1);
            
            n = n/10;
            orignal_place++;
        }
        System.out.println(inv);
        scn.close();
    }
}