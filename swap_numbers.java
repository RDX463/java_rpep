//import javax.sound.midi.SysexMessage;

public class swap_numbers {

    public static void main(String[] args) {
	
        int a = 2;
        int b =5;
        int c=a;
        int temp = b;
        b = c;
        a = temp;
        
        System.out.println("a = " + a + ", b = " + b);
    }
}