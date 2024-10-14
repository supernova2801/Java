import java.util.Random;

public class random{
    public static void main(String[] args){

        Random random = new Random();

       int x = random.nextInt(); // put the number of the max variable you want to be able to roll minus 1. add "+1+ outsode parenthesis to have number reach max number in parenthesis."
       Boolean a = random.nextBoolean();
       Double z = random.nextDouble();

        System.out.println(x);
        System.out.println(a);
        System.out.println(z);
    }
}