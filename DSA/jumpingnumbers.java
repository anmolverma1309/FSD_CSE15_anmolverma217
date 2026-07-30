import java.util.*;

public class jumpingnumbers {
    public static void jumping(int n) {
        int diff = 0;
        int temp = n;
        while (temp > 0) {
            int dig = temp % 10;
            temp /= 10;
            int dig2 = temp % 10;
            temp /= 10;
            if (dig2 - dig == 1 || dig - dig2 == 1) {
                diff = 1;
            } else {
                diff = 0;
                break;
            }
        }
        if (n < 10) {
            System.out.println(n);
        } else if (diff == 1) {
            System.out.println(n);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number you want to check: ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            jumping(i);
        }
        sc.close();

    }

}
