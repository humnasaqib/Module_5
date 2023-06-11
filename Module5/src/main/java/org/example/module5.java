package org.example;

public class module5 {
  /*  public static void main(String[] args) {
        int n = 9;

        System.out.println(fibonacci(n));


    }

   */

    private static long fibonacciR(int n) {
        if (n <= 1) {
            return n;

        } else {

            return (fibonacciR(n - 1) + fibonacciR(n - 2));

        }
    }



    public static int fibonacciI(int n){
        if(n <= 1){
            return 1;
        }
        int r= 0,f=1,ff=1;
        for (int i =2; i <= n;i++){
            r = f + ff;
            ff = f;
            f = r;

        }
        return r;

    }


    public static void main(String[] args) {

        System.out.println("Recursive and itterative method");
        for (int n =0; n <= 40; n++){
            long StartR = System.nanoTime();
            long fibR = fibonacciR(n);
            long endR = System.nanoTime();
            long FIBRE = endR - StartR;



            long startI = System.nanoTime();
            int fibI = fibonacciI(n);
            long endI = System.nanoTime();
            long FIBIE = endI - startI;



            System.out.println(n + "\t| "+ FIBRE + " \t\t| " + FIBIE );

        }




    }


    }



