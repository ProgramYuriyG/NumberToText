import java.math.BigInteger;
import java.util.*;
public class NumberToText {

//Creates a public static variable containing
public static String [] singleDigitNames = {"zero","one","two","three","four","five","six","seven","eight","nine"};
public static String [] doubleDigitNames = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
public static String [] tensNames = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
public static String [] digitsNames = {"","","","hundred","thousand","million","billion","trillion","quadrillion","quintillion"};

    //Main Method
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        //Asks user for input
        System.out.println("What interger number do you wish to convert?");
        int numberInput = input.nextInt();

        //does a variable to check the double place of numberInput
        int doubleNumber = numberInput/10;
        int threeNumber = numberInput/100;

        //makes the input into a string
        String numberInputString = numberInput +"";
        int digitLength = numberInputString.length();

        //calls the correct method
            //if the number is greater than 2 digits
        if(numberInputString.length() > 2){
        System.out.print(singleDigitNames[threeNumber]);
        System.out.print(" " + digitsNames[digitLength]+" ");
        DoubleDigit(numberInput%100);
        System.out.print(" ");
        SingleDigit(numberInput%10);

        }
            //if the number is double digit
        if(numberInputString.length() == 2){
            DoubleDigit(numberInput);
            System.out.print(" ");
            if(doubleNumber == 1) {
            }else{
                SingleDigit(numberInput);
            }
        }
            //if the number is single digit
        if( numberInputString.length() == 1 ){
            SingleDigit(numberInput);
        }

    }

    //Class for returning the single digit
    public static void SingleDigit(int numberInput){
        //makes a for loop to check what number it equals
        for(int i = 0; i<=numberInput; i++){
            if(i==(numberInput%10)){
                System.out.print( singleDigitNames[i] );
                break;
            }
        }

    }

    //Class for returning the double digit
    public static void DoubleDigit(int numberInput){
        //makes a for loop to check what number it equals
        for(int i = 0; i<=numberInput; i++){
            if(i==(numberInput/10)){
                if( i== 1){
                    i = numberInput%10;
                    System.out.print(tensNames[i]);
                    break;
                }else {
                    System.out.print(doubleDigitNames[i]);
                    break;
                }
            }
        }

    }

}
