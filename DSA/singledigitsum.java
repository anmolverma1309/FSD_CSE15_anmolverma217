package college;

import java.util.*;

public class singledigitsum {
    public static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter N number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter K numbers");
        int k = sc.nextInt();

        int res1 = sum(n);
        while (res1 > 9) {
            res1 = sum(res1);
        }
        int res = res1 * k;
        System.out.println("The final result is: " + res);

        sc.close();

    }

}
