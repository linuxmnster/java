<<<<<<< HEAD
import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        String rev = new StringBuilder(str).reverse().toString();

        if(str == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
=======
import java.util.Scanner;

class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        sc.close();

        String rev = new StringBuilder(str).reverse().toString();

        if(str == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
>>>>>>> 77308f0c5c748b28b33a4723928c57b224b39788
}