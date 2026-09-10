import java.util.*;

public class position {
    public static void findPosition(int[] arr, int n) {
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    count++;
                }
            }
            ans[i] = count + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        System.out.println("enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        findPosition(arr, n);

    }

}
