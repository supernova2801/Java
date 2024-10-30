public class printf{
    public static void main(String[] args){

        //printf() = an optional method to control, format, anbd display text to ethe console window
        //two arguments = format string + (object/variable/value)
        // %[flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // Conversion-charater
        System.out.printf("%b",myBoolean);
        System.out.printf("%c",myChar);
        System.out.printf("%s",myString);
        System.out.printf("%d",myInt);
        System.out.printf("%f",myDouble);
        
        // Width : minimum number of characters to be written as output.
        System.out.printf("Hello %10s" ,myString);

        // Precision : sets number of digits of precision when outputting floating-point values
        System.out.printf(" You have this much money %.1f", myDouble);

        // [flags] adds an effect to output based on the flag added top format specifier
        /* 
         - : left-justify
         + : output a plus (+) or minus (-) sign for a numeric value
         0 : numeric values are zero-padded
         , : comma grouping separator if numbers > 1000
         */
    }

}