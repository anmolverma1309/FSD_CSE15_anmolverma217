import java.util.Scanner;

public class fcfs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        int[] burstTime = new int[n];
        int[] waitingTime = new int[n];
        int[] turnAroundTime = new int[n];

        System.out.println("\nEnter Burst Time for each process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Process P" + (i + 1) + ": ");
            burstTime[i] = sc.nextInt();
        }

        waitingTime[0] = 0;

        for (int i = 1; i < n; i++) {
            waitingTime[i] = waitingTime[i - 1] + burstTime[i - 1];
        }

        for (int i = 0; i < n; i++) {
            turnAroundTime[i] = waitingTime[i] + burstTime[i];
        }

        double totalWT = 0, totalTAT = 0;

        for (int i = 0; i < n; i++) {
            totalWT += waitingTime[i];
            totalTAT += turnAroundTime[i];
        }

        double avgWT = totalWT / n;
        double avgTAT = totalTAT / n;

        System.out.println("\n---------------------------------------------------");
        System.out.println("Process\tBurst Time\tWaiting Time\tTurnaround Time");
        System.out.println("---------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.println("P" + (i + 1) + "\t\t" + burstTime[i] +
                    "\t\t" + waitingTime[i] +
                    "\t\t" + turnAroundTime[i]);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("Average Waiting Time = %.2f\n", avgWT);
        System.out.printf("Average Turnaround Time = %.2f\n", avgTAT);

        sc.close();
    }
}/// fcfs code done successfully