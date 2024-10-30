/*  overloaded methods are methods that share the same name with different parameters. 
        method name + parameter = method signature

        you write these methods outside the main method, then you can create a print statement inside the main method that will match the method depending on the amount of arguments it contains.

*/


public class overloaded_methods{
    public static void main(String[] args){

// This is the statement tha will match the method depending on how many arguments you see. The data types have to match as well in order ofr it to work properly.
        int x = add(1,2);
        System.out.println(x);

        int z = add(1,2,3);
        System.out.println(z);


        int y = add(1,2,3,4);
        System.out.println(y);

        int w= add(1,2,3,4,5);
        System.out.println(w);

        double a= add(1.5,2.3,3.8,4.0,5.1);
        System.out.println(a);

        double b= add(1.5,2.3,3.8,4.0,5.1,6.9);
        System.out.println(b);




    }

    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a + b + c + d;
    }
    static int add(int a, int b, int c, int d, int e){
        System.out.println("This is overloaded method #4");
        return a + b + c + d + e;
    }
    static double add(double a, double b, double c, double d, double e){
        System.out.println("This is overloaded method #5");
        return a + b + c + d + e;
    
    }
    static double add(double a, double b, double c, double d, double e, double f){
        System.out.println("This is overloaded method #5");
        return a + b + c + d + e + f;
    
    }
}