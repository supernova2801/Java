// An for_loop executes a block of code a limited amount of times.

public class for_loop{
    public static void main(String[] args){

        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();
        
    // shows a for loop counting from 10 to zero
        for(int l = 10; l >= 0; l--) {   // can decrement is from other variable by doing "l-=2" for examp[le. can substiute "2" for any number desired.
            System.out.println(l);
        }
        System.out.println("Happy new Year!");
    }
}