import java.util.Scanner;

public class pattern16 {

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int str = 1;
        int sp = 2*n-3;
        
        for(int i = 1;i<=n;i++){
            int val = 1;
            for(int j = 1;j<=str;j++){
                System.out.print(val+"\t");
                val++;
            }
            for(int j = 1;j<=sp;j++){
                System.out.print("\t");
            }
            if(i==n){
                str--;
                val--;
            }
            for(int j = 1;j<=str;j++){
                val--;
                System.out.print(val+"\t");
            }
            str++;
            sp-=2;
            System.out.println();
        }
        scn.close();
    }
}