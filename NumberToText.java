import java.util.*;
public class NumberToText {

//Creates a public static variable containing
public static String [] singleDigitNames = {"zero","one","two","three","four","five","six","seven","eight","nine"};
public static String [] doubleDigitNames = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
public static String [] tensNames = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
public static String [] digitsNames = {"","","","hundred","thousand","million","billion","trillion","quadrillion","quintillion"};

    //Main Method
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        //Asks user for input
        System.out.println("What interger number do you wish to convert?");
        double numberInput = input.nextDouble();

        //does a variable to check the double place of numberInput
        double doubleNumber = numberInput / 10;
        double threeNumber = numberInput / 100;
        double fourNumber = numberInput / 1000;
        double fiveNumber = numberInput / 10000;

        //makes the input into a string
        String numberInputString = numberInput + "";
        int digitLength = numberInputString.length() - 2;

        //calls the correct method
        int y = 0;
            for (int x = digitLength; x != 0; x--) {
                if (x == 1 && y == 0) {
                    y = SingleDigit(numberInput);
                    break;
                } else {
                    y = AnyDigit(numberInput, x);
                }
            }
        }


    //Class for returning the single digit
    public static int SingleDigit(double numberInput){
        //makes a for loop to check what number it equals
        for(int i = 0; i<=numberInput; i++){
            if( i == (numberInput%10) ){
                System.out.print( singleDigitNames[i] );
                return 1;
            }
        }
        return 0;
    }

    //Class for returning the greater than 2 digit
    public static int AnyDigit(double numberInput,int digitLength){
        //makes a for loop to check what number it equals
        for(int i = 0; i<=numberInput; i++){
            if( i == (int)( numberInput/(Math.pow(10,digitLength-1)) ) ){
                if( i == 1 && digitLength == 2){
                    i = (int)numberInput%10;
                    System.out.print(tensNames[i]+" ");
                        return 1;
                }else if( digitLength == 2 ){
                    System.out.print(doubleDigitNames[i]+" ");
                    if(numberInput%10==0) {
                        return 1;
                    }else{
                        return 0;
                    }
                }else if(digitLength == 3){
                    System.out.print(singleDigitNames[i]+"  hundred ");
                    return 0;
                }
            }
        }
            return 0;
    }
}
