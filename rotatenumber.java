import java.util.*;

public class rotatenumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int temp = n;
        int numberofdigit = 0;
        while (temp > 0) {
            temp = temp / 10;
            numberofdigit++;
        }

        k = k % numberofdigit;
        if (k < 0) {
            k = k + numberofdigit;
        }

        int div = 1;
        int multi = 1;
        for (int i = 1; i <= numberofdigit; i++) {
            if (i <= k) {
                div = div * 10;
            } else {
                multi = multi * 10;
            }
        }
        int q = n / div;
        int r = n % div;
        int rotatenumber = r * multi + q;
        System.out.println(rotatenumber);
        scn.close();
    }
}
