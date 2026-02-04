import java.util.Scanner;

public class digitfrequency {
    
    public static int digifreq(int number,int count_number){
        int count = 0;
        while(number>0){
            int dig = number%10;
            number = number/10;
            
            if(dig == count_number){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int count_number = scn.nextInt();
        int digifreq =digifreq(number, count_number);
        System.out.println(digifreq);
        scn.close();
    }
}