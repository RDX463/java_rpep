import java.util.Scanner;

public class digitsofnumber {

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        
        int nod = 0;
        int temp = number;
        while(temp !=0){
            temp = temp / 10;
            nod++;
        }
        
        int div = (int)Math.pow(10,nod -1);
        while(div !=0){
            int quotient = number / div;
            System.out.println(quotient);
            
            number = number %div;
            div = div /10;
        }
        
        scn.close();
    }
}