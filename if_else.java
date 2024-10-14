import java.util.Scanner;

public class if_else{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Pick a random number: ");
        int x = scan.nextInt();

        if(x >= 5 && x <= 29){
            System.out.println("Not too bad");
        }
        else if (x >= 30 && x <= 99){
            System.out.println("Better");
        }
        else if(x >= 100 && x <= 999){
            System.out.print("Warmer");
        }
        else if(x >= 1000){
            System.out.println("Diablo");
        }
        else{
            System.out.println("Womp Womp");
        }

    }
}