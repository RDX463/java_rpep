import java.util.Scanner;

public class uinput {

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        String name = scn.nextLine();
        System.out.println("Hello "+ name);
        for(int i = 1; i<=n;i++){
            System.out.println(i);
        }
        scn.close();
    }
}