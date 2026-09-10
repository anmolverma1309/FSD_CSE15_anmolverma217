import java.util.*;

public class primeMultiplied {
    public static void prime(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> fin = new ArrayList<>();
        int i = 0;

        while (arr.size() < n) {
            boolean isprime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                arr.add(i);
            }
            i++;
        }
        for (int s = 1; s < arr.size(); s += 2) {
            fin.add(arr.get(s - 1));
            fin.add(arr.get(s));
            fin.add(arr.get(s) * arr.get(s - 1));
        }
        for (int z = 0; z < fin.size(); z++) {
            System.out.print(fin.get(z) + " ");
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        prime(n);

        sc.close();

    }
}