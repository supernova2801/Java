import java.util.Scanner;

public class lesson1_practice {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /* #1:  Output formatted text to console.
        a) Output the output example text exactly as it appears below.
        Use at least one instance of newline, and tab syntax.
        Output Example
        Course Description:
        ET-581 Class Schedule:
        Time Location
        ------- -------
        9:00 AM Room T18 */ 

        System.out.println("\nCourse Description:\n\n" + "ET-581\t\tClass Schedule:\n\n" + "Time\t\tLocation\n" + "-------\t\t-------\n" + "9:00 AM\t\tRoom T18\n\n");

        /* #2: Assign and output the values of three string variables.
        a) Assign your first and last name to string variables named
        firstname and lastname.
        b) Assign your college major to a string variable named major.
        c) Output the value of these variables as part of the phrase “My
        name is X Y and my major is Z” as displayed in the output
        example.*/

        String a = "Jayden";
        String b = "Novas";
        String c = "Cybersecurity";
        System.out.println("My name is " + a + " " + b + " my major is " + c);

        /* #3:  Create a program that produces the output below. Use a
        different and appropriate variable type to accept input for
        each question. Line and character spacing should be
        identical to the output example.
        Output Example
        What is your name? Joe
        What is your gender (M/F)? M
        What is your age? 22
        Is today a Friday (true/false)? true
        What is your GPA? 2.5
        You answered:
        Joe, M, 22, true, 2.5 */

        System.out.println("What is your name?");
        String q = scan.nextLine();

        System.out.println("What is your gender (M/F?");
        char gen = scan.next().charAt(0);

        System.out.println("What is your age?");
        int age = scan.nextInt();

        System.out.println("Is today Friday? (True or False)");
        boolean day = scan.nextBoolean();

        System.out.println("What is your GPA?");
        double g = scan.nextDouble();

        System.out.println("You answered:" + q + ", " + gen + ", " + age + ", " + day + ", " + g);

        // #4: Write a program that outputs the area of a rectangle. Request the value of length and width from the user.

        System.out.println("Input the length");
        int l = scan.nextInt();

        System.out.println("Input the width");
        int w = scan.nextInt();

        int s = w * l;

        System.out.println("The area of the rectangle is: " + s + "in ");

        /* #5 Write a program that accepts any floating point value as
        input, and then outputs the integer portion of the number.
        6. Write a program that accepts any floating point value as
        input, and then outputs the decimal portion of the number. */

        System.out.println("Pick a number");
        double f = scan.nextDouble();
        int i = (int) f;
        double h = f - i;

        System.out.println("Integer portion is: " + i);
        System.out.println("Decimal portion is: " + h);

        scan.close();


        
    }
}