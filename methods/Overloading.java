<<<<<<< HEAD
package methods;
class DisplayOverloading{
    int add (int a, int b){
        return a+b;
    }

    int add (int a, int b, int c){
        return a+b+c;
    }
}

class Overloading{
    public static void main(String[] args){
        DisplayOverloading obj = new DisplayOverloading();

        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1, 2, 3));
    }
}

=======
package methods;
class DisplayOverloading{
    int add (int a, int b){
        return a+b;
    }

    int add (int a, int b, int c){
        return a+b+c;
    }
}

class Overloading{
    public static void main(String[] args){
        DisplayOverloading obj = new DisplayOverloading();

        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1, 2, 3));
    }
}

>>>>>>> 77308f0c5c748b28b33a4723928c57b224b39788
// method overloading same method name but different functionality