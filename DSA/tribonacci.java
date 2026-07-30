public class tribonacci {
    public static int findtribonacci(int n) {
        if (n == 2 || n == 1 || n == 0) {
            return 1;
        }
        return findtribonacci(n - 1) + findtribonacci(n - 2) + findtribonacci(n - 3);
    }

    public static void main(String[] args) {
        int n = 100;

        System.out.print(findtribonacci(n) + " ");

    }

}
