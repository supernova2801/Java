import java.util.Scanner;

public class Ex_2DArrays {
    public static void main(String[] args) {

        // 2D arrays are an array of arrays
        // second set of brackets is for how many arrays and ho0w much data they hold
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "Tesla";
        cars[1][0] = "BMW"; 
        cars[1][1] = "Mercedes";
        cars[1][2] = "F-150";
        cars[2][0] = "Charger";
        cars[2][1] = "Escalade";
        cars[2][2] = "DeLorean";

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            for(int j = 0; j < cars[i].length; j++){
                System.out.print(cars[i][j] + " ");
            }
        }

        System.out.println();

        // Alternate way to inout data into arrays, first row is row "0", with each variabkle hoolding its place in said array, next row is "1" , and after that is row "2".

        String[][] car = {
            {"Camaro","Corvette","Tesla"},
            {"BMW","Mercedes","F-150"},
            {"Charger","Escalade","DeLorean"}
        };
    }

}