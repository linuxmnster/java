<<<<<<< HEAD
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Order : ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        System.out.println("Enter the elements of first " + n +"X" + n +" Matrix");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second " + n + "X" + n + " Matrix");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                for(int k = 0; k<n; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
=======
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Order : ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        System.out.println("Enter the elements of first " + n +"X" + n +" Matrix");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of second " + n + "X" + n + " Matrix");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                b[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                for(int k = 0; k<n; k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Result : ");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
>>>>>>> 77308f0c5c748b28b33a4723928c57b224b39788
