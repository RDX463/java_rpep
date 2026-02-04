import java.util.Scanner;

public class anybasesubtract {

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int n1= scn.nextInt();
        int n2 = scn.nextInt();
        int base = scn.nextInt();
        System.out.println(anybasesub(n1, n2, base));
        scn.close();
    }
    
    public static int anybasesub(int n1,int n2, int base){
        int rv = 0;
        int borrow = 0;
        int p = 1;
        while(n1>0){
            int d1 =n1%10;
            n1 = n1/10;
            int d2 = n2%10;
            n2 = n2/10;
            
            int d = 0;
            d1 = d1+borrow;
            if(d1>=d2){
                borrow=0;
                d=d1-d2;
            }else{
                borrow = -1;
                d = d1+base-d2;
            }
            rv = rv + d*p;
            p*=10;
        }
        return rv;
    }
}