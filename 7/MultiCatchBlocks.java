public class MultiCatchBlocks {
    public static void main(String[] args){
        try{
            int a[] = new int[5];
            a[6] = 100;
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurs");
        }
        catch(Exception e){
            System.out.println("Parent Exception Occurs");
        }
    }
}
// aray index out of bounds exceptoin