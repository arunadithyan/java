package arun;

public class pattern {
    public static void main(String[] args) {
        pattern13(5);

    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     */
    static void pattern1(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    static void pattern2(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n - row - 1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
     */

    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
    1 2 3 4 5
    1 2 3 4
    1 2 3
    1 2
    1
     */
    static void pattern4(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     */
    static void pattern5(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= row; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     **
     ***
     ****
     *****

     */

    static void pattern7(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int k = row; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    /*
     *****
     ****
     ***
     **
     *
     */

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= row; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    /*
     *
     * *
     * * *
     * * * *
     * * * * *

     */

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col < row; col++) {
                System.out.print(" ");
            }
            for (int k = row; k <= n; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    /*
     * * * * *
     * * * *
     * * *
     * *
     *

     */

    static void pattern10(int n) {
        for (int row = 1; row <= 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= n - totalColsInRow; col++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= totalColsInRow; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

     */

   static void pattern11(int n){
     for (int row = 1; row <= n; row++) {
                for (int col = 1; col < row; col++) {
                    System.out.print(" ");
                }
                for (int col = row; col <= n; col++) {
                    System.out.print("* ");
                }
                System.out.println();
     }
            for (int row = n - 1; row >= 1; row--) {
                for (int col = 1; col < row; col++) {
                    System.out.print(" ");
                }
                for (int col = row; col <= n; col++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        /*
         * * * * *
          * * * *
           * * *
            * *
             *
            * *
           * * *
          * * * *
         * * * * *

         */
    static void pattern12(int n) {
        for (int row = 1; row <= n; row++) {
            // Print spaces
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            // Print first asterisk
            System.out.print("*");
            // Print inner spaces
            for (int space = 1; space <= 2 * row - 3; space++) {
                System.out.print(" ");
            }
            // Print last asterisk, if not the first row
            if (row > 1) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next row
        }
        // Print the bottom line of asterisks
        for (int col = 1; col <= 2 * n - 1; col++) {
            System.out.print("*");
        }
    }
    /*
         *
        * *
       *   *
      *     *
     *       *
     *********
  */
    static void pattern13(int n) {
        // Print the top line of asterisks
        for (int col = 1; col <= 2 * n - 1; col++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the pyramid shape
        for (int row = 1; row <= n - 1; row++) {
            // Print spaces
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }

            // Print first asterisk
            System.out.print("*");

            // Print inner spaces
            for (int space = 1; space <= 2 * (n - row) - 3; space++) {
                System.out.print(" ");
            }

            // Print last asterisk
            if (row < n - 1) {
                System.out.print("*");
            }

            System.out.println(); // Move to the next row
        }
    }
    /*
     *********
      *     *
       *   *
        * *
         *

     */











}



















