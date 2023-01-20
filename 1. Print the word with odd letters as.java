import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wrd = sc.nextLine();
        int len = wrd.length();
        for (int i = 0, j = len-1; i < len && j >= 0; i++, j--) {
            for (int k = 0; k < len; k++) {
                if (k == i) {
                    System.out.print(wrd.charAt(i));
                }
                else if (k == j) {
                    System.out.print(wrd.charAt(j));
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

// Sample Output

        /*
                p     m
                 r   a
                  o r
                   g
                  o r
                 r   a
                p     m

         */
