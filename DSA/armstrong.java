public class armstrong {
    public static void Armstrong(int start, int end) {
        for (int i = start; i <= end; i++) {
            int num = i;
            int sum = 0;
            int count = 0;
            int temp = num;
            while (temp > 0) {
                count++;
                temp /= 10;
            }
            while (num > 0) {
                int dig = num % 10;
                sum += Math.pow(dig, count);
                num /= 10;
            }
            if (sum == i) {
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        Armstrong(1000, 9999);
    }
}