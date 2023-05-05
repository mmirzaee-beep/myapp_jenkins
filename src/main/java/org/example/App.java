package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    int num1=20;
    public static boolean isEvenNumber(int number){

        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }

    public static boolean isOddNumber(int number){

        boolean result = false;
        if(number%2 != 0){
            result = true;
        }
        return result;
    }

    public static int calculate(int x, int y){

        //int result = x + y;
        return x+y;

    }

    public static void main( String[] args )
    {
        System.out.println( "Hello  World!" );
    }
}
