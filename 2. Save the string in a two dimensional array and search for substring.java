/* 
    Save the string “WELCOMETOZOHOCORPORATION” in a two dimensional array and search for substring like “too” in the two dimensional string both from left to right and from top to bottom.
    w	e	L	C	O
    M	E	T	O	Z
    O	H	O	C	O
    R	P	O	R	A
    T	I	O	n	  
    And print the start and ending index as
    Start index : <1,2>
    End index: <3, 2>
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wrd = sc.nextLine();
        char[][] arr = new char[5][5];
        int c = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                try {
                    arr[i][j] = wrd.charAt(c);
                    c++;
                }
                catch (Exception e) {

                }

            }
        }

        boolean flag = true;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 'T' || arr[i][j] == 't') {
                    if (i+2 <= 5) {
                        if ((arr[i+1][j] == 'O' || arr[i+1][j] == 'o') && (arr[i+2][j] == 'O' || arr[i+2][j] == 'o')){
                            System.out.println("Start index : <" + i + "," + j + ">" );
                            System.out.println("End index   : <" + (i+2) + "," + j + ">" );
                            flag = false;
                            break;
                        }
                        else if ((arr[i][j+1] == 'O' || arr[i][j+1] == 'o') && (arr[i][j+1] == 'O' || arr[i][j+2] == 'o')){
                            System.out.println("Start index : <" + i + "," + (j+2) + ">" );
                            System.out.println("End index   : <" + i + "," + (j+2) + ">" );
                            flag = false;
                            break;
                        }
                    }
                }
            }
            if (flag == false) {
                break;
            }
        }
    }
}
