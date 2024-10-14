import java.util.Scanner;
public class math{
    public static void main(String[] args){

        double x = 3.14;
        double y = 10;

        double z = Math.max(x,y); // shows which is greater
        double w = Math.abs(y); // shows the absolute variable
        double v = Math.sqrt(y); // finds the square root
        double u = Math.round(x); // rounds the number
        double t = Math.ceil(x); // rounds up
        double s = Math.floor(x); // rounds down
        
        System.out.println(s);
        System.out.println(t);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
        System.out.println(z);

        // finding the hypotenuse of triangle below:
        Scanner scan = new Scanner(System.in); // creates scanner
        
        System.out.println("Below is the hypotenuse of a triangle");

        double a;
        double b;
        double c;


        System.out.println("Enter side a");
        a = scan.nextDouble(); // lets user inout double variable
        System.out.println("Enter side b");
        b = scan.nextDouble();

       c =  Math.sqrt((a*a)+(b*b)); // the formula is square root of "a^2 + b^2"
       System.out.println("The hypotenuse is: " + c);
    }
}