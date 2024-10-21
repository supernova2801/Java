import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        // array are used to store multiple values in a single variable. All have tro be the same data type, no mixing for example: int with string.
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"}; 
        
        // variables in array can be substituded as shown below:

        cars[0] = "Mustang";

        // arrays start with 0, when pulling a variable, you must start at zero and go from there.

        System.out.println(cars[0]);

        // ALternate way to arrange arrays is to declare and array with how many variables you want within it. Then declare each variable with its corresponding array number.

        String[] vehicles = new String[4];

        vehicles[0] = "Car";
        vehicles[1] = "Boat";
        vehicles[2] = "Plane";
        vehicles[3] = "Helicoptor";

        System.out.println(vehicles[0]);
        System.out.println(vehicles[1]);
        System.out.println(vehicles[2]);
        System.out.println(vehicles[3]);

        // Using a for loop with arrays, declaring an integer than using thre for loop to incrementally increase to each value and print them.\

        for(int i = 0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}