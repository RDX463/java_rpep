import java.util.Scanner;

public class pattern18 {

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int str = n;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=sp;j++){
                System.out.print("\t");
            }
            for(int j = 1;j<=str;j++){
                if(i>1 && i<=n/2 && j>1 && j<str){
                    System.out.print("\t");
                }else{
                 System.out.print("*\t");   
                }
            }
            if(i<=n/2){
                sp++;
                str-=2;
            }else{
                sp--;
                str+=2;
            }
            System.out.println();
        }
        scn.close();
    }
}