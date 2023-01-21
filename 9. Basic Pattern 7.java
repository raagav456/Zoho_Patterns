import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        char temp = 'a';
        boolean flag = false;
        for (int i = 1; i <= 26; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp++ + " ");
            }
            temp--;
            if (temp >= c) {
                flag= true;
            }
            if (flag) {
                break;
            }
            temp = 'a';
            System.out.println();
        }
    }
}

/* Sample input = z

   Sample Output

            a 
            a b 
            a b c 
            a b c d 
            a b c d e 
            a b c d e f 
            a b c d e f g 
            a b c d e f g h 
            a b c d e f g h i 
            a b c d e f g h i j 
            a b c d e f g h i j k 
            a b c d e f g h i j k l 
            a b c d e f g h i j k l m 
            a b c d e f g h i j k l m n 
            a b c d e f g h i j k l m n o 
            a b c d e f g h i j k l m n o p 
            a b c d e f g h i j k l m n o p q 
            a b c d e f g h i j k l m n o p q r 
            a b c d e f g h i j k l m n o p q r s 
            a b c d e f g h i j k l m n o p q r s t 
            a b c d e f g h i j k l m n o p q r s t u 
            a b c d e f g h i j k l m n o p q r s t u v 
            a b c d e f g h i j k l m n o p q r s t u v w 
            a b c d e f g h i j k l m n o p q r s t u v w x 
            a b c d e f g h i j k l m n o p q r s t u v w x y 
            a b c d e f g h i j k l m n o p q r s t u v w x y z 


 */
