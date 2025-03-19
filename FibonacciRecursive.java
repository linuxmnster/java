// f(x) = f(x - 1) + f(x + 1)
import java.util.Scanner;
class FibonacciRecursive{
    public static int fibonacci(int n){
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = num.nextInt();
        num.close();

        for(int i = 0; i < n; i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}