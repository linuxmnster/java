<<<<<<< HEAD
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 2; i < n; i++){
            if(n%i == 0){
                System.out.println(n + " Is Not a Prim Number");
                return;
            }
        }

        
        System.out.println(n+" Is a Prime Number");
    }
}
=======
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        sc.close();

        for(int i = 2; i < n; i++){
            if(n%i == 0){
                System.out.println(n + " Is Not a Prim Number");
                return;
            }
        }

        
        System.out.println(n+" Is a Prime Number");
    }
}
>>>>>>> 77308f0c5c748b28b33a4723928c57b224b39788
