import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        char temp = c;
        int l = 1;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= l; k++) {
                System.out.print(temp++ + " ");
            }
            l++;
            temp = c;
            System.out.println();
        }
    }
}

/* Sample Output

                 A
                A B
               A B C
              A B C D
             A B C D E

 */
