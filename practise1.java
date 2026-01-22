import java.util.Scanner;

public class practise1 {

    public static void main(String[] args) {
	
        Scanner scn= new Scanner(System.in); 
        int a = scn.nextInt();
        
        for(int i = 1; i<= a;i++){
            System.out.println(i+"\n");
        }
        scn.close();
    }
}