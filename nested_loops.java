import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args) {

        //nested loops are a loop inside a loop

        Scanner scan = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";

        System.out.println("Enter # of rows: ");
        rows = scan.nextInt();

        System.out.println("Enter # of columns: ");
        columns = scan.nextInt();

        System.out.println("Enter symbol to use");
        symbol = scan.next();

        for(int i = 1; i <=rows; i++) {
            System.out.println();
            for(int j = 1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
        System.out.println();
    }
}