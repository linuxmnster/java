<<<<<<< HEAD
import java.util.Scanner;
import java.util.Arrays;

class SortNames{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        System.out.println("Enter the names : ");
        for(int i = 0; i <= n; i++){
            names[i] = sc.nextLine();
        }
        sc.close();
        Arrays.sort(names);
        
        System.out.println("Sorted Order : ");
        for(int i = 0; i< n; i++){
            System.out.println(names[i]);
        }
    }
=======
import java.util.Scanner;
import java.util.Arrays;

class SortNames{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        System.out.println("Enter the names : ");
        for(int i = 0; i <= n; i++){
            names[i] = sc.nextLine();
        }
        sc.close();
        Arrays.sort(names);
        
        System.out.println("Sorted Order : ");
        for(int i = 0; i< n; i++){
            System.out.println(names[i]);
        }
    }
>>>>>>> 77308f0c5c748b28b33a4723928c57b224b39788
}