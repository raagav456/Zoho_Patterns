import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        char temp = c;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp++);
            }
            temp = c;
            System.out.println();
        }
    }
}

/* Sample Output

             A
             AB
             ABC
             ABCD
             ABCDE

 */
