import java.util.Scanner;

public class anybaseadd {

    public static void main(String[] args) {
	
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int base = scn.nextInt();
        System.out.println(anybaseaddition(n1, n2, base));
        scn.close();
    }
    
    public static int anybaseaddition(int n1,int n2,int base){
        int rv =0;
        int count =0;
        int p = 1;
        while(n1>0 ||n2>0 ||count>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2 = n2/10;
            
            int d = d1+d2+count;
            count = d/base;
            d = d%base;
            
            rv += d*p;
            p *=10;
        }
        
        return rv;
    }
}