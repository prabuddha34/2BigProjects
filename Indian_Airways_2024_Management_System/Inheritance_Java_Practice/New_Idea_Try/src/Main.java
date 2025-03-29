import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the M and N");
        int M = sc.nextInt();
        int N = sc.nextInt();
        int arr[][] = new int[M][N];

        if (!(M > 0 && M < 10) || !(N > 2 && N < 6)) {
            System.out.println("INVALID");
            return;
        }
        System.out.println("Enter the Elements From (0-7)");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j] < 0 || arr[i][j] >= 8) {
                    System.out.println("INVALID ");
                    return;
                }
            }
        }
        // Original Array
        System.out.println("Original Array:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < M; i++) {
            int s = 0;
            for (int j = 0; j < N; j++) {
                s = s + arr[i][j] * (int)(Math.pow(8, N - 1 - j));
            }
            System.out.print(s + " ");
        }
    }
}
