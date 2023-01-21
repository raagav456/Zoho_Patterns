import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = sc.next().charAt(0);
        int l = 1;
        char temp = c;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= l; k++) {
                System.out.print(temp++ + " ");
            }
            temp--;
            for (int m = 1; m < l; m++) {
                System.out.print(--temp + " ");
            }
            temp = c;
            l++;
            System.out.println();
        }
    }
}

/* Sample Output

                 A 
                A B A 
               A B C B A 
              A B C D C B A 
             A B C D E D C B A 

 */
