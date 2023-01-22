import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n*2 - 2;
        int n1 = n;
        int[][] arr = new int[n*2 -1][n*2 - 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n1*2 - 1; j++) {

                // Top
                arr[i][i+j] = n1;
                // Bottom
                arr[c][i+j] = n1;

                // Left Corner
                arr[i+j][i] = n1;
                // Right Corner
                arr[i+j][c] = n1;

            }
            n1--;
            c--;
        }
    }
}

/* Sample input = 4

   Sample Output

            4444444
            4333334
            4322234
            4321234
            4322234
            4333334
            4444444

 */
