import java.util.Scanner;

public class FibonacciIterative{
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = num.nextInt();
        num.close();

        int first = 0;
        int second = 1;
        System.out.print("series : "+first+" "+second);

        for(int i = 2; i < n; i++){
            int next = first + second;
            System.out.print(next);
            first = second;
            second = next;
        }
    }
}